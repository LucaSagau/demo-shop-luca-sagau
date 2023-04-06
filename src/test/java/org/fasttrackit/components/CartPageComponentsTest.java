package org.fasttrackit.components;

import org.fasttrackit.config.TestConfiguration;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CartPageComponentsTest extends TestConfiguration {

    HomePage homePage = new HomePage();

    @AfterMethod
    public void setup() {
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify the cart page can be open from home page.",
            description = "Verify the cart page can be open from home page.")
    public void cartPageIsOpen() {
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertTrue(cartPage.validateCartIsDisplayed(), "Expected cart page to be displayed.");
    }

    @Test(testName = "Verify the adding message is displayed on page.",
            description = "Verify the adding message -How about adding some products in your cart?- is displayed on page.")
    public void cartPageAddingMessageIsDisplayed() {
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertTrue(cartPage.validateCartAddingMsgIsDisplayed(), "Expected cart adding message to be displayed.");
    }

    @Test(testName = "Verify the continue shopping button is displayed on cart page.",
            description = "This test verify the continue shopping button is displayed on cart page.")
    public void continueShoppingButtonIsDisplayed() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertTrue(cartPage.validateContinueShoppingButtonIsDisplayed(), "Expected continue shopping button to be displayed on cart page.");
    }

    @Test(testName = "Verify the continue shopping button is enabled on cart page.",
            description = "This test verify the continue shopping button is enabled on cart page.")
    public void continueShoppingButtonIsEnabled() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertTrue(cartPage.validateContinueShoppingButtonIsEnabled(), "Expected continue shopping button to be enabled on cart page.");
    }

    @Test(testName = "Verify the checkout button is displayed on cart page.",
            description = "This test verify the checkout button is displayed on cart page.")
    public void checkoutButtonIsDisplayed() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertTrue(cartPage.validateCheckoutButtonIsDisplayed(), "Expected checkout button to be displayed on cart page.");
    }

    @Test(testName = "Verify the checkout button is enabled on cart page.",
            description = "This test verify the checkout button is enabled on cart page.")
    public void checkoutButtonIsEnabled() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertTrue(cartPage.validateCheckoutButtonIsEnabled(), "Expected checkout button to be enabled on cart page.");
    }

    @Test(testName = "Verify the items total is displayed on cart page.",
            description = "This test verify the items total is displayed on cart page.")
    public void itemsTotalIsDisplayed() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertTrue(cartPage.validateItemsTotalIsDisplayed(), "Expected items total to be displayed on cart page.");
    }

    @Test(testName = "Verify the tax is displayed on cart page.",
            description = "This test verify the tax is displayed on cart page.")
    public void taxIsDisplayed() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertTrue(cartPage.validateTaxIsDisplayed(), "Expected tax to be displayed on cart page.");
    }

    @Test(testName = "Verify the total is displayed on cart page.",
            description = "This test verify the total is displayed on cart page.")
    public void totalIsDisplayed() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertTrue(cartPage.validateTotalIsDisplayed(), "Expected total to be displayed on cart page.");
    }
}
