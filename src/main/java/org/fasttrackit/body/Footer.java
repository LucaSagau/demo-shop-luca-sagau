package org.fasttrackit.body;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Footer {


    private final SelenideElement details = $(".nav-link");
    private final SelenideElement questionIcon = $("[data-icon=question]");
    private final SelenideElement resetIcon = $("[data-icon=undo]");
    public Footer() {
    }

    public String getDetails() {
        return details.getText();
    }

    public SelenideElement getQuestionIcon() {

        return questionIcon;
    }

    public SelenideElement getResetIcon() {

        return resetIcon;
    }

    public void clickOnResetIcon() {
        this.resetIcon.click();
    }

}
