package org.fasttrackit.components;

import org.fasttrackit.config.TestConfiguration;
import org.fasttrackit.dataprovider.ProductsInCartDataProvider;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.fasttrackit.products.ProductsInCart;
import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

public class ProductsInCartComponentsTest extends TestConfiguration {

    HomePage homePage = new HomePage();


    @AfterTest
    public void setup() {
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify minus button is displayed for al products in cart page.",
            description = "This test add all 10 products in cart and verify if minus button is displayed for all products.",
            dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyMinusButtonIsDisplayedForAllProducts(ProductsInCart productsInCart) {
        Product product1 = new Product("1");
        product1.addToBasket();
        Product product2 = new Product("2");
        product2.addToBasket();
        Product product3 = new Product("3");
        product3.addToBasket();
        Product product4 = new Product("4");
        product4.addToBasket();
        Product product5 = new Product("5");
        product5.addToBasket();
        Product product6 = new Product("6");
        product6.addToBasket();
        Product product7 = new Product("7");
        product7.addToBasket();
        Product product8 = new Product("8");
        product8.addToBasket();
        Product product9 = new Product("9");
        product9.addToBasket();
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validateMinusButtonIsDisplayedForAllProducts(), "Expected minus button to be displayed for all products.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify minus button is enabled for al products in cart page.",
            description = "This test add all 10 products in cart and verify if minus button is enabled for all products.",
            dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyMinusButtonIsEnabledForAllProducts(ProductsInCart productsInCart) {
        Product product1 = new Product("1");
        product1.addToBasket();
        Product product2 = new Product("2");
        product2.addToBasket();
        Product product3 = new Product("3");
        product3.addToBasket();
        Product product4 = new Product("4");
        product4.addToBasket();
        Product product5 = new Product("5");
        product5.addToBasket();
        Product product6 = new Product("6");
        product6.addToBasket();
        Product product7 = new Product("7");
        product7.addToBasket();
        Product product8 = new Product("8");
        product8.addToBasket();
        Product product9 = new Product("9");
        product9.addToBasket();
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validateMinusButtonIsEnabledForAllProducts(), "Expected minus button to be enabled for all products.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify plus button is displayed for al products in cart page.",
            description = "This test add all 10 products in cart and verify if plus button is displayed for all products.",
            dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyPlusButtonIsDisplayedForAllProducts(ProductsInCart productsInCart) {
        Product product1 = new Product("1");
        product1.addToBasket();
        Product product2 = new Product("2");
        product2.addToBasket();
        Product product3 = new Product("3");
        product3.addToBasket();
        Product product4 = new Product("4");
        product4.addToBasket();
        Product product5 = new Product("5");
        product5.addToBasket();
        Product product6 = new Product("6");
        product6.addToBasket();
        Product product7 = new Product("7");
        product7.addToBasket();
        Product product8 = new Product("8");
        product8.addToBasket();
        Product product9 = new Product("9");
        product9.addToBasket();
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validatePlusButtonIsDisplayedForAllProducts(), "Expected plus button to be displayed for all products.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify plus button is enabled for al products in cart page.",
            description = "This test add all 10 products in cart and verify if plus button is enabled for all products.",
            dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyPlusButtonIsEnabledForAllProducts(ProductsInCart productsInCart) {
        Product product1 = new Product("1");
        product1.addToBasket();
        Product product2 = new Product("2");
        product2.addToBasket();
        Product product3 = new Product("3");
        product3.addToBasket();
        Product product4 = new Product("4");
        product4.addToBasket();
        Product product5 = new Product("5");
        product5.addToBasket();
        Product product6 = new Product("6");
        product6.addToBasket();
        Product product7 = new Product("7");
        product7.addToBasket();
        Product product8 = new Product("8");
        product8.addToBasket();
        Product product9 = new Product("9");
        product9.addToBasket();
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validatePlusButtonIsEnabledForAllProducts(), "Expected plus button to be enabled for all products.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify price for one product is displayed for al products in cart page.",
            description = "This test add all 10 products in cart and verify if price for one product is displayed for all products.",
            dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyPriceForOneProductIsDisplayedForAllProducts(ProductsInCart productsInCart) {
        Product product1 = new Product("1");
        product1.addToBasket();
        Product product2 = new Product("2");
        product2.addToBasket();
        Product product3 = new Product("3");
        product3.addToBasket();
        Product product4 = new Product("4");
        product4.addToBasket();
        Product product5 = new Product("5");
        product5.addToBasket();
        Product product6 = new Product("6");
        product6.addToBasket();
        Product product7 = new Product("7");
        product7.addToBasket();
        Product product8 = new Product("8");
        product8.addToBasket();
        Product product9 = new Product("9");
        product9.addToBasket();
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validatePriceForOneProductIsDisplayedForAllProducts(), "Expected price for one product to be displayed for all products.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify price for several products is displayed for al products in cart page.",
            description = "This test add all 10 products in cart and verify if price for several products is displayed for all products.",
            dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyPriceForSeveralProductsIsDisplayedForAllProducts(ProductsInCart productsInCart) {
        Product product1 = new Product("1");
        product1.addToBasket();
        Product product2 = new Product("2");
        product2.addToBasket();
        Product product3 = new Product("3");
        product3.addToBasket();
        Product product4 = new Product("4");
        product4.addToBasket();
        Product product5 = new Product("5");
        product5.addToBasket();
        Product product6 = new Product("6");
        product6.addToBasket();
        Product product7 = new Product("7");
        product7.addToBasket();
        Product product8 = new Product("8");
        product8.addToBasket();
        Product product9 = new Product("9");
        product9.addToBasket();
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validatePriceForSeveralProductsIsDisplayedForAllProducts(),"Expected price for more than one product to be displayed for all products.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify product link is displayed for al products in cart page.",
            description = "This test add all 10 products in cart and verify if product link is displayed for all products.",
            dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyProductLinkIsDisplayedForAllProducts(ProductsInCart productsInCart) {
        Product product1 = new Product("1");
        product1.addToBasket();
        Product product2 = new Product("2");
        product2.addToBasket();
        Product product3 = new Product("3");
        product3.addToBasket();
        Product product4 = new Product("4");
        product4.addToBasket();
        Product product5 = new Product("5");
        product5.addToBasket();
        Product product6 = new Product("6");
        product6.addToBasket();
        Product product7 = new Product("7");
        product7.addToBasket();
        Product product8 = new Product("8");
        product8.addToBasket();
        Product product9 = new Product("9");
        product9.addToBasket();
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validateProductLinkIsDisplayedForAllProducts(), "Expected product link to be displayed for all products.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify product link is enabled for al products in cart page.",
            description = "This test add all 10 products in cart and verify if product link is enabled for all products.",
            dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyProductLinkIsEnabledForAllProducts(ProductsInCart productsInCart) {
        Product product1 = new Product("1");
        product1.addToBasket();
        Product product2 = new Product("2");
        product2.addToBasket();
        Product product3 = new Product("3");
        product3.addToBasket();
        Product product4 = new Product("4");
        product4.addToBasket();
        Product product5 = new Product("5");
        product5.addToBasket();
        Product product6 = new Product("6");
        product6.addToBasket();
        Product product7 = new Product("7");
        product7.addToBasket();
        Product product8 = new Product("8");
        product8.addToBasket();
        Product product9 = new Product("9");
        product9.addToBasket();
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validateProductLinkIsEnabledForAllProducts(), "Expected product link to be enabled for all products.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify trash icon is displayed for al products in cart page.",
            description = "This test add all 10 products in cart and verify if trash icon is displayed for all products.",
            dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyTrashIconIsDisplayedForAllProducts(ProductsInCart productsInCart) {
        Product product1 = new Product("1");
        product1.addToBasket();
        Product product2 = new Product("2");
        product2.addToBasket();
        Product product3 = new Product("3");
        product3.addToBasket();
        Product product4 = new Product("4");
        product4.addToBasket();
        Product product5 = new Product("5");
        product5.addToBasket();
        Product product6 = new Product("6");
        product6.addToBasket();
        Product product7 = new Product("7");
        product7.addToBasket();
        Product product8 = new Product("8");
        product8.addToBasket();
        Product product9 = new Product("9");
        product9.addToBasket();
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validateTrashButtonIsDisplayedForAllProducts(), "Expected trash icon to be displayed for all products.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify trash icon is enabled for al products in cart page.",
            description = "This test add all 10 products in cart and verify if trash icon is enabled for all products.",
            dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyTrashIconIsEnabledForAllProducts(ProductsInCart productsInCart) {
        Product product1 = new Product("1");
        product1.addToBasket();
        Product product2 = new Product("2");
        product2.addToBasket();
        Product product3 = new Product("3");
        product3.addToBasket();
        Product product4 = new Product("4");
        product4.addToBasket();
        Product product5 = new Product("5");
        product5.addToBasket();
        Product product6 = new Product("6");
        product6.addToBasket();
        Product product7 = new Product("7");
        product7.addToBasket();
        Product product8 = new Product("8");
        product8.addToBasket();
        Product product9 = new Product("9");
        product9.addToBasket();
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validateTrashButtonIsEnabledForAllProducts(), "Expected trash icon to be enabled for all products.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }
}
