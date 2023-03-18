package org.fasttrackit.components;

import org.fasttrackit.body.Modal;
import org.fasttrackit.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class ModalComponentsTest {

    HomePage homePage = new HomePage();
    Modal modal = new Modal();

    @AfterMethod
    public void setup() {
        modal.clickOnTheCloseButton();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify the modal is displayed.",
            description = "This test verify if modal is displayed.")
    public void verifyModalIsDisplayed() {
        homePage.clickOnTheSignInButton();
        assertTrue(homePage.validateModalIsDisplayed(), "Expected modal to be displayed.");
    }

    @Test(testName = "Verify the modal title is Login.",
            description = "This test verify if modal title is Login.")
    public void verifyModalTitleIsLogin() {
        homePage.clickOnTheSignInButton();
        assertEquals(modal.getModalTitle(), "Login", "Expected Modal title to be Login.");
    }

    @Test(testName = "Verify the close button is displayed.",
            description = "This test verify if close button is displayed.")
    public void verifyCloseButtonIsDisplayed() {
        homePage.clickOnTheSignInButton();
        assertTrue(modal.validateCloseButtonIsDisplayed(), "Expected close button to be displayed.");
    }

    @Test(testName = "Verify the close button is enabled.",
            description = "This test verify if close button is enabled.")
    public void verifyCloseButtonIsEnabled() {
        homePage.clickOnTheSignInButton();
        assertTrue(modal.validateCloseButtonIsEnabled(), "Expected close button to be enabled.");
    }

    @Test(testName = "Verify the username field is displayed.",
            description = "This test verify if username field is displayed.")
    public void verifyUsernameFieldIsDisplayed() {
        homePage.clickOnTheSignInButton();
        assertTrue(modal.validateUsernameFieldIsDisplayed(), "Expected username field to be displayed.");
    }

    @Test(testName = "Verify the username field is enabled.",
            description = "This test verify if username field is enabled.")
    public void verifyUsernameFieldIsEnabled() {
        homePage.clickOnTheSignInButton();
        assertTrue(modal.validateUsernameFieldIsEnabled(), "Expected username field to be enabled.");
    }

    @Test(testName = "Verify the password field is displayed.",
            description = "This test verify if password field is displayed.")
    public void verifyPasswordFieldIsDisplayed() {
        homePage.clickOnTheSignInButton();
        assertTrue(modal.validatePasswordFieldIsDisplayed(), "Expected password field to be displayed.");
    }

    @Test(testName = "Verify the password field is enabled.",
            description = "This test verify if password field is enabled.")
    public void verifyPasswordFieldIsEnabled() {
        homePage.clickOnTheSignInButton();
        assertTrue(modal.validatePasswordFieldIsEnabled(), "Expected password field to be enabled.");
    }

    @Test(testName = "Verify the login button is displayed.",
            description = "This test verify if login button is displayed.")
    public void verifyLoginButtonIsDisplayed() {
        homePage.clickOnTheSignInButton();
        assertTrue(modal.validateLoginButtonIsDisplayed(), "Expected login button to be displayed.");
    }

    @Test(testName = "Verify the login button is enabled.",
            description = "This test verify if login button is enabled.")
    public void verifyLoginButtonIsEnabled() {
        homePage.clickOnTheSignInButton();
        assertTrue(modal.validateLoginButtonIsEnabled(), "Expected login button to be enabled.");
    }
}
