package org.fasttrackit;

import io.qameta.allure.Feature;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
@Feature("Cart Components Tests")
public class CartPageComponentsTest {

    HomePage homePage = new HomePage();


    @AfterMethod
    public void setup() {
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

}
