package org.fasttrackit.body;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Modal {

    private final SelenideElement modalTitle = $(".modal-title");
    private final SelenideElement closeButton = $(".close");
    private final SelenideElement username = $("#user-name");
    private final SelenideElement password = $("#password");
    private final SelenideElement loginButton = $(".btn.btn-primary");
    private final SelenideElement errorMessage = $(".error");


    /**
     * Getters
     */
    public String getModalTitle() {
        return modalTitle.text();
    }

    public SelenideElement getCloseButton() {
        return closeButton;
    }

    public SelenideElement getUsername() {
        return username;
    }

    public SelenideElement getPassword() {
        return password;
    }

    public SelenideElement getLoginButton() {
        return loginButton;
    }


    /**
     * Clicks
     */

    public void clickOnTheCloseButton() {

        this.closeButton.click();
        sleep(250);
    }

    public void clickOnUserNameField() {

        this.username.click();
    }

    public void clickOnPasswordField() {
        this.password.click();


    }

    public void clickOnTheLoginButton() {

        this.loginButton.click();
        sleep(200);
    }

    /**
     * Types
     */

    public void typeInUserNameField(String userToType) {

        this.username.click();
        this.username.sendKeys(userToType);
    }

    public void typeInPasswordField(String passwordToType) {

        this.password.click();
        this.password.sendKeys(passwordToType);
    }


    /**
     * Validators-displayed
     */
    public boolean validateCloseButtonIsDisplayed() {
        return this.closeButton.exists() && this.closeButton.isDisplayed();
    }

    public boolean validateUsernameFieldIsDisplayed() {
        return this.username.exists() && this.username.isDisplayed();
    }

    public boolean validatePasswordFieldIsDisplayed() {
        return this.password.exists() && this.password.isDisplayed();

    }

    public boolean validateThatLoginButtonIsDisplayed() {
        return this.loginButton.exists() && this.loginButton.isDisplayed();
    }


    public boolean validateErrorMsgIsDisplayed() {
        return this.errorMessage.exists() && this.errorMessage.isDisplayed();
    }

    public boolean validateLoginButtonIsDisplayed() {
        return this.loginButton.exists() && this.loginButton.isDisplayed();
    }

    /**
     * Validators-enabled
     */
    public boolean validateThatLoginButtonIsEnabled() {
        return this.loginButton.isEnabled();

    }

    public boolean validateCloseButtonIsEnabled() {
        return this.closeButton.isEnabled();
    }

    public boolean validateUsernameFieldIsEnabled() {
        return this.username.isEnabled();
    }

    public boolean validatePasswordFieldIsEnabled() {
        return this.password.isEnabled();
    }


    public boolean validateLoginButtonIsEnabled() {
        return this.loginButton.isEnabled();
    }
}
