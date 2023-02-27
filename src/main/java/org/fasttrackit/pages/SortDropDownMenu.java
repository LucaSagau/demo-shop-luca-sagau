package org.fasttrackit.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SortDropDownMenu {

    private final SelenideElement sortField = $(".sort-products-select");
    private final SelenideElement sortAToZ = $("[value=az]");
    private final SelenideElement sortZToA = $("[value=za]");
    private final SelenideElement sortLowToHigh = $("[value=lohi]");
    private final SelenideElement sortHighToLow = $("[value=hilo]");

    public void clickOnTheSortField() {
        this.sortField.click();
    }
    /**
     * Validators-displayed
     */
    public boolean validateSortAToZIsDisplayedByDefault() {
        System.out.println("Verify that Sort by name (A to Z) is displayed.");
        this.sortAToZ.shouldBe( Condition.appear);
        this.sortAToZ.shouldBe(Condition.selected);
        return this.sortAToZ.exists() && this.sortAToZ.isDisplayed();
    }

    public boolean validateSortZToAIsDisplayed() {
        System.out.println("Verify that Sort by name (Z to A) is displayed.");
        return this.sortZToA.exists() && this.sortZToA.isDisplayed();
    }

    public boolean validateSortByPriceLowToHighIsDisplayed() {
        System.out.println("Verify that Sort by price (low to high) is displayed.");
        return this.sortLowToHigh.exists() && this.sortLowToHigh.isDisplayed();
    }

    public boolean validateSortByPriceHighToLowIsDisplayed() {
        System.out.println("Verify that Sort by price (high to low) is displayed.");
        return this.sortHighToLow.exists() && this.sortHighToLow.isDisplayed();
    }

    /**
     * Validators-enabled
     */
    public boolean validateSortAToZIsEnabled() {
        return this.sortAToZ.isEnabled();
    }

    public boolean validateSortZToAIsEnabled() {
        return this.sortZToA.isEnabled();
    }

    public boolean validateSortByPriceLowToHighIsEnabled() {
        return  this.sortLowToHigh.isEnabled();
    }

    public boolean validateSortByPriceHighToLowIsEnabled() {
        return  this.sortHighToLow.isEnabled();
    }
}
