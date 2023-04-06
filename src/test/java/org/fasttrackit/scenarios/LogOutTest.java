package org.fasttrackit.scenarios;

import org.fasttrackit.Account;
import org.fasttrackit.body.Header;
import org.fasttrackit.body.Modal;
import org.fasttrackit.config.TestConfiguration;
import org.fasttrackit.dataprovider.LoginDataProvider;
import org.fasttrackit.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LogOutTest extends TestConfiguration {

    HomePage homePage = new HomePage();

    @Test(testName = "User can log out after log in with valid username and valid password.",
            description = "This test verify if user can log out after login with valid username (dino,beetle and turtle) and valid password (choochoo).",
            dataProvider = "LoginDataProvider", dataProviderClass = LoginDataProvider.class)
    public void userCanLoginWithValidUsersAndLogOut(Account account) {
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsNotDisplayed(), "Expected Modal to be closed.");
        Header header = new Header(account.getUsername());
        assertEquals(header.getGreetingsMessage(), account.getGreetingsMsg(), "Expected message to be Hi " + account.getUsername() + "!");
        homePage.logUserOut();
        assertEquals(header.getGreetingsMessage(), "Hello guest!", "Expected greetings message to be : Hello guest!");
        homePage.clickOnTheLogoButton();
    }


}
