package org.fasttrackit.components;

import org.fasttrackit.dataprovider.ProductDataProvider;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ProductComponentsTest {

    HomePage homePage = new HomePage();

    @AfterTest
    public void setup() {
        homePage.returnToHomePage();
    }

    @Test
    public void ProductTitleIsDisplayed() {

        assertTrue(homePage.validateProductTitleIsDisplayed(),"Expected title to be displayed.");
    }

    @Test(dataProvider = "productsDataProvider", dataProviderClass = ProductDataProvider.class,
            testName = "Verify the product link to be displayed.",
            description = "This test verify if product link is displayed on fresh open page.")

    public void productLinkIsDisplayed(Product product) {
        assertTrue(product.validateProductLinkIsDisplayed(), "Expected product link to be displayed.");
    }

    @Test(dataProvider = "productsDataProvider", dataProviderClass = ProductDataProvider.class,
            testName = "Verify the product link to be enabled.",
            description = "This test verify if product link is enabled on fresh open page.")

    public void productLinkIsEnabled(Product product) {
        assertTrue(product.validateProductLinkIsEnabled(), "Expected product link to be enabled.");
    }

    @Test(dataProvider = "productsDataProvider", dataProviderClass = ProductDataProvider.class,
            testName = "Verify the add to basket icon to be displayed.",
            description = "This test verify if add to basket icon is displayed on fresh open page.")

    public void addToBasketIconIsDisplayed(Product product) {
        assertTrue(product.validateAddToBasketIconIsDisplayed(), "Expected add to basket icon to be displayed.");
    }

    @Test(dataProvider = "productsDataProvider", dataProviderClass = ProductDataProvider.class,
            testName = "Verify the add to basket icon to be enabled.",
            description = "This test verify if add to basket icon is enabled on fresh open page.")

    public void addToBasketIconIsEnabled(Product product) {
        assertTrue(product.validateAddToBasketIconIsEnabled(), "Expected add to basket icon to be enabled.");
    }

    @Test(dataProvider = "productsDataProvider", dataProviderClass = ProductDataProvider.class,
            testName = "Verify the add to favorite icon to be displayed.",
            description = "This test verify if add to favorite icon is displayed on fresh open page.")

    public void addToFavoriteIconIsDisplayed(Product product) {
        assertTrue(product.validateAddToFavoriteIconIsDisplayed(), "Expected add to favorite icon to be displayed.");
    }

    @Test(dataProvider = "productsDataProvider", dataProviderClass = ProductDataProvider.class,
            testName = "Verify the add to favorite icon to be enabled.",
            description = "This test verify if add to favorite icon is enabled on fresh open page.")

    public void addToFavoriteIconIsEnabled(Product product) {
        assertTrue(product.validateAddToFavoriteIconIsEnabled(), "Expected add to favorite icon to be enabled.");
    }
    @Test(dataProvider = "productsDataProvider", dataProviderClass = ProductDataProvider.class,
            testName = "Verify the product photo to be displayed.",
            description = "This test verify if product photo is displayed on fresh open page.")
    public void productPhotoIsDisplayed(Product product) {
        assertTrue(product.validateProductPhotoIsDisplayed(), "Expected product photo to be displayed.");

    }

    @Test(dataProvider = "productsDataProvider", dataProviderClass = ProductDataProvider.class,
            testName = "Verify the product description to be displayed.",
            description = "This test verify if product description to be displayed on fresh open page.")

    public void productDescriptionIsDisplayed(Product product) {
        assertTrue(product.validateProductDescriptionIsDisplayed(), "Expected product description to be displayed.");
    }

    @Test(dataProvider = "productsDataProvider", dataProviderClass = ProductDataProvider.class,
            testName = "Verify the product price to be displayed.",
            description = "This test verify if product price is displayed on fresh open page.")
    public void productPriceIsDisplayed(Product product) {
        assertTrue(product.validateProductPriceIsDisplayed(), "Expected product price to be displayed.");

    }
    @Test(dataProvider = "productsDataProvider", dataProviderClass = ProductDataProvider.class,
            testName = "Verify the product availability to be displayed.",
            description = "This test verify if product availability is displayed on fresh open page.")
    public void productAvailabilityIsDisplayed(Product product) {
        assertTrue(product.validateProductAvailabilityIsDisplayed(), "Expected product availability to be displayed.");

    }


}
