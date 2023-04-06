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

public class LogInTest extends TestConfiguration {

    HomePage homePage = new HomePage();


    @Test(testName = "User can login with valid username and valid password.",
            description = "This test verify if user can login with valid username (dino,beetle and turtle) and valid password (choochoo).",
            dataProvider = "LoginDataProvider", dataProviderClass = LoginDataProvider.class)
    public void userCanLoginWithValidUsers(Account account) {
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsNotDisplayed(), "Expected Modal to be closed.");
        Header header = new Header(account.getUsername());
        assertEquals(header.getGreetingsMessage(), account.getGreetingsMsg(), "Expected message to be Hi " + account.getUsername() + "!");
        homePage.logUserOut();
    }

    @Test(testName = "User can't login with locked user.",
            description = "This test verify if user can't login with locked user.")
    public void userCantLoginWithLockedUser() {
        Account account = new Account("locked", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsDisplayed(), "Expected Modal to remain open.");
        assertTrue(modal.validateErrorMsgIsDisplayed(), "Expected The user has been locked out. to be displayed.");
        modal.clickOnTheCloseButton();
    }

    @Test(testName = "User can't login with no username and no password.",
            description = "This test verify if user can't login with no username and no password.")
    public void userCantLoginWithNoUsernameAndNoPassword() {
        Account account = new Account("", "");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsDisplayed(), "Expected Modal to remain open.");
        assertTrue(modal.validateErrorMsgIsDisplayed(), "Expected Please fill in the username! to be displayed.");

        modal.clickOnTheCloseButton();
    }

    @Test(testName = "User can't login with valid username and no password.",
            description = "This test verify if user can't login with valid username and no password.")
    public void userCantLoginWithValidUsernameAndNoPassword() {
        Account account = new Account("dino", "");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsDisplayed(), "Expected Modal to remain open.");
        assertTrue(modal.validateErrorMsgIsDisplayed(), "Expected Please fill in the password! to be displayed.");
        modal.clickOnTheCloseButton();
    }

    @Test(testName = "User can't login with no username and valid password.",
            description = "This test verify if user can't login with no username and valid password.")
    public void userCantLoginWithNoUsernameAndValidPassword() {
        Account account = new Account("", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsDisplayed(), "Expected Modal to remain open.");
        assertTrue(modal.validateErrorMsgIsDisplayed(), "Expected Please fill in the username! to be displayed.");
        modal.clickOnTheCloseButton();
    }

    @Test(testName = "User can't login with wrong username and wrong password.",
            description = "This test verify if user can't login with wrong username and wrong password.")
    public void userCantLoginWithWrongUsernameAndWrongPassword() {
        Account account = new Account("dno", "choochoos");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsDisplayed(), "Expected Modal to remain open.");
        assertTrue(modal.validateErrorMsgIsDisplayed(), "Expected Incorrect username or password! to be displayed.");
        modal.clickOnTheCloseButton();
    }

    @Test(testName = "User can't login with valid username and wrong password.",
            description = "This test verify if user can't login with valid username and wrong password.")
    public void userCantLoginWithValidUsernameAndWrongPassword() {
        Account account = new Account("dino", "choochoos");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsDisplayed(), "Expected Modal to remain open.");
        assertTrue(modal.validateErrorMsgIsDisplayed(), "Expected Incorrect username or password! to be displayed.");
        modal.clickOnTheCloseButton();
    }

    @Test(testName = "User can't login with wrong username and valid password.",
            description = "This test verify if user can't login with wrong username and valid password.")
    public void userCantLoginWithWrongUsernameAndValidPassword() {
        Account account = new Account("dno", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsDisplayed(), "Expected Modal to remain open.");
        assertTrue(modal.validateErrorMsgIsDisplayed(), "Expected Incorrect username or password! to be displayed.");
        modal.clickOnTheCloseButton();
    }

    @Test(testName = "User can't login with wrong username and no password.",
            description = "This test verify if user can't login with wrong username and no password.")
    public void userCantLoginWithWrongUsernameAndNoPassword() {
        Account account = new Account("dno", "");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsDisplayed(), "Expected Modal to remain open.");
        assertTrue(modal.validateErrorMsgIsDisplayed(), "Expected Please fill in the password! to be displayed.");
        modal.clickOnTheCloseButton();
    }

    @Test(testName = "User can't login with no username and wrong password.",
            description = "This test verify if user can't login with no username and wrong password.")
    public void userCantLoginWithNoUsernameAndWrongPassword() {
        Account account = new Account("", "choochoa");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsDisplayed(), "Expected Modal to remain open.");
        assertTrue(modal.validateErrorMsgIsDisplayed(), "Expected Please fill in the username! to be displayed.");
        modal.clickOnTheCloseButton();
    }


}
