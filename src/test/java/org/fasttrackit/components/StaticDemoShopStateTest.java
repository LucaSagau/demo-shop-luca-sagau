package org.fasttrackit.components;

import com.codeborne.selenide.SelenideElement;
import org.fasttrackit.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class StaticDemoShopStateTest {

    HomePage homePage = new HomePage();

    @Test
    public void verifyDemoShopAppTitle() {
        String appTitle = homePage.getPageTitle();
        assertEquals(appTitle, "Demo shop", "Application title is expected to be Demo shop");
    }

    @Test
    public void verifyDemoShopHeaderContainsLogoIcon() {
        SelenideElement logoIcon = homePage.getHeader().getLogoIcon();
        assertTrue(logoIcon.exists(), "Expected Logo Icon to exist on Page.");
        assertTrue(logoIcon.isDisplayed(), "Expected Logo Icon to be displayed.");
    }

    @Test
    public void verifyDemoShopHeaderContainsCartIcon() {
        SelenideElement cartIcon = homePage.getHeader().getCartIcon();
        assertTrue(cartIcon.exists(), "Expected Cart Icon to exist on Page.");
        assertTrue(cartIcon.isDisplayed(), "Expected Cart Icon to be displayed.");
    }

    @Test
    public void verifyDemoShopHeaderContainsWishlistIcon() {
        SelenideElement wishListIcon = homePage.getHeader().getWishListIcon();
        assertTrue(wishListIcon.exists(), "Expected Wishlist Icon to exist on Page.");
        assertTrue(wishListIcon.isDisplayed(), "Expected Wishlist Icon to be displayed.");
    }

    @Test
    public void verifyDemoShopHeaderContainsGreetingsMessage() {
        String greetingsMessage = homePage.getHeader().getGreetingsMessage();
        assertEquals(greetingsMessage, "Hello guest!", "Expected greetings message to be : Hello guest!");
    }

    @Test
    public void verifyDemoShopHeaderContainsLoginButton() {
        SelenideElement loginButton = homePage.getHeader().getSignInButton();
        assertTrue(loginButton.exists(), "Expected Login Button to exist on Page.");
        assertTrue(loginButton.isDisplayed(), "Expected Login Button to be displayed.");
    }

    @Test
    public void verifyDemoShopFooterDetails() {
        String details = homePage.getFooter().getDetails();
        assertEquals(details, "Demo Shop | build date 2021-05-21 14:04:30 GTBDT", "Expected footer details to be : Demo Shop | build date 2021-05-21 14:04:30 GTBDT");
    }

    @Test
    public void verifyDemoShopFooterContainsQuestionIcon() {
        SelenideElement questionIcon = homePage.getFooter().getQuestionIcon();
        assertTrue(questionIcon.exists() && questionIcon.isDisplayed(), " Expected Question Icon to exist on Page and to be displayed.");
    }

    @Test
    public void verifyDemoShopFooterContainsResetIcon() {
        SelenideElement resetIcon = homePage.getFooter().getResetIcon();
        assertTrue(resetIcon.exists(), "Expected Reset Icon to exist on Page.");
        assertTrue(resetIcon.isDisplayed(), "Expected Reset Icon to be displayed.");
    }


}
