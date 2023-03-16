package org.fasttrackit.scenarios;

import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.fasttrackit.products.ProductsInCart;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DecreaseNumberOfProductsInCartTest {
    HomePage homePage = new HomePage();
    @Test
    public void verifyIfClickingOnMinusButtonForProduct0IsDecreasingNumberOfProductsInCart() {
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart0 = new ProductsInCart("0");
        productsInCart0.increaseNumberOfProducts();
        productsInCart0.decreaseNumberOfProducts();
        assertEquals("1", productsInCart0.verifyNumberOfProductsInBasket(), "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnMinusButtonForProduct1IsDecreasingNumberOfProductsInCart() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart1 = new ProductsInCart("1");
        productsInCart1.increaseNumberOfProducts();
        productsInCart1.decreaseNumberOfProducts();
        assertEquals("1", productsInCart1.verifyNumberOfProductsInBasket(), "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnMinusButtonForProduct2IsDecreasingNumberOfProductsInCart() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart2 = new ProductsInCart("2");
        productsInCart2.increaseNumberOfProducts();
        productsInCart2.decreaseNumberOfProducts();
        assertEquals("1", productsInCart2.verifyNumberOfProductsInBasket(), "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnMinusButtonForProduct3IsDecreasingNumberOfProductsInCart() {
        Product product3 = new Product("3");
        product3.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart3 = new ProductsInCart("3");
        productsInCart3.increaseNumberOfProducts();
        productsInCart3.decreaseNumberOfProducts();
        assertEquals("1", productsInCart3.verifyNumberOfProductsInBasket(), "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnMinusButtonForProduct4IsDecreasingNumberOfProductsInCart() {
        Product product4 = new Product("4");
        product4.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart4 = new ProductsInCart("4");
        productsInCart4.increaseNumberOfProducts();
        productsInCart4.decreaseNumberOfProducts();
        assertEquals("1", productsInCart4.verifyNumberOfProductsInBasket(), "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnMinusButtonForProduct5IsDecreasingNumberOfProductsInCart() {
        Product product5 = new Product("5");
        product5.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart5 = new ProductsInCart("5");
        productsInCart5.increaseNumberOfProducts();
        productsInCart5.decreaseNumberOfProducts();
        assertEquals("1", productsInCart5.verifyNumberOfProductsInBasket(), "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnMinusButtonForProduct6IsDecreasingNumberOfProductsInCart() {
        Product product6 = new Product("6");
        product6.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart6 = new ProductsInCart("6");
        productsInCart6.increaseNumberOfProducts();
        productsInCart6.decreaseNumberOfProducts();
        assertEquals("1", productsInCart6.verifyNumberOfProductsInBasket(), "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnMinusButtonForProduct7IsDecreasingNumberOfProductsInCart() {
        Product product7 = new Product("7");
        product7.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart7 = new ProductsInCart("7");
        productsInCart7.increaseNumberOfProducts();
        productsInCart7.decreaseNumberOfProducts();
        assertEquals("1", productsInCart7.verifyNumberOfProductsInBasket(), "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnMinusButtonForProduct8IsDecreasingNumberOfProductsInCart() {
        Product product8 = new Product("8");
        product8.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart8 = new ProductsInCart("8");
        productsInCart8.increaseNumberOfProducts();
        productsInCart8.decreaseNumberOfProducts();
        assertEquals("1", productsInCart8.verifyNumberOfProductsInBasket(), "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnMinusButtonForProduct9IsDecreasingNumberOfProductsInCart() {
        Product product9 = new Product("9");
        product9.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart9 = new ProductsInCart("9");
        productsInCart9.increaseNumberOfProducts();
        productsInCart9.decreaseNumberOfProducts();
        assertEquals("1", productsInCart9.verifyNumberOfProductsInBasket(), "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }
}
