package org.fasttrackit.scenarios;

import org.fasttrackit.Account;
import org.fasttrackit.body.Modal;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UserBeetleTest {

    HomePage homePage = new HomePage();

    @AfterMethod
    public void setup() {
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify user beetle can add product zero in cart.",
            description = "This test verify if user beetle can add product zero in cart.")
    public void userBeetleCanAddProductZeroInCart() {
        Account account = new Account("beetle", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertEquals("1", cartPage.verifyNumberOfProductsInBasket(), "Expected number of products in cart to be 1.");
    }

    @Test(testName = "Verify user beetle can add product one in cart.",
            description = "This test verify if user beetle can add product one in cart.")
    public void userBeetleCanAddProductOneInCart() {
        Account account = new Account("beetle", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertEquals("1", cartPage.verifyNumberOfProductsInBasket(), "Expected number of products in cart to be 1.");
    }

    @Test(testName = "Verify user beetle can add product two in cart.",
            description = "This test verify if user beetle can add product two in cart.")
    public void userBeetleCanAddProductTwoInCart() {
        Account account = new Account("beetle", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertEquals("1", cartPage.verifyNumberOfProductsInBasket(), "Expected number of products in cart to be 1.");
    }

    @Test(testName = "Verify user beetle can add product three in cart.",
            description = "This test verify if user beetle can add product three in cart.")
    public void userBeetleCanAddProductThreeInCart() {
        Account account = new Account("beetle", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product3 = new Product("3");
        product3.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertEquals("1", cartPage.verifyNumberOfProductsInBasket(), "Expected number of products in cart to be 1.");
    }

    @Test(testName = "Verify user beetle can add product four in cart.",
            description = "This test verify if user beetle can add product four in cart.")
    public void userBeetleCanAddProductFourInCart() {
        Account account = new Account("beetle", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product4 = new Product("4");
        product4.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertEquals("1", cartPage.verifyNumberOfProductsInBasket(), "Expected number of products in cart to be 1.");
    }

    @Test(testName = "Verify user beetle can add product Five in cart.",
            description = "This test verify if user beetle can add product Five in cart.")
    public void userBeetleCanAddProductFiveInCart() {
        Account account = new Account("beetle", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product5 = new Product("5");
        product5.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertEquals("1", cartPage.verifyNumberOfProductsInBasket(), "Expected number of products in cart to be 1.");
    }

    @Test(testName = "Verify user beetle can add product six in cart.",
            description = "This test verify if user beetle can add product six in cart.")
    public void userBeetleCanAddProductSixInCart() {
        Account account = new Account("beetle", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product6 = new Product("6");
        product6.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertEquals("1", cartPage.verifyNumberOfProductsInBasket(), "Expected number of products in cart to be 1.");
    }

    @Test(testName = "Verify user beetle can add product seven in cart.",
            description = "This test verify if user beetle can add product seven in cart.")
    public void userBeetleCanAddProductSevenInCart() {
        Account account = new Account("beetle", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product7 = new Product("7");
        product7.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertEquals("1", cartPage.verifyNumberOfProductsInBasket(), "Expected number of products in cart to be 1.");
    }

    @Test(testName = "Verify user beetle can add product eight in cart.",
            description = "This test verify if user beetle can add product eight in cart.")
    public void userBeetleCanAddProductEightInCart() {
        Account account = new Account("beetle", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product8 = new Product("8");
        product8.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertEquals("1", cartPage.verifyNumberOfProductsInBasket(), "Expected number of products in cart to be 1.");
    }

    @Test(testName = "Verify user beetle can add product nine in cart.",
            description = "This test verify if user beetle can add product nine in cart.")
    public void userBeetleCanAddProductNineInCart() {
        Account account = new Account("beetle", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product9 = new Product("9");
        product9.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertEquals("1", cartPage.verifyNumberOfProductsInBasket(), "Expected number of products in cart to be 1.");
    }

}
