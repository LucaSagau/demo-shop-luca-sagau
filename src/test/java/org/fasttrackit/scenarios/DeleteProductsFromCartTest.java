package org.fasttrackit.scenarios;

import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.fasttrackit.products.ProductsInCart;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DeleteProductsFromCartTest {

    HomePage homePage = new HomePage();

    @Test
    public void verifyIfClickingOnTrashButtonIsDeletingProduct0FromCart() {
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart0 = new ProductsInCart("0");
        productsInCart0.deleteProductFromCart();
        assertEquals("", productsInCart0.verifyNumberOfProductsInBasket(), "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnTrashButtonIsDeletingProduct1FromCart() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart1 = new ProductsInCart("1");
        productsInCart1.deleteProductFromCart();
        assertEquals("", productsInCart1.verifyNumberOfProductsInBasket(), "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnTrashButtonIsDeletingProduct2FromCart() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart2 = new ProductsInCart("2");
        productsInCart2.deleteProductFromCart();
        assertEquals("", productsInCart2.verifyNumberOfProductsInBasket(), "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnTrashButtonIsDeletingProduct3FromCart() {
        Product product3 = new Product("3");
        product3.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart3 = new ProductsInCart("3");
        productsInCart3.deleteProductFromCart();
        assertEquals("", productsInCart3.verifyNumberOfProductsInBasket(), "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnTrashButtonIsDeletingProduct4FromCart() {
        Product product4 = new Product("4");
        product4.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart4 = new ProductsInCart("4");
        productsInCart4.deleteProductFromCart();
        assertEquals("", productsInCart4.verifyNumberOfProductsInBasket(), "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnTrashButtonIsDeletingProduct5FromCart() {
        Product product5 = new Product("5");
        product5.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart5 = new ProductsInCart("5");
        productsInCart5.deleteProductFromCart();
        assertEquals("", productsInCart5.verifyNumberOfProductsInBasket(), "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnTrashButtonIsDeletingProduct6FromCart() {
        Product product6 = new Product("6");
        product6.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart6 = new ProductsInCart("6");
        productsInCart6.deleteProductFromCart();
        assertEquals("", productsInCart6.verifyNumberOfProductsInBasket(), "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnTrashButtonIsDeletingProduct7FromCart() {
        Product product7 = new Product("7");
        product7.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart7 = new ProductsInCart("7");
        productsInCart7.deleteProductFromCart();
        assertEquals("", productsInCart7.verifyNumberOfProductsInBasket(), "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnTrashButtonIsDeletingProduct8FromCart() {
        Product product8 = new Product("8");
        product8.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart8 = new ProductsInCart("8");
        productsInCart8.deleteProductFromCart();
        assertEquals("", productsInCart8.verifyNumberOfProductsInBasket(), "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void verifyIfClickingOnTrashButtonIsDeletingProduct9FromCart() {
        Product product9 = new Product("9");
        product9.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart9 = new ProductsInCart("9");
        productsInCart9.deleteProductFromCart();
        assertEquals("", productsInCart9.verifyNumberOfProductsInBasket(), "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }













}
