package org.fasttrackit.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WishlistPage {

    private final SelenideElement pageWishlistSubtitle = $(".text-muted");
    private final SelenideElement wishlistIcon = $("[href='#/wishlist']");

    public String verifyNumberOfProductsInWishlist() {
        SelenideElement wishlistCounter = wishlistIcon.$(".fa-layers-counter");
        if (wishlistCounter.exists())
            return wishlistCounter.getText();
        return "";
    }

    public boolean validateWishlistIsDisplayed() {
        System.out.println("Verify wishlist is displayed. ");
        return this.pageWishlistSubtitle.exists() && this.pageWishlistSubtitle.isDisplayed();
    }


    public boolean validateWishlistIsNotDisplayed() {
        return !this.pageWishlistSubtitle.exists();
    }
}
