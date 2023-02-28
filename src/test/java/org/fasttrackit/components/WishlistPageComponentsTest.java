package org.fasttrackit.components;

import io.qameta.allure.Feature;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.WishlistPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertTrue;
@Feature("Wishlist Page Components Tests")
public class WishlistPageComponentsTest {

    HomePage homePage = new HomePage ();
    @AfterMethod
    public void setup() {
        homePage.returnToHomePage();
    }
    @Test(testName = "Verify the wishlist page can be open from home page.",
            description = "Verify the wishlist page can be open from home page.")

    public void wishlistPageIsOpen() {
        homePage.clickOnTheWishlistIcon ();
        WishlistPage wishlistPage = new WishlistPage ();
        assertTrue ( wishlistPage.validateWishlistIsDisplayed () , "Expected wishlist page to be displayed." );
        homePage.clickOnTheLogoButton ();



    }

    @Test(testName = "Verify the wishlist page is not displayed.",
            description = "Verify the wishlist page is not displayed.")

    public void wishlistPageIsClose() {
        homePage.clickOnTheWishlistIcon ();
        WishlistPage wishlistPage = new WishlistPage ();
        homePage.clickOnTheLogoButton ();
        assertTrue ( wishlistPage.validateWishlistIsNotDisplayed () , "Expected wishlist page to be not displayed." );
    }

}
