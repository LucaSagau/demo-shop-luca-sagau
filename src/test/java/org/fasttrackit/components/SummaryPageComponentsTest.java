package org.fasttrackit.components;

import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SummaryPage;
import org.fasttrackit.products.Product;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SummaryPageComponentsTest {
    HomePage homePage = new HomePage();


    @Test(testName = "Verify summary title is displayed.",
            description = "This test verify if summary title is displayed.")
    public void verifySummaryTitleIsDisplayed() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickOnFirstNameField();
        checkoutPage.typeOnFirstNameField("Paul");
        checkoutPage.clickOnLastNameField();
        checkoutPage.typeOnLastNameField("Atreides");
        checkoutPage.clickOnAddressField();
        checkoutPage.typeOnAddressField("Dune");
        checkoutPage.clickOnContinueCheckoutButton();
        SummaryPage summaryPage = new SummaryPage();
        assertTrue(summaryPage.validateSummaryTitleIsDisplayed(), "Expected summary title to be displayed.");
        homePage.resetPage();
        homePage.clickOnTheLogoButton();
    }

    @Test(testName = "Verify cancel button summary is displayed.",
            description = "This test verify if cancel button summary is displayed.")
    public void verifyCancelButtonSummaryIsDisplayed() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickOnFirstNameField();
        checkoutPage.typeOnFirstNameField("Paul");
        checkoutPage.clickOnLastNameField();
        checkoutPage.typeOnLastNameField("Atreides");
        checkoutPage.clickOnAddressField();
        checkoutPage.typeOnAddressField("Dune");
        checkoutPage.clickOnContinueCheckoutButton();
        SummaryPage summaryPage = new SummaryPage();
        assertTrue(summaryPage.validateCancelButtonSummaryIsDisplayed(), "Expected cancel button summary to be displayed.");
        homePage.resetPage();
        homePage.clickOnTheLogoButton();
    }

    @Test(testName = "Verify cancel button summary is enabled.",
            description = "This test verify if cancel button summary is enabled.")
    public void verifyCancelButtonSummaryIsEnabled() {
        Product product3 = new Product("3");
        product3.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickOnFirstNameField();
        checkoutPage.typeOnFirstNameField("Paul");
        checkoutPage.clickOnLastNameField();
        checkoutPage.typeOnLastNameField("Atreides");
        checkoutPage.clickOnAddressField();
        checkoutPage.typeOnAddressField("Dune");
        checkoutPage.clickOnContinueCheckoutButton();
        SummaryPage summaryPage = new SummaryPage();
        assertTrue(summaryPage.validateCancelButtonSummaryIsEnabled(), "Expected cancel button summary to be enabled.");
        homePage.resetPage();
        homePage.clickOnTheLogoButton();
    }

    @Test(testName = "Verify complete your order button is displayed.",
            description = "This test verify if complete your order button is displayed.")
    public void verifyCompleteYourOrderButtonIsDisplayed() {
        Product product4 = new Product("4");
        product4.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickOnFirstNameField();
        checkoutPage.typeOnFirstNameField("Paul");
        checkoutPage.clickOnLastNameField();
        checkoutPage.typeOnLastNameField("Atreides");
        checkoutPage.clickOnAddressField();
        checkoutPage.typeOnAddressField("Dune");
        checkoutPage.clickOnContinueCheckoutButton();
        SummaryPage summaryPage = new SummaryPage();
        assertTrue(summaryPage.validateCompleteYourOrderButtonIsDisplayed(), "Expected complete your order button to be displayed.");
        homePage.resetPage();
        homePage.clickOnTheLogoButton();
    }

    @Test(testName = "Verify complete your order button is enabled.",
            description = "This test verify if complete your order button is enabled.")
    public void verifyCompleteYourOrderButtonIsEnabled() {
        Product product5 = new Product("5");
        product5.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickOnFirstNameField();
        checkoutPage.typeOnFirstNameField("Paul");
        checkoutPage.clickOnLastNameField();
        checkoutPage.typeOnLastNameField("Atreides");
        checkoutPage.clickOnAddressField();
        checkoutPage.typeOnAddressField("Dune");
        checkoutPage.clickOnContinueCheckoutButton();
        SummaryPage summaryPage = new SummaryPage();
        assertTrue(summaryPage.validateCompleteYourOrderButtonIsEnabled(), "Expected complete your order button to be enabled.");
        homePage.resetPage();
        homePage.clickOnTheLogoButton();
    }

    @Test(testName = "Verify thank you message is displayed.",
            description = "This test verify if thank you message is displayed.")
    public void verifyThankYouMessageIsDisplayed() {
        Product product6 = new Product("6");
        product6.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickOnFirstNameField();
        checkoutPage.typeOnFirstNameField("Paul");
        checkoutPage.clickOnLastNameField();
        checkoutPage.typeOnLastNameField("Atreides");
        checkoutPage.clickOnAddressField();
        checkoutPage.typeOnAddressField("Dune");
        checkoutPage.clickOnContinueCheckoutButton();
        SummaryPage summaryPage = new SummaryPage();
        summaryPage.clickOnCompleteYourOrderButton();
        assertTrue(summaryPage.validateThankYouMessageIsDisplayed(), "Expected thank you message to be displayed.");
        homePage.resetPage();
        homePage.clickOnTheLogoButton();
    }

    @Test(testName = "Verify order complete title is displayed.",
            description = "This test verify if order complete title is displayed.")
    public void verifyOrderCompleteTitleIsDisplayed() {
        Product product7 = new Product("7");
        product7.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickOnFirstNameField();
        checkoutPage.typeOnFirstNameField("Paul");
        checkoutPage.clickOnLastNameField();
        checkoutPage.typeOnLastNameField("Atreides");
        checkoutPage.clickOnAddressField();
        checkoutPage.typeOnAddressField("Dune");
        checkoutPage.clickOnContinueCheckoutButton();
        SummaryPage summaryPage = new SummaryPage();
        summaryPage.clickOnCompleteYourOrderButton();
        assertTrue(summaryPage.validateOrderCompleteTitleIsDisplayed(), "Expected order complete title to be displayed.");
        homePage.resetPage();
        homePage.clickOnTheLogoButton();//continueShoppingSummaryButton
    }

    @Test(testName = "Verify continue shopping summary button is displayed.",
            description = "This test verify if continue shopping summary button is displayed.")
    public void verifyContinueShoppingSummaryButtonIsDisplayed() {
        Product product8 = new Product("8");
        product8.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickOnFirstNameField();
        checkoutPage.typeOnFirstNameField("Paul");
        checkoutPage.clickOnLastNameField();
        checkoutPage.typeOnLastNameField("Atreides");
        checkoutPage.clickOnAddressField();
        checkoutPage.typeOnAddressField("Dune");
        checkoutPage.clickOnContinueCheckoutButton();
        SummaryPage summaryPage = new SummaryPage();
        summaryPage.clickOnCompleteYourOrderButton();
        assertTrue(summaryPage.validateContinueShoppingSummaryButtonDisplayed(), "Expected continue shopping summary button to be displayed.");
        homePage.resetPage();
        homePage.clickOnTheLogoButton();
    }

    @Test(testName = "Verify continue shopping summary button is enabled.",
            description = "This test verify if continue shopping summary button is enabled.")
    public void verifyContinueShoppingSummaryButtonIsEnabled() {
        Product product9 = new Product("9");
        product9.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickOnFirstNameField();
        checkoutPage.typeOnFirstNameField("Paul");
        checkoutPage.clickOnLastNameField();
        checkoutPage.typeOnLastNameField("Atreides");
        checkoutPage.clickOnAddressField();
        checkoutPage.typeOnAddressField("Dune");
        checkoutPage.clickOnContinueCheckoutButton();
        SummaryPage summaryPage = new SummaryPage();
        summaryPage.clickOnCompleteYourOrderButton();
        assertTrue(summaryPage.validateContinueShoppingSummaryButtonEnabled(), "Expected continue shopping summary button to be enabled.");
        homePage.resetPage();
        homePage.clickOnTheLogoButton();
    }

    @Test(testName = "Verify clicking on continue shopping summary button is returning to home page.",
            description = "This test verify if clicking on continue shopping summary button is returning to home page.")
    public void verifyClickOnContinueShoppingSummaryButtonIsReturnToHomePage() {
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickOnFirstNameField();
        checkoutPage.typeOnFirstNameField("Paul");
        checkoutPage.clickOnLastNameField();
        checkoutPage.typeOnLastNameField("Atreides");
        checkoutPage.clickOnAddressField();
        checkoutPage.typeOnAddressField("Dune");
        checkoutPage.clickOnContinueCheckoutButton();
        SummaryPage summaryPage = new SummaryPage();
        summaryPage.clickOnCompleteYourOrderButton();
        summaryPage.clickOnContinueShoppingSummaryButton();
        assertTrue(homePage.validateProductTitleIsDisplayed(), "Expected title to be displayed.");
        homePage.resetPage();
        homePage.clickOnTheLogoButton();
    }
}