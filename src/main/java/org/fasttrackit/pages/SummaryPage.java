package org.fasttrackit.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SummaryPage {

    private final SelenideElement summaryTitle = $(".text-muted");
    private final SelenideElement cancelButtonSummary = $("a.btn.btn-danger:nth-child(1)");
    private final SelenideElement completeYourOrderButton = $(".btn-success");
    private final SelenideElement thankYouMessage = $(".text-center");
    private final SelenideElement orderCompleteTitle = $(".text-muted");
    private final SelenideElement continueShoppingSummaryButton = $("[href='#/products']");

    /**
     * Validators-displayed
     */
    public boolean validateSummaryTitleIsDisplayed() {
       return this.summaryTitle.exists() && this.summaryTitle.isDisplayed();
    }

    public boolean validateCancelButtonSummaryIsDisplayed() {
        return  this.cancelButtonSummary.exists() && this.cancelButtonSummary.isDisplayed();
    }

    public boolean validateCompleteYourOrderButtonIsDisplayed() {
        return  this.completeYourOrderButton.exists() && this.completeYourOrderButton.isDisplayed();
    }
    public boolean validateThankYouMessageIsDisplayed() {
        return  this.thankYouMessage.exists() && this.thankYouMessage.isDisplayed();
    }

    public boolean validateOrderCompleteTitleIsDisplayed() {
        return  this.orderCompleteTitle.exists() && this.orderCompleteTitle.isDisplayed();
    }

    public boolean validateContinueShoppingSummaryButtonDisplayed() {
        return  this.continueShoppingSummaryButton.exists() && this.continueShoppingSummaryButton.isDisplayed();
    }
    /**
     * Validators-enabled
     */

    public boolean validateCancelButtonSummaryIsEnabled() {
        this.cancelButtonSummary.scrollTo();
        return  this.cancelButtonSummary.isEnabled();
    }

    public boolean validateCompleteYourOrderButtonIsEnabled() {
        return  this.completeYourOrderButton.isEnabled();
    }
    public boolean validateContinueShoppingSummaryButtonEnabled() {
        return this.continueShoppingSummaryButton.isEnabled();
    }
    /**
     * Clicks
     */
    public void clickOnCompleteYourOrderButton() {
        this.completeYourOrderButton.click();
    }

    public void clickOnContinueShoppingSummaryButton() {
        this.continueShoppingSummaryButton.click();
    }


    }

