package org.fasttrackit.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.fasttrackit.body.Footer;
import org.fasttrackit.body.Header;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HomePage extends Page{

    private final String title = Selenide.title();

    private Header header;
    private final Footer footer;
    private final SortDropDownMenu sortDropDownMenu;
    private final SearchPage searchPage;
    private final SelenideElement modal = $(".modal-dialog");
    private final SelenideElement pageWishlistSubtitle = $(".text-muted");
    private final SelenideElement pageCartSubtitle = $("small.text-muted");
    private final SelenideElement sortField = $(".sort-products-select");
    private final SelenideElement searchField = $("#input-search");
    private final SelenideElement searchButton = $(".btn.btn-light.btn-sm");

    public HomePage() {
        System.out.println("Constructing Header.");
        this.header = new Header();
        System.out.println("Constructing Footer.");
        this.footer = new Footer();
        this.sortDropDownMenu = new SortDropDownMenu();
        this.searchPage = new SearchPage();

    }

    /**
     * Getters
     */
    public Footer getFooter() {
        return footer;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public String getPageTitle() {
        return title;
    }

    /**
     * Validators
     */
    public void validateThatHeaderContainsLogoIcon() {
        System.out.println("               ----------");
        System.out.println("Verify that logo is : " + header.getLogoIcon());
    }

    public void validateThatHeaderContainsShoppingCartIcon() {
        System.out.println("Verify that shopping cart is : " + header.getCartIcon());
    }

    public void validateThatHeaderContainsWishlistIcon() {
        System.out.println("Verify that wishlist is : " + header.getWishListIcon());
    }

    public String validateThatHeaderContainsGreetingsMessage() {
        System.out.println("Verify that greetings message is : " + header.getGreetingsMessage());
        return this.header.getGreetingsMessage();
    }

    public void validateThatHeaderContainsLoginButton() {
        System.out.println("Verify that login button is : " + header.getSignInButton());
        System.out.println("               ----------");
    }

    public void validateThatFooterContainsDetails() {
        System.out.println("Verify that details is : " + footer.getDetails());
    }

    public void validateThatFooterContainsQuestionIcon() {
        System.out.println("Verify that question icon is : " + footer.getQuestionIcon());
    }

    public void validateThatFooterContainsResetIcon() {
        System.out.println("Verify that reset icon is : " + footer.getResetIcon());
    }


    public boolean validateModalIsDisplayed() {
        System.out.println("Verify that the modal is displayed on page. ");
        return this.modal.exists() && this.modal.isDisplayed();
    }

    public boolean validateModalIsNotDisplayed() {
        System.out.println("Verify that modal is not on page. ");
        return !modal.isDisplayed();

    }

    public boolean validateWishlistIsNotDisplayed() {
        return pageWishlistSubtitle.exists();
    }


    public boolean validateSortFieldIsDisplayed() {
        return this.sortField.exists() && this.sortField.isDisplayed();
    }

    public boolean validateSearchFieldIsDisplayed() {
        System.out.println("Verify that search field is displayed.");
        return this.searchField.exists() && this.searchField.isDisplayed();
    }

    public boolean validateSearchButtonIsDisplayed() {
        System.out.println("Verify that search button is displayed.");
        return this.searchButton.exists() && this.searchButton.isDisplayed();
    }

    public boolean validateSearchButtonIsEnabled() {
        System.out.println("Verify that search button is enabled. ");
        return this.searchButton.isEnabled();
    }


    /**
     * Clicks
     */
    public void clickOnTheSignInButton() {
        System.out.println("Clicked on the open Modal Button.");
        this.header.clickOnTheSignInButton();
        sleep(150);
    }

    public void clickOnTheWishlistIcon() {
        this.header.clickOnTheWishlistIcon();
    }

    public void clickOnTheLogoButton() {
        this.header.clickOnTheLogoButton();

    }

    public void clickOnTheCartIcon() {
        this.header.clickOnTheCartIcon();
        sleep(200);
    }

    public void clickOnTheSortMenu() {
        this.sortDropDownMenu.clickOnTheSortField();

    }


    public void logUserOut() {
        this.header.clickOnTheSignOutButton();
    }

    public void returnToHomePage() {
        this.header.getLogoIcon().click();
    }

    public void resetPage() {
        this.footer.clickOnResetIcon();
    }


}
