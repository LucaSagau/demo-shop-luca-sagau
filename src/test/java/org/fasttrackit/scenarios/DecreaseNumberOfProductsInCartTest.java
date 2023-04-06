package org.fasttrackit.scenarios;

import org.fasttrackit.config.TestConfiguration;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.fasttrackit.products.ProductsInCart;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DecreaseNumberOfProductsInCartTest extends TestConfiguration {
    HomePage homePage = new HomePage();

    @Test(testName = "Verify if clicking on minus button for product zero is decreasing number of products in cart.",
            description = "This test verify if clicking on minus button for product zero is decreasing number of products in cart.")
    public void verifyIfClickingOnMinusButtonForProductZeroIsDecreasingNumberOfProductsInCart() {
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart0 = new ProductsInCart("0");
        productsInCart0.increaseNumberOfProducts();
        productsInCart0.decreaseNumberOfProducts();
        assertEquals(productsInCart0.verifyNumberOfProductsInBasket(), "1", "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on minus button for product one is decreasing number of products in cart.",
            description = "This test verify if clicking on minus button for product one is decreasing number of products in cart.")
    public void verifyIfClickingOnMinusButtonForProductOneIsDecreasingNumberOfProductsInCart() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart1 = new ProductsInCart("1");
        productsInCart1.increaseNumberOfProducts();
        productsInCart1.decreaseNumberOfProducts();
        assertEquals(productsInCart1.verifyNumberOfProductsInBasket(), "1", "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on minus button for product two is decreasing number of products in cart.",
            description = "This test verify if clicking on minus button for product two is decreasing number of products in cart.")
    public void verifyIfClickingOnMinusButtonForProductTwoIsDecreasingNumberOfProductsInCart() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart2 = new ProductsInCart("2");
        productsInCart2.increaseNumberOfProducts();
        productsInCart2.decreaseNumberOfProducts();
        assertEquals(productsInCart2.verifyNumberOfProductsInBasket(),"1",  "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on minus button for product three is decreasing number of products in cart.",
            description = "This test verify if clicking on minus button for product three is decreasing number of products in cart.")
    public void verifyIfClickingOnMinusButtonForProductThreeIsDecreasingNumberOfProductsInCart() {
        Product product3 = new Product("3");
        product3.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart3 = new ProductsInCart("3");
        productsInCart3.increaseNumberOfProducts();
        productsInCart3.decreaseNumberOfProducts();
        assertEquals(productsInCart3.verifyNumberOfProductsInBasket(),"1",  "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on minus button for product four is decreasing number of products in cart.",
            description = "This test verify if clicking on minus button for product four is decreasing number of products in cart.")
    public void verifyIfClickingOnMinusButtonForProductFourIsDecreasingNumberOfProductsInCart() {
        Product product4 = new Product("4");
        product4.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart4 = new ProductsInCart("4");
        productsInCart4.increaseNumberOfProducts();
        productsInCart4.decreaseNumberOfProducts();
        assertEquals(productsInCart4.verifyNumberOfProductsInBasket(),"1",  "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on minus button for product five is decreasing number of products in cart.",
            description = "This test verify if clicking on minus button for product five is decreasing number of products in cart.")
    public void verifyIfClickingOnMinusButtonForProductFiveIsDecreasingNumberOfProductsInCart() {
        Product product5 = new Product("5");
        product5.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart5 = new ProductsInCart("5");
        productsInCart5.increaseNumberOfProducts();
        productsInCart5.decreaseNumberOfProducts();
        assertEquals(productsInCart5.verifyNumberOfProductsInBasket(),"1",  "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on minus button for product six is decreasing number of products in cart.",
            description = "This test verify if clicking on minus button for product six is decreasing number of products in cart.")
    public void verifyIfClickingOnMinusButtonForProductSixIsDecreasingNumberOfProductsInCart() {
        Product product6 = new Product("6");
        product6.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart6 = new ProductsInCart("6");
        productsInCart6.increaseNumberOfProducts();
        productsInCart6.decreaseNumberOfProducts();
        assertEquals(productsInCart6.verifyNumberOfProductsInBasket(),"1",  "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on minus button for product seven is decreasing number of products in cart.",
            description = "This test verify if clicking on minus button for product seven is decreasing number of products in cart.")
    public void verifyIfClickingOnMinusButtonForProductSevenIsDecreasingNumberOfProductsInCart() {
        Product product7 = new Product("7");
        product7.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart7 = new ProductsInCart("7");
        productsInCart7.increaseNumberOfProducts();
        productsInCart7.decreaseNumberOfProducts();
        assertEquals(productsInCart7.verifyNumberOfProductsInBasket(),"1","Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on minus button for product eight is decreasing number of products in cart.",
            description = "This test verify if clicking on minus button for product eight is decreasing number of products in cart.")
    public void verifyIfClickingOnMinusButtonForProductEightIsDecreasingNumberOfProductsInCart() {
        Product product8 = new Product("8");
        product8.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart8 = new ProductsInCart("8");
        productsInCart8.increaseNumberOfProducts();
        productsInCart8.decreaseNumberOfProducts();
        assertEquals(productsInCart8.verifyNumberOfProductsInBasket(),"1",  "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify if clicking on minus button for product nine is decreasing number of products in cart.",
            description = "This test verify if clicking on minus button for product nine is decreasing number of products in cart.")
    public void verifyIfClickingOnMinusButtonForProductNineIsDecreasingNumberOfProductsInCart() {
        Product product9 = new Product("9");
        product9.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart9 = new ProductsInCart("9");
        productsInCart9.increaseNumberOfProducts();
        productsInCart9.decreaseNumberOfProducts();
        assertEquals(productsInCart9.verifyNumberOfProductsInBasket(),"1",  "Expected number of products to be 1.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }
}
