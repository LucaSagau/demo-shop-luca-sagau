package org.fasttrackit.scenarios;

import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.fasttrackit.products.ProductsInCart;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DeleteProductsFromCartTest {

    HomePage homePage = new HomePage();

    @Test(testName = "Verify clicking on trash button for product zero is deleting product from cart.",
            description = "This test verify if clicking on trash button for product zero is deleting product from cart.")
    public void verifyIfClickingOnTrashButtonIsDeletingProductZeroFromCart() {
        Product product0 = new Product("0");
        product0.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart0 = new ProductsInCart("0");
        productsInCart0.deleteProductFromCart();
        assertEquals(productsInCart0.verifyNumberOfProductsInBasket(),"", "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify clicking on trash button for product one is deleting product from cart.",
            description = "This test verify if clicking on trash button for product one is deleting product from cart.")
    public void verifyIfClickingOnTrashButtonIsDeletingProductOneFromCart() {
        Product product1 = new Product("1");
        product1.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart1 = new ProductsInCart("1");
        productsInCart1.deleteProductFromCart();
        assertEquals(productsInCart1.verifyNumberOfProductsInBasket(),"", "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify clicking on trash button for product two is deleting product from cart.",
            description = "This test verify if clicking on trash button for product two is deleting product from cart.")
    public void verifyIfClickingOnTrashButtonIsDeletingProductTwoFromCart() {
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart2 = new ProductsInCart("2");
        productsInCart2.deleteProductFromCart();
        assertEquals(productsInCart2.verifyNumberOfProductsInBasket(),"", "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify clicking on trash button for product three is deleting product from cart.",
            description = "This test verify if clicking on trash button for product three is deleting product from cart.")
    public void verifyIfClickingOnTrashButtonIsDeletingProductThreeFromCart() {
        Product product3 = new Product("3");
        product3.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart3 = new ProductsInCart("3");
        productsInCart3.deleteProductFromCart();
        assertEquals(productsInCart3.verifyNumberOfProductsInBasket(),"", "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify clicking on trash button for product four is deleting product from cart.",
            description = "This test verify if clicking on trash button for product four is deleting product from cart.")
    public void verifyIfClickingOnTrashButtonIsDeletingProductFourFromCart() {
        Product product4 = new Product("4");
        product4.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart4 = new ProductsInCart("4");
        productsInCart4.deleteProductFromCart();
        assertEquals(productsInCart4.verifyNumberOfProductsInBasket(),"", "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify clicking on trash button for product five is deleting product from cart.",
            description = "This test verify if clicking on trash button for product five is deleting product from cart.")
    public void verifyIfClickingOnTrashButtonIsDeletingProductFiveFromCart() {
        Product product5 = new Product("5");
        product5.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart5 = new ProductsInCart("5");
        productsInCart5.deleteProductFromCart();
        assertEquals(productsInCart5.verifyNumberOfProductsInBasket(),"", "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify clicking on trash button for product six is deleting product from cart.",
            description = "This test verify if clicking on trash button for product six is deleting product from cart.")
    public void verifyIfClickingOnTrashButtonIsDeletingProductSixFromCart() {
        Product product6 = new Product("6");
        product6.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart6 = new ProductsInCart("6");
        productsInCart6.deleteProductFromCart();
        assertEquals(productsInCart6.verifyNumberOfProductsInBasket(),"", "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify clicking on trash button for product seven is deleting product from cart.",
            description = "This test verify if clicking on trash button for product seven is deleting product from cart.")
    public void verifyIfClickingOnTrashButtonIsDeletingProductSevenFromCart() {
        Product product7 = new Product("7");
        product7.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart7 = new ProductsInCart("7");
        productsInCart7.deleteProductFromCart();
        assertEquals(productsInCart7.verifyNumberOfProductsInBasket(),"", "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify clicking on trash button for product eight is deleting product from cart.",
            description = "This test verify if clicking on trash button for product eight is deleting product from cart.")
    public void verifyIfClickingOnTrashButtonIsDeletingProductEightFromCart() {
        Product product8 = new Product("8");
        product8.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart8 = new ProductsInCart("8");
        productsInCart8.deleteProductFromCart();
        assertEquals(productsInCart8.verifyNumberOfProductsInBasket(),"", "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Verify clicking on trash button for product nine is deleting product from cart.",
            description = "This test verify if clicking on trash button for product nine is deleting product from cart.")
    public void verifyIfClickingOnTrashButtonIsDeletingProductNineFromCart() {
        Product product9 = new Product("9");
        product9.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart9 = new ProductsInCart("9");
        productsInCart9.deleteProductFromCart();
        assertEquals(productsInCart9.verifyNumberOfProductsInBasket(),"", "Expected number of products to be 0.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }













}
