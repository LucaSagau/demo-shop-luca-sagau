package org.fasttrackit.scenarios;

import org.fasttrackit.Account;
import org.fasttrackit.body.Header;
import org.fasttrackit.body.Modal;
import org.fasttrackit.config.TestConfiguration;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LogInFromWishlistPageWithValidUserTest extends TestConfiguration {

    HomePage homePage = new HomePage();

    @Test(testName = "Verify user dino can login from wishlist page.",
            description = "This test verify if user dino can login from wishlist page.")
    public void verifyIfDinoUserCanLogInFromWishlistPage() {
        Product product0 = new Product("0");
        product0.addToFavorite();
        homePage.clickOnTheWishlistIcon();
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
    }

    @Test(testName = "Verify user beetle can login from wishlist page.",
            description = "This test verify if user beetle can login from wishlist page.")
    public void verifyIfBeetleUserCanLogInFromWishlistPage() {
        Product product3 = new Product("3");
        product3.addToFavorite();
        homePage.clickOnTheWishlistIcon();
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
    }

    @Test(testName = "Verify user turtle can login from wishlist page.",
            description = "This test verify if user turtle can login from wishlist page.")
    public void verifyIfTurtleUserCanLogInFromWishlistPage() {
        Product product4 = new Product("4");
        product4.addToFavorite();
        homePage.clickOnTheWishlistIcon();
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
    }





}
