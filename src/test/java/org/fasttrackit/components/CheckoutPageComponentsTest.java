package org.fasttrackit.components;

import io.qameta.allure.Feature;
import org.fasttrackit.config.TestConfiguration;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CheckoutPageComponentsTest extends TestConfiguration {

    HomePage homePage = new HomePage();

    @AfterMethod
    public void setup() {
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify checkout title is displayed.",
            description = "This test verify if checkout title is displayed.")
    public void checkoutTitleIsDisplayed() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        assertTrue(checkoutPage.validateCheckoutTitleIsDisplayed(), "Expected checkout title to be displayed.");
    }

    @Test(testName = "Verify first name field is displayed.",
            description = "This test verify if first name field is displayed.")
    public void checkoutFirstNameFieldIsDisplayed() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        assertTrue(checkoutPage.validateFirstNameFieldIsDisplayed(), "Expected first name field to be displayed.");
    }

    @Test(testName = "Verify first name field is enabled.",
            description = "This test verify if first name field is enabled.")
    public void checkoutFirstNameFieldIsEnabled() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        assertTrue(checkoutPage.validateFirstNameFieldIsEnabled(), "Expected first name field to be enabled.");
    }

    @Test(testName = "Verify last name field is displayed.",
            description = "This test verify if last name field is displayed.")
    public void checkoutLastNameFieldIsDisplayed() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        assertTrue(checkoutPage.validateLastNameFieldIsDisplayed(), "Expected last name field to be displayed.");
    }

    @Test(testName = "Verify last name field is enabled.",
            description = "This test verify if last name field is enabled.")
    public void checkoutLastNameFieldIsEnabled() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        assertTrue(checkoutPage.validateLastNameFieldIsEnabled(), "Expected last name field to be enabled.");
    }

    @Test(testName = "Verify address field is displayed.",
            description = "This test verify if address field is displayed.")
    public void checkoutAddressFieldIsDisplayed() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        assertTrue(checkoutPage.validateAddressFieldIsDisplayed(), "Expected address field to be displayed.");
    }

    @Test(testName = "Verify address field is enabled.",
            description = "This test verify if address field is enabled.")
    public void checkoutAddressFieldIsEnabled() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        assertTrue(checkoutPage.validateAddressFieldIsEnabled(), "Expected address field to be enabled.");
    }

    @Test(testName = "Verify cancel button checkout is displayed.",
            description = "This test verify if cancel button checkout is displayed.")
    public void checkoutCancelButtonCheckoutIsDisplayed() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        assertTrue(checkoutPage.validateCancelButtonCheckoutIsDisplayed(), "Expected cancel button checkout to be displayed.");
    }

    @Test(testName = "Verify cancel button checkout is enabled.",
            description = "This test verify if cancel button checkout is enabled.")
    public void checkoutCancelButtonCheckoutIsEnabled() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        assertTrue(checkoutPage.validateCancelButtonCheckoutIsEnabled(), "Expected cancel button checkout to be enabled.");
    }

    @Test(testName = "Verify continue checkout button is displayed.",
            description = "This test verify if continue checkout button is displayed.")
    public void checkoutContinueCheckoutButtonIsDisplayed() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        assertTrue(checkoutPage.validateContinueCheckoutButtonIsDisplayed(), "Expected continue checkout button to be displayed.");
    }

    @Test(testName = "Verify continue checkout button is enabled.",
            description = "This test verify if continue checkout button is enabled.")
    public void checkoutContinueCheckoutButtonIsEnabled() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        assertTrue(checkoutPage.validateContinueCheckoutButtonIsEnabled(), "Expected continue checkout button to be enabled.");
    }

    @Test(testName = "Verify error message is displayed.",
            description = "This test verify if error message is displayed.")
    public void checkoutErrorMessageIsDisplayed() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickOnContinueCheckoutButton();
        assertTrue(checkoutPage.validateErrorMessageIsDisplayed(), "Expected error message to be displayed.");
    }
}
