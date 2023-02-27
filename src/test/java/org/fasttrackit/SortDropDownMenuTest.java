package org.fasttrackit;

import io.qameta.allure.Feature;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SortDropDownMenu;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertTrue;

@Feature("Sort Drop Down Menu Components Tests")
public class SortDropDownMenuTest {

    HomePage homePage = new HomePage();

    @AfterMethod
    public void setup() {
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify the sort field is displayed.",
            description = "This test verify if sort field is displayed.")
    public void verifySortFieldIsDisplayed() {
        assertTrue(homePage.validateSortFieldIsDisplayed(), "Expected sort field to be displayed.");

    }

    @Test(testName = "Verify the sort field is enabled.",
            description = "This test verify if sort field is enabled.")
    public void verifySortFieldIsEnabled() {
        assertTrue(homePage.validateSortFieldIsEnabled(), "Expected sort field to be enabled.");
    }

    @Test(testName = "Verify the sort A to Z is displayed by default.",
            description = "This test verify if sort A to Z is displayed by default.")
    public void verifySortAToZIsDisplayedByDefault() {
        SortDropDownMenu sortDropDownMenu = new SortDropDownMenu();
        assertTrue(sortDropDownMenu.validateSortAToZIsDisplayedByDefault(), "Expected sort A to Z to be displayed by default.");
    }

    @Test(testName = "Verify the sort A to Z is enabled.",
            description = "This test verify if sort A to Z is enabled.")
    public void verifytSortAToZIsEnabled() {
        SortDropDownMenu sortDropDownMenu = new SortDropDownMenu();
        assertTrue(sortDropDownMenu.validateSortAToZIsEnabled(), "Expected sort A to Z to be enabled.");
    }

    @Test(testName = "Verify the sort Z to A is displayed.",
            description = "This test verify if sort Z to A is displayed.")
    public void verifySortZToAIsDisplayed() {
        homePage.clickOnTheSortMenu();
        SortDropDownMenu sortDropDownMenu = new SortDropDownMenu();
        assertTrue(sortDropDownMenu.validateSortZToAIsDisplayed(), "Expected sort A to Z to be displayed.");
    }

    @Test(testName = "Verify the sort Z to A is enabled.",
            description = "This test verify if sort Z to A is enabled.")
    public void verifySortZToAIsEnabled() {
        homePage.clickOnTheSortMenu();
        SortDropDownMenu sortDropDownMenu = new SortDropDownMenu();
        assertTrue(sortDropDownMenu.validateSortZToAIsEnabled(), "Expected sort A to Z to be enabled.");
    }

    @Test(testName = "Verify the sort by price low to high is displayed.",
            description = "This test verify if sort by price low to high is displayed.")
    public void verifySortByPriceLowToHighIsDisplayed() {
        homePage.clickOnTheSortMenu();
        SortDropDownMenu sortDropDownMenu = new SortDropDownMenu();
        assertTrue(sortDropDownMenu.validateSortByPriceLowToHighIsDisplayed(), "Expected sort by price low to high to be displayed.");
    }

    @Test(testName = "Verify the sort by price low to high is enabled.",
            description = "This test verify if sort by price low to high is enabled.")
    public void verifySortByPriceLowToHighIsEnabled() {
        homePage.clickOnTheSortMenu();
        SortDropDownMenu sortDropDownMenu = new SortDropDownMenu();
        assertTrue(sortDropDownMenu.validateSortByPriceLowToHighIsEnabled(), "Expected sort by price low to high to be enabled.");
    }

    @Test(testName = "Verify the sort by price high to low is displayed.",
            description = "This test verify if sort by price high to low is displayed.")
    public void verifySortByPriceHighToLowIsDisplayed() {
        homePage.clickOnTheSortMenu();
        SortDropDownMenu sortDropDownMenu = new SortDropDownMenu();
        assertTrue(sortDropDownMenu.validateSortByPriceHighToLowIsDisplayed(), "Expected sort by price high to low to be displayed.");
    }

    @Test(testName = "Verify the sort by price high to low is enabled.",
            description = "This test verify if sort by price high to low is enabled.")
    public void verifySortByPriceHighToLowIsEnabled() {
        homePage.clickOnTheSortMenu();
        SortDropDownMenu sortDropDownMenu = new SortDropDownMenu();
        assertTrue(sortDropDownMenu.validateSortByPriceHighToLowIsEnabled(), "Expected sort by price high to low to be enabled.");
    }
}
