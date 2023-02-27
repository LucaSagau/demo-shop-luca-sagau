package org.fasttrackit.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    private  final SelenideElement searchField = $("#input-search");
    private  final SelenideElement searchButton = $(".btn.btn-light.btn-sm");


    public SearchPage() {
    }

    public void clickOnTheSearchField() {
        this.searchField.click();
    }



    public void clickOnTheSearchButton() {
        System.out.println("Clicked on the search button.");
    }

    public void typeOnTheSearchField(String wordToType) {
        this.searchField.sendKeys(wordToType);
    }




}
