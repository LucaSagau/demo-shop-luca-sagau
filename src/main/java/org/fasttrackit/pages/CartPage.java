package org.fasttrackit.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement pageCartSubtitle = $("small.text-muted");
    private final SelenideElement addingSomeProductsInYourCart = $(".text-center");


    public boolean validateCartIsDisplayed() {
        System.out.println("Verify cart is displayed. ");
        return this.pageCartSubtitle.exists() && this.pageCartSubtitle.isDisplayed();
    }

    public boolean validateCartAddingMsgIsDisplayed() {
        System.out.println("Verify cart adding message is displayed. ");
        return this.addingSomeProductsInYourCart.exists() && this.addingSomeProductsInYourCart.isDisplayed();
    }



}
