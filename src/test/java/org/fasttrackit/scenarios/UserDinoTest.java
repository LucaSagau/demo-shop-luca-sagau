package org.fasttrackit.scenarios;

import org.fasttrackit.Account;
import org.fasttrackit.body.Modal;
import org.fasttrackit.config.TestConfiguration;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.WishlistPage;
import org.fasttrackit.products.Product;
import org.fasttrackit.products.ProductsInCart;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class UserDinoTest extends TestConfiguration {
    HomePage homePage = new HomePage();

    @AfterMethod
    public void setup() {
        homePage.resetPage();
        homePage.returnToHomePage();
    }
    @Test(testName = "Verify user dino can add products in cart.",
            description = "This test verify if user dino can add products in cart.")
    public void userDinoCanAddProductsInCart() {
        Account account = new Account("dino", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product0 = new Product("0");
        product0.addToBasket();
        Product product1 = new Product("1");
        product1.addToBasket();
        Product product2 = new Product("2");
        product2.addToBasket();
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertEquals( cartPage.verifyNumberOfProductsInBasket(),"3", "Expected number of products in cart to be 3.");

    }

    @Test(testName = "Verify user dino can add products in wishlist.",
            description = "This test verify if user dino can add products in wishlist.")
    public void userDinoCanAddProductsInWishlist() {
        Account account = new Account("dino", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product0 = new Product("0");
        product0.addToFavorite();
        Product product1 = new Product("1");
        product1.addToFavorite();
        Product product2 = new Product("2");
        product2.addToFavorite();
        homePage.clickOnTheWishlistIcon();
        WishlistPage wishlistPage = new WishlistPage();
        assertEquals(wishlistPage.verifyNumberOfProductsInWishlist(),"3",  "Expected number of products in cart to be 3.");

    }

    @Test(testName = "Verify user dino can increase number of products in cart.",
            description = "This test verify if user dino can increase number of products in cart.")
    public void userDinoCanIncreaseNumberOfProductsInCart() {
        Account account = new Account("dino", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product3 = new Product("3");
        product3.addToBasket();
        Product product4 = new Product("4");
        product4.addToBasket();
        Product product5 = new Product("5");
        product5.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart3 = new ProductsInCart("3");
        productsInCart3.increaseNumberOfProducts();
        ProductsInCart productsInCart4 = new ProductsInCart("4");
        productsInCart4.increaseNumberOfProducts();
        ProductsInCart productsInCart5 = new ProductsInCart("5");
        productsInCart5.increaseNumberOfProducts();
        CartPage cartPage = new CartPage();
        assertEquals( cartPage.verifyNumberOfProductsInBasket(),"6", "Expected number of products in cart to be 6.");
    }

    @Test(testName = "Verify user dino can decrease number of products in cart.",
            description = "This test verify if user dino can decrease number of products in cart.")
    public void userDinoCanDecreaseNumberOfProductsInCart() {
        Account account = new Account("dino", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product6 = new Product("6");
        product6.addToBasket();
        Product product7 = new Product("7");
        product7.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart6 = new ProductsInCart("6");
        productsInCart6.increaseNumberOfProducts();
        ProductsInCart productsInCart7 = new ProductsInCart("7");
        productsInCart7.increaseNumberOfProducts();
        productsInCart6 = new ProductsInCart("6");
        productsInCart6.decreaseNumberOfProducts();
        productsInCart7 = new ProductsInCart("7");
        productsInCart7.decreaseNumberOfProducts();
        CartPage cartPage = new CartPage();
        assertEquals( cartPage.verifyNumberOfProductsInBasket(),"2", "Expected number of products in cart to be 2.");
    }

    @Test(testName = "Verify user dino can delete products from cart.",
            description = "This test verify if user dino can delete products from cart.")
    public void userDinoCanDeleteProductsFromCart() {
        Account account = new Account("dino", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product8 = new Product("8");
        product8.addToBasket();
        Product product9 = new Product("9");
        product9.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart9 = new ProductsInCart("9");
        productsInCart9.deleteProductFromCart();
        ProductsInCart productsInCart8 = new ProductsInCart("8");
        productsInCart8.deleteProductFromCart();
        CartPage cartPage = new CartPage();
        assertEquals(cartPage.verifyNumberOfProductsInBasket(),"",  "Expected number of products in cart to be 0.");
    }
    @Test(testName = "Verify user dino can't delete products from cart.",
            description = "This test verify if user dino can't delete products from cart.")
    public void userDinoCantDeleteProductsFromCart() {
        Account account = new Account("dino", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product8 = new Product("8");
        product8.addToBasket();
        Product product9 = new Product("9");
        product9.addToBasket();
        homePage.clickOnTheCartIcon();
        ProductsInCart productsInCart8 = new ProductsInCart("8");
        productsInCart8.deleteProductFromCart();
        ProductsInCart productsInCart9 = new ProductsInCart("9");
        productsInCart9.deleteProductFromCart();
        CartPage cartPage = new CartPage();
        assertEquals(cartPage.verifyNumberOfProductsInBasket(),"", "Expected number of products in cart to be 0.");
    }

}
