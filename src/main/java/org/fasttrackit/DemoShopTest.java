package org.fasttrackit;

import org.fasttrackit.body.Header;
import org.fasttrackit.body.Modal;
import org.fasttrackit.pages.*;

public class DemoShopTest {
    public static final String DEMO_SHOP_TITLE = " Demo shop ";

    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        verifyStaticDemoShopPage(homePage);
        verifyLoginModal(homePage);
        verifyWishlistPageComponents(homePage);
        verifyCartPageComponents(homePage);
        verifySortPageComponents(homePage);
        verifySearchPageComponents(homePage);

        String beetleUser = "beetle";
        loginWithUser(homePage, beetleUser);
        validateLoggedInUser(homePage, beetleUser);


    }








    private static void verifySearchPageComponents(HomePage homePage) {
        homePage.validateSearchFieldIsDisplayed();
        homePage.validateSearchButtonIsDisplayed();
        homePage.validateSearchButtonIsEnabled();
        SearchPage searchPage = new SearchPage();
        searchPage.clickOnTheSearchField();
        String wordToType ="";
        searchPage.typeOnTheSearchField(wordToType);
        searchPage.clickOnTheSearchButton();
        homePage.clickOnTheLogoButton();
    }

    private static void verifySortPageComponents(HomePage homePage) {
        homePage.validateSortFieldIsDisplayed();
        SortDropDownMenu sortDropDownMenu = new SortDropDownMenu ();
        sortDropDownMenu.validateSortAToZIsDisplayedByDefault();
        homePage.clickOnTheSortMenu();
        sortDropDownMenu.validateSortZToAIsDisplayed();
        sortDropDownMenu.validateSortByPriceLowToHighIsDisplayed();
        sortDropDownMenu.validateSortByPriceHighToLowIsDisplayed();
        homePage.clickOnTheLogoButton();
    }

    private static void verifyCartPageComponents(HomePage homePage) {
        homePage.clickOnTheCartIcon();
        CartPage cartPage = new CartPage();
        cartPage.validateCartIsDisplayed();
        cartPage.validateCartAddingMsgIsDisplayed();
        homePage.clickOnTheLogoButton();

    }

    private static void verifyWishlistPageComponents(HomePage homePage) {
        homePage.clickOnTheWishlistIcon();
        WishlistPage wishlist = new WishlistPage();
        wishlist.validateWishlistIsDisplayed();
        homePage.clickOnTheLogoButton();
        homePage.validateWishlistIsNotDisplayed();
    }

    private static void verifyLoginModal(HomePage homePage) {
        homePage.clickOnTheSignInButton();
        homePage.validateModalIsDisplayed();
        Modal modal = new Modal();
        modal.getModalTitle();
        modal.validateCloseButtonIsDisplayed();
        modal.validateUsernameFieldIsDisplayed();
        modal.validatePasswordFieldIsDisplayed();
        modal.validateThatLoginButtonIsDisplayed();
        modal.validateThatLoginButtonIsEnabled();
        modal.clickOnTheCloseButton();
        homePage.validateModalIsNotDisplayed();
    }

    private static void verifyStaticDemoShopPage(HomePage homePage) {
        homePage.getPageTitle();
        homePage.validateThatHeaderContainsLogoIcon();
        homePage.validateThatHeaderContainsShoppingCartIcon();
        homePage.validateThatHeaderContainsWishlistIcon();
        homePage.validateThatHeaderContainsGreetingsMessage();
        homePage.validateThatHeaderContainsLoginButton();
        homePage.validateThatFooterContainsDetails();
        homePage.validateThatFooterContainsQuestionIcon();
        homePage.validateThatFooterContainsResetIcon();
    }

    private static void validateLoggedInUser(HomePage homePage, String beetleUser) {
        Header loggedInHeader = new Header(beetleUser);
        homePage.setHeader(loggedInHeader);
        homePage.validateThatHeaderContainsGreetingsMessage();
    }

    private static void loginWithUser(HomePage homePage, String beetleUser) { Modal modal;
        homePage.clickOnTheSignInButton();
        modal = new Modal();
        modal.clickOnUserNameField();
        modal.typeInUserNameField(beetleUser);
        modal.clickOnPasswordField();
        modal.typeInPasswordField("choochoo");
        modal.clickOnTheLoginButton();
    }

    }
