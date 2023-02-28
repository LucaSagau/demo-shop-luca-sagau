package org.fasttrackit.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement pageCartSubtitle = $("small.text-muted");
    private final SelenideElement addingSomeProductsInYourCart = $(".text-center");
    private final SelenideElement continueShoppingButton = $(".btn-danger");
    private final SelenideElement checkoutButton = $(".btn-success");

    /**
     * Validators-displayed
     */
    public boolean validateCartIsDisplayed() {
        System.out.println("Verify cart is displayed. ");
        return this.pageCartSubtitle.exists() && this.pageCartSubtitle.isDisplayed();
    }

    public boolean validateCartAddingMsgIsDisplayed() {
        System.out.println("Verify cart adding message is displayed. ");
        return this.addingSomeProductsInYourCart.exists() && this.addingSomeProductsInYourCart.isDisplayed();
    }

    public boolean validateContinueShoppingButtonIsDisplayed() {
        return this.continueShoppingButton.exists() && this.continueShoppingButton.isDisplayed();
    }

    public boolean validateCheckoutButtonIsDisplayed() {
        return this.checkoutButton.exists() && this.checkoutButton.isDisplayed();
    }

    /**
     * Validators-enabled
     */
    public boolean validateContinueShoppingButtonIsEnabled() {
        return this.continueShoppingButton.isEnabled();
    }


    public boolean validateCheckoutButtonIsEnabled() {
        return this.checkoutButton.isEnabled();
    }

    public void clickOnCheckoutButton() {
        this.checkoutButton.click();
    }
}
