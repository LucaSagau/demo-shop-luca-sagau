package org.fasttrackit.pages;

import static com.codeborne.selenide.Selenide.open;

public class Page {

    public Page() {
        System.out.println("Opening Page.");
        open("https://fasttrackit-test.netlify.app/#/");
    }
}
