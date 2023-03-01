package org.fasttrackit.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class CheckoutPage {


    private final SelenideElement checkoutTitle = $(".text-muted");
    private final SelenideElement firstNameField = $("#first-name");
    private final SelenideElement lastNameField = $("#last-name");
    private final SelenideElement addressField = $("#address");
    private final SelenideElement cancelButtonCheckout = $(".fa-angle-left");
    private final SelenideElement continueCheckoutButton = $(".fa-angle-right");
    private final SelenideElement errorMessage = $(".error");

    /**
     * Validators-displayed
     */
    public boolean validateCheckoutTitleIsDisplayed() {
        return this.checkoutTitle.exists() && this.checkoutTitle.isDisplayed();
    }

    public boolean validateFirstNameFieldIsDisplayed() {
        return this.firstNameField.exists() && this.firstNameField.isDisplayed();
    }

    public boolean validateLastNameFieldIsDisplayed() {
        return this.lastNameField.exists() && this.lastNameField.isDisplayed();
    }

    public boolean validateAddressFieldIsDisplayed() {
        return  this.addressField.exists() && this.addressField.isDisplayed();
    }

    public boolean validateCancelButtonCheckoutIsDisplayed() {
        return  this.cancelButtonCheckout.exists() && this.cancelButtonCheckout.isDisplayed();
    }
    public boolean validateContinueCheckoutButtonIsDisplayed() {
        return  this.continueCheckoutButton.exists() && this.continueCheckoutButton.isDisplayed();
    }
    public boolean validateErrorMessageIsDisplayed() {
        return  this.errorMessage.exists() && this.errorMessage.isDisplayed();
    }
    /**
     * Validators-enabled
     */
    public boolean validateFirstNameFieldIsEnabled() {
        return this.firstNameField.isEnabled();
    }

    public boolean validateLastNameFieldIsEnabled() {
        return this.lastNameField.isEnabled();
    }

    public boolean validateAddressFieldIsEnabled() {
        return  this.addressField.isEnabled();
    }


    public boolean validateCancelButtonCheckoutIsEnabled() {
        return  this.cancelButtonCheckout.isEnabled();
    }


    public boolean validateContinueCheckoutButtonIsEnabled() {
        return  this.continueCheckoutButton.isEnabled();
    }
    /**
     * Clicks
     */

    public void clickOnContinueCheckoutButton() {
        this.continueCheckoutButton.click();
        sleep(200);
    }

    public void clickOnFirstNameField() {
        this.firstNameField.click();
    }
    public void clickOnLastNameField() {
        this.lastNameField.click();
    }
    public void clickOnAddressField() {
        this.addressField.click();
    }
    /**
     *Types
     */
    public void typeOnFirstNameField(String firstName) {
        this.firstNameField.sendKeys(firstName);
    }


    public void typeOnLastNameField(String lastName) {
        this.lastNameField.sendKeys(lastName);
    }


    public void typeOnAddressField(String address) {
        this.addressField.sendKeys(address);
    }
}
