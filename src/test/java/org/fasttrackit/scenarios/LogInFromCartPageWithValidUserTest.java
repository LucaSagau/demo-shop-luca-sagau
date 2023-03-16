package org.fasttrackit.scenarios;

import org.fasttrackit.Account;
import org.fasttrackit.body.Header;
import org.fasttrackit.body.Modal;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LogInFromCartPageWithValidUserTest {


    HomePage homePage = new HomePage();

    @Test
    public void verifyIfDinoUserCanLogInFromCartPage() {
        Product product5 = new Product("5");
        product5.addToBasket();
        homePage.clickOnTheCartIcon();
        Account account = new Account("dino", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsNotDisplayed(), "Expected Modal to be closed.");
        Header header = new Header(account.getUsername());
        assertEquals(header.getGreetingsMessage(), account.getGreetingsMsg(), "Expected message to be Hi " + account.getUsername() + "!");
        homePage.logUserOut();
        homePage.resetPage();
    }

    @Test
    public void verifyIfBeetleUserCanLogInFromCartPage() {
        Product product6 = new Product("6");
        product6.addToBasket();
        homePage.clickOnTheCartIcon();
        Account account = new Account("beetle", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsNotDisplayed(), "Expected Modal to be closed.");
        Header header = new Header(account.getUsername());
        assertEquals(header.getGreetingsMessage(), account.getGreetingsMsg(), "Expected message to be Hi " + account.getUsername() + "!");
        homePage.logUserOut();
        homePage.resetPage();
    }

    @Test
    public void verifyIfTurtleUserCanLogInFromCartPage() {
        Product product4 = new Product("4");
        product4.addToBasket();
        homePage.clickOnTheCartIcon();
        Account account = new Account("turtle", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsNotDisplayed(), "Expected Modal to be closed.");
        Header header = new Header(account.getUsername());
        assertEquals(header.getGreetingsMessage(), account.getGreetingsMsg(), "Expected message to be Hi " + account.getUsername() + "!");
        homePage.logUserOut();
        homePage.resetPage();
    }

}
