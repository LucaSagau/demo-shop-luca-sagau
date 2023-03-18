package org.fasttrackit.scenarios;

import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.fasttrackit.products.ProductsInCart;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertEquals;


public class IncreaseNumberOfProductsInCartTest {

    HomePage homePage = new HomePage();

    @Test(testName = "Verify if clicking on plus button for product zero is increasing number of products in cart.",
            description = "This test verify if clicking on plus button for product zero is increasing number of products in cart.")
    public void verifyIfClickingOnPlusButtonForProductZeroIsIncreasingNumberOfProductsInCart() {
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart0 = new ProductsInCart("0");
        productsInCart0.increaseNumberOfProducts();
        assertEquals(productsInCart0.verifyNumberOfProductsInBasket(), "2", "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on plus button for product one is increasing number of products in cart.",
            description = "This test verify if clicking on plus button for product one is increasing number of products in cart.")
    public void verifyIfClickingOnPlusButtonForProductOneIsIncreasingNumberOfProductsInCart() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart1 = new ProductsInCart("1");
        productsInCart1.increaseNumberOfProducts();
        assertEquals(productsInCart1.verifyNumberOfProductsInBasket(), "2", "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on plus button for product two is increasing number of products in cart.",
            description = "This test verify if clicking on plus button for product two is increasing number of products in cart.")
    public void verifyIfClickingOnPlusButtonForProductTwoIsIncreasingNumberOfProductsInCart() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart2 = new ProductsInCart("2");
        productsInCart2.increaseNumberOfProducts();
        assertEquals(productsInCart2.verifyNumberOfProductsInBasket(), "2", "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on plus button for product three is increasing number of products in cart.",
            description = "This test verify if clicking on plus button for product three is increasing number of products in cart.")
    public void verifyIfClickingOnPlusButtonForProductThreeIsIncreasingNumberOfProductsInCart() {
        Product product3 = new Product("3");
        product3.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart3 = new ProductsInCart("3");
        productsInCart3.increaseNumberOfProducts();
        assertEquals(productsInCart3.verifyNumberOfProductsInBasket(), "2", "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on plus button for product four is increasing number of products in cart.",
            description = "This test verify if clicking on plus button for product four is increasing number of products in cart.")
    public void verifyIfClickingOnPlusButtonForProductFourIsIncreasingNumberOfProductsInCart() {
        Product product4 = new Product("4");
        product4.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart4 = new ProductsInCart("4");
        productsInCart4.increaseNumberOfProducts();
        assertEquals(productsInCart4.verifyNumberOfProductsInBasket(), "2", "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on plus button for product five is increasing number of products in cart.",
            description = "This test verify if clicking on plus button for product five is increasing number of products in cart.")
    public void verifyIfClickingOnPlusButtonForProductFiveIsIncreasingNumberOfProductsInCart() {
        Product product5 = new Product("5");
        product5.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart5 = new ProductsInCart("5");
        productsInCart5.increaseNumberOfProducts();
        assertEquals(productsInCart5.verifyNumberOfProductsInBasket(), "2", "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on plus button for product six is increasing number of products in cart.",
            description = "This test verify if clicking on plus button for product six is increasing number of products in cart.")
    public void verifyIfClickingOnPlusButtonForProductSixIsIncreasingNumberOfProductsInCart() {
        Product product6 = new Product("6");
        product6.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart6 = new ProductsInCart("6");
        productsInCart6.increaseNumberOfProducts();
        assertEquals(productsInCart6.verifyNumberOfProductsInBasket(), "2", "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on plus button for product seven is increasing number of products in cart.",
            description = "This test verify if clicking on plus button for product seven is increasing number of products in cart.")
    public void verifyIfClickingOnPlusButtonForProductSevenIsIncreasingNumberOfProductsInCart() {
        Product product7 = new Product("7");
        product7.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart7 = new ProductsInCart("7");
        productsInCart7.increaseNumberOfProducts();
        assertEquals(productsInCart7.verifyNumberOfProductsInBasket(), "2", "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on plus button for product eight is increasing number of products in cart.",
            description = "This test verify if clicking on plus button for product eight is increasing number of products in cart.")
    public void verifyIfClickingOnPlusButtonForProductEightIsIncreasingNumberOfProductsInCart() {
        Product product8 = new Product("8");
        product8.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart8 = new ProductsInCart("8");
        productsInCart8.increaseNumberOfProducts();
        assertEquals(productsInCart8.verifyNumberOfProductsInBasket(), "2", "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on plus button for product nine is increasing number of products in cart.",
            description = "This test verify if clicking on plus button for product nine is increasing number of products in cart.")
    public void verifyIfClickingOnPlusButtonForProductNineIsIncreasingNumberOfProductsInCart() {
        Product product9 = new Product("9");
        product9.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart9 = new ProductsInCart("9");
        productsInCart9.increaseNumberOfProducts();
        assertEquals(productsInCart9.verifyNumberOfProductsInBasket(), "2", "Expected number of products to be 2.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }


}


