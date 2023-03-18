package org.fasttrackit.components;

import com.codeborne.selenide.SelenideElement;
import org.fasttrackit.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class StaticDemoShopStateTest {

    HomePage homePage = new HomePage();

    @Test(testName = "Verify the title application is Demo Shop.",
    description = "This test verify the title application is Demo Shop.")
    public void verifyDemoShopAppTitle() {
        String appTitle = homePage.getPageTitle();
        assertEquals(appTitle, "Demo shop", "Application title is expected to be Demo shop.");
    }

    @Test(testName = "Verify the header contains logo icon.",
    description = "This test verify if header contains logo icon.")
    public void verifyDemoShopHeaderContainsLogoIcon() {
        SelenideElement logoIcon = homePage.getHeader().getLogoIcon();
        assertTrue(logoIcon.exists(), "Expected Logo Icon to exist on Page.");
        assertTrue(logoIcon.isDisplayed(), "Expected Logo Icon to be displayed.");
    }

    @Test(testName = "Verify the header contains cart icon.",
            description = "This test verify if header contains cart icon.")
    public void verifyDemoShopHeaderContainsCartIcon() {
        SelenideElement cartIcon = homePage.getHeader().getCartIcon();
        assertTrue(cartIcon.exists(), "Expected Cart Icon to exist on Page.");
        assertTrue(cartIcon.isDisplayed(), "Expected Cart Icon to be displayed.");
    }

    @Test(testName = "Verify the header contains wishlist icon.",
            description = "This test verify if header contains wishlist icon.")
    public void verifyDemoShopHeaderContainsWishlistIcon() {
        SelenideElement wishListIcon = homePage.getHeader().getWishListIcon();
        assertTrue(wishListIcon.exists(), "Expected Wishlist Icon to exist on Page.");
        assertTrue(wishListIcon.isDisplayed(), "Expected Wishlist Icon to be displayed.");
    }

    @Test(testName = "Verify the header contains greetings message.",
            description = "This test verify if header contains greetings message.")
    public void verifyDemoShopHeaderContainsGreetingsMessage() {
        String greetingsMessage = homePage.getHeader().getGreetingsMessage();
        assertEquals(greetingsMessage, "Hello guest!", "Expected greetings message to be : Hello guest!");
    }

    @Test(testName = "Verify the header contains login button.",
            description = "This test verify if header contains login button.")
    public void verifyDemoShopHeaderContainsLoginButton() {
        SelenideElement loginButton = homePage.getHeader().getSignInButton();
        assertTrue(loginButton.exists(), "Expected Login Button to exist on Page.");
        assertTrue(loginButton.isDisplayed(), "Expected Login Button to be displayed.");
    }

    @Test(testName = "Verify footer details.",
    description = "This test verify footer details.")
    public void verifyDemoShopFooterDetails() {
        String details = homePage.getFooter().getDetails();
        assertEquals(details, "Demo Shop | build date 2021-05-21 14:04:30 GTBDT", "Expected footer details to be : Demo Shop | build date 2021-05-21 14:04:30 GTBDT");
    }

    @Test(testName = "Verify the footer contains question button.",
            description = "This test verify if footer contains question button.")
    public void verifyDemoShopFooterContainsQuestionIcon() {
        SelenideElement questionIcon = homePage.getFooter().getQuestionIcon();
        assertTrue(questionIcon.exists() && questionIcon.isDisplayed(), " Expected Question Icon to exist on Page and to be displayed.");
    }

    @Test(testName = "Verify the footer contains reset icon.",
            description = "This test verify if footer contains reset icon.")
    public void verifyDemoShopFooterContainsResetIcon() {
        SelenideElement resetIcon = homePage.getFooter().getResetIcon();
        assertTrue(resetIcon.exists(), "Expected Reset Icon to exist on Page.");
        assertTrue(resetIcon.isDisplayed(), "Expected Reset Icon to be displayed.");
    }


}
