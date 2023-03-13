package org.fasttrackit.scenarios;

import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.fasttrackit.products.ProductsInCart;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertEquals;


public class IncreaseNumberOfProductsInCartTest {
    HomePage homePage = new HomePage();


    @Test
    public void verifyIfClickingOnPlusButtonForProduct0IsIncreasingNumberOfProductsInCart() {
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart0 = new ProductsInCart("0");
        productsInCart0.increaseNumberOfProducts();
        assertEquals("2", productsInCart0.verifyNumberOfProductsInBasket(), "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnPlusButtonForProduct1IsIncreasingNumberOfProductsInCart() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart1 = new ProductsInCart("1");
        productsInCart1.increaseNumberOfProducts();
        assertEquals("2", productsInCart1.verifyNumberOfProductsInBasket(), "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnPlusButtonForProduct2IsIncreasingNumberOfProductsInCart() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart2 = new ProductsInCart("2");
        productsInCart2.increaseNumberOfProducts();
        assertEquals("2", productsInCart2.verifyNumberOfProductsInBasket(), "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnPlusButtonForProduct3IsIncreasingNumberOfProductsInCart() {
        Product product3 = new Product("3");
        product3.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart3 = new ProductsInCart("3");
        productsInCart3.increaseNumberOfProducts();
        assertEquals("2", productsInCart3.verifyNumberOfProductsInBasket(), "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnPlusButtonForProduct4IsIncreasingNumberOfProductsInCart() {
        Product product4 = new Product("4");
        product4.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart4 = new ProductsInCart("4");
        productsInCart4.increaseNumberOfProducts();
        assertEquals("2", productsInCart4.verifyNumberOfProductsInBasket(), "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnPlusButtonForProduct5IsIncreasingNumberOfProductsInCart() {
        Product product5 = new Product("5");
        product5.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart5 = new ProductsInCart("5");
        productsInCart5.increaseNumberOfProducts();
        assertEquals("2", productsInCart5.verifyNumberOfProductsInBasket(), "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnPlusButtonForProduct6IsIncreasingNumberOfProductsInCart() {
        Product product6 = new Product("6");
        product6.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart6 = new ProductsInCart("6");
        productsInCart6.increaseNumberOfProducts();
        assertEquals("2", productsInCart6.verifyNumberOfProductsInBasket(), "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnPlusButtonForProduct7IsIncreasingNumberOfProductsInCart() {
        Product product7 = new Product("7");
        product7.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart7 = new ProductsInCart("7");
        productsInCart7.increaseNumberOfProducts();
        assertEquals("2", productsInCart7.verifyNumberOfProductsInBasket(), "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnPlusButtonForProduct8IsIncreasingNumberOfProductsInCart() {
        Product product8 = new Product("8");
        product8.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart8 = new ProductsInCart("8");
        productsInCart8.increaseNumberOfProducts();
        assertEquals("2", productsInCart8.verifyNumberOfProductsInBasket(), "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnPlusButtonForProduct9IsIncreasingNumberOfProductsInCart() {
        Product product9 = new Product("9");
        product9.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart9 = new ProductsInCart("9");
        productsInCart9.increaseNumberOfProducts();
        assertEquals("2", productsInCart9.verifyNumberOfProductsInBasket(), "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }


}


