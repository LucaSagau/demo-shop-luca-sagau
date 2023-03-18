package org.fasttrackit.components;

import io.qameta.allure.Feature;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Feature("SearchPage Components Tests")
public class SearchPageComponentsTest {

    HomePage homePage = new HomePage();

    @AfterTest
    public void setup() {
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify the search field is displayed.",
            description = "This test verify if search field is displayed.")
    public void verifySearchFieldIsDisplayed() {
        assertTrue(homePage.validateSearchFieldIsDisplayed(), "Expected search field to be displayed.");
    }

    @Test(testName = "Verify the search field is enabled.",
            description = "This test verify if search field is enabled.")
    public void verifySearchFieldIsEnabled() {
        assertTrue(homePage.validateSearchFieldIsEnabled(), "Expected search field to be enabled.");
    }

    @Test(testName = "Verify the search button is displayed.",
            description = "This test verify if search button is displayed.")
    public void verifySearchButonIsDisplayed() {
        assertTrue(homePage.validateSearchButtonIsDisplayed(), "Expected search button to be displayed.");
    }

    @Test(testName = "Verify the search button is enabled.",
            description = "This test verify if search button is enabled.")
    public void verifySearchButonIsEnabled() {
        assertTrue(homePage.validateSearchButtonIsEnabled(), "Expected search button to be enabled.");

    }
}


