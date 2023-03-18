package org.fasttrackit.endtoend;

import org.fasttrackit.Account;
import org.fasttrackit.body.Header;
import org.fasttrackit.body.Modal;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SummaryPage;
import org.fasttrackit.products.Product;
import org.fasttrackit.products.ProductsInCart;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EndToEndUserDinoTest {

    HomePage homePage = new HomePage();

    @Test(testName = "Verify user dino can login ,add products,increase number of products,delete products,checkout and complete order on Demo Shop.",
    description = "This test verify if user dino can login ,add products,increase number of products,delete products,checkout and complete order on Demo Shop.")
    public void endToEndUserDinoTest() {
        Account account = new Account("dino", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        assertTrue(homePage.validateModalIsNotDisplayed(), "Expected Modal to be closed.");
        Header header = new Header(account.getUsername());
        assertEquals(header.getGreetingsMessage(), account.getGreetingsMsg(), "Expected message to be Hi " + account.getUsername() + "!");
        Product product3 = new Product("3");
        product3.addToBasket();
        assertEquals(product3.verifyNumberOfProductsInBasket(),"1","Expected number of products in cart to be 1.");
        Product product1 = new Product("1");
        product1.addToBasket();
        assertEquals(product1.verifyNumberOfProductsInBasket(),"2","Expected number of products in cart to be 2.");
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        assertTrue(cartPage.validateCartIsDisplayed(), "Expected cart page to be displayed.");
        ProductsInCart productsInCart3 = new ProductsInCart("3");
        productsInCart3.increaseNumberOfProducts();
        assertEquals(cartPage.verifyNumberOfProductsInBasket(), "3","Expected number of products in cart to be 3.");
        cartPage.clickOnContinueShoppingButton();
        assertTrue(homePage.validateProductTitleIsDisplayed(), "Expected title to be displayed.");
        Product product7 = new Product("7");
        product7.addToBasket();
        assertEquals(product7.verifyNumberOfProductsInBasket(),"4","Expected number of products in cart to be 4.");
        Product product8 = new Product("8");
        product8.addToBasket();
        assertEquals(product8.verifyNumberOfProductsInBasket(),"5","Expected number of products in cart to be 5.");
        homePage.clickOnTheCartIcon();
        assertTrue(cartPage.validateCartIsDisplayed(), "Expected cart page to be displayed.");
        ProductsInCart productsInCart8 = new ProductsInCart("8");
        productsInCart8.deleteProductFromCart();
        assertEquals(cartPage.verifyNumberOfProductsInBasket(),"4",  "Expected number of products in cart to be 4.");
        cartPage.clickOnCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage();
        assertTrue(checkoutPage.validateCheckoutTitleIsDisplayed(), "Expected checkout title to be displayed.");
        checkoutPage.clickOnFirstNameField();
        checkoutPage.typeOnFirstNameField("dino");
        checkoutPage.clickOnLastNameField();
        checkoutPage.typeOnLastNameField("chooo");
        checkoutPage.clickOnAddressField();
        checkoutPage.typeOnAddressField("Cluj-Napoca");
        checkoutPage.clickOnContinueCheckoutButton();
        SummaryPage summaryPage = new SummaryPage();
        assertTrue(summaryPage.validateSummaryTitleIsDisplayed(), "Expected summary title to be displayed.");
        summaryPage.clickOnCompleteYourOrderButton();
        assertTrue(summaryPage.validateThankYouMessageIsDisplayed(), "Expected thank you message to be displayed.");
        homePage.resetPage();
        homePage.returnToHomePage();
    }

}



