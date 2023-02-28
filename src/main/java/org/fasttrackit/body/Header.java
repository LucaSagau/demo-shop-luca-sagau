package org.fasttrackit.body;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Header {

    private final SelenideElement logoIcon = $(".fa-shopping-bag");
    private final SelenideElement cartIcon = $("[href='#/cart']");
    private final SelenideElement wishListIcon = $("[href='#/wishlist']");
    private final SelenideElement greetingsMessage = $(".navbar-text span span");
    private final SelenideElement signInButton = $(".fa-sign-in-alt");
    private final SelenideElement signOutButton = $(".fa-sign-out-alt");


    public Header() {
    }

    public Header(String user) {
    }

    /**
     * Getters
     */
    public SelenideElement getLogoIcon() {
        return logoIcon;
    }

    public SelenideElement getCartIcon() {
        return cartIcon;
    }

    public SelenideElement getWishListIcon() {
        return wishListIcon;
    }

    public String getGreetingsMessage() {
        return greetingsMessage.text();
    }

    public SelenideElement getSignInButton() {
        return signInButton;
    }

    /**
     * Actions
     */

    public void clickOnTheSignInButton() {

        this.signInButton.click();
    }

    public void clickOnTheWishlistIcon() {

        this.wishListIcon.click();
    }

    public void clickOnTheLogoButton() {
        this.logoIcon.scrollTo();
        this.logoIcon.click();
        sleep(150);
    }

    public void clickOnTheCartIcon() {

        this.cartIcon.click();
    }

    public void clickOnTheSignOutButton() {

        this.signOutButton.click();
    }


}
