package org.fasttrackit.scenarios;

import org.fasttrackit.Account;
import org.fasttrackit.body.Modal;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CompareSumOfProductsPriceWithItemsTotalValueTest {

    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();

    @AfterMethod
    public void setup() {
        homePage.logUserOut();
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test
    public void compareSumOfProductsPriceWithItemsTotalValue() {
        Account account = new Account("dino", "choochoo");
        homePage.clickOnTheSignInButton();
        Modal modal = new Modal();
        modal.typeInUserNameField(account.getUsername());
        modal.typeInPasswordField(account.getPassword());
        modal.clickOnTheLoginButton();
        Product product0 = new Product("0");
        product0.addToBasket();
        product0.addToBasket();
        Product product3 = new Product("3");
        product3.addToBasket();
        product3.addToBasket();
        homePage.clickOnTheCartIcon();
        Assert.assertEquals(cartPage.getItemsTotal(), "$51.96", "Expected value of items total to be 51.96 $.");

    }

}
