package org.fasttrackit.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WishlistPage {

    private final SelenideElement pageWishlistSubtitle = $(".text-muted");
    private final SelenideElement wishlistIcon = $("[href='#/wishlist']");



    public boolean validateWishlistIsDisplayed() {
        System.out.println("Verify wishlist is displayed. ");
        return this.pageWishlistSubtitle.exists() && this.pageWishlistSubtitle.isDisplayed();
    }


}
