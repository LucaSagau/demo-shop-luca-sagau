package org.fasttrackit.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement pageCartSubtitle = $("small.text-muted");
    private final SelenideElement addingSomeProductsInYourCart = $(".text-center");
    private final SelenideElement continueShoppingButton = $(".btn-danger");
    private final SelenideElement checkoutButton = $(".btn-success");
    private final SelenideElement itemsTotal = $(" tr:nth-child(1) > td.amount:nth-child(2)");
    private final SelenideElement tax = $(" tr:nth-child(2) > td.amount:nth-child(2)");
    private final SelenideElement total = $(".amount-total");
    private final SelenideElement cartIcon = $("[href='#/cart']");

    public String verifyNumberOfProductsInBasket() {
        SelenideElement basketCounter = cartIcon.$(".fa-layers-counter");
        if (basketCounter.exists())
            return basketCounter.getText();
        return "";
    }


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

    public boolean validateItemsTotalIsDisplayed() {
        return this.itemsTotal.exists() && this.itemsTotal.isDisplayed();
    }

    public boolean validateTaxIsDisplayed() {
        return  this.tax.exists() && this.tax.isDisplayed();
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
    /**
     * Clicks
     */
    public void clickOnCheckoutButton() {
        this.checkoutButton.click();
    }


    public boolean validateTotalIsDisplayed() {
        return  this.total.exists() && this.total.isDisplayed();
    }
}
