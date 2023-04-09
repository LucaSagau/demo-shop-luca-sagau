package org.fasttrackit.scenarios;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.fasttrackit.Account;
import org.fasttrackit.body.Modal;
import org.fasttrackit.config.TestConfiguration;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CompareSumOfProductsPriceWithItemsTotalValueTest extends TestConfiguration {

    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();

    @AfterMethod
    public void setup() {
        homePage.logUserOut();
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(testName = "Compare sum of products prices in cart with items total value.",
    description = "This test compare if the sum of products prices in cart is the same with items total value.")
    @Severity(SeverityLevel.CRITICAL)
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
        assertEquals(cartPage.getItemsTotal(), "$51.96", "Expected value of items total to be 51.96 $.");

    }

}
