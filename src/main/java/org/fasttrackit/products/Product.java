package org.fasttrackit.products;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Product {

    private final SelenideElement productTitle;
    private final SelenideElement productLink;
    private final SelenideElement card;
    private final SelenideElement productPhoto;
    private final SelenideElement addToBasket;
    private final SelenideElement addToFavorite;
    private final ElementsCollection counterProducts = $$(".fa-layers-counter");
    private final SelenideElement cartIcon = $("[href='#/cart']");
    private final SelenideElement productDescription;
    private final SelenideElement productPrice;
    private final SelenideElement productAvailability;

    public Product(String productId) {
        this.productTitle = $("small.text-muted");
        this.productLink = $(String.format(".card-body [href='#/product/%s']", productId));
        this.card = productLink.parent().parent();
        this.productPhoto = card.$(".card-img");
        this.addToBasket = card.$(".fa-cart-plus");
        this.addToFavorite = card.$(".fa-heart");
        this.productDescription = card.$(".text-center.card-body > p.card-text");
        this.productPrice = card.$(".text-center.card-footer > p.card-text:nth-child(1)");
        this.productAvailability = card.$("p.card-text:nth-child(4) > small:nth-child(1)");
    }

    /**
     * Getters
     */
    public SelenideElement getProductPhoto() {
        return productPhoto;
    }

    public SelenideElement getProductLink() {
        return productLink;
    }

    /**
     * Clicks
     */
    public void clickOnProduct() {
        this.productLink.click();
    }

    /**
     * Adds
     */
    public void addToBasket() {
        this.addToBasket.click();
    }

    public void addToFavorite() {
        this.addToFavorite.scrollTo();
        this.addToFavorite.click();

    }

    /**
     * Verifiers
     */
    public String verifyNumberOfProductsInBasket() {
        SelenideElement basketCounter = cartIcon.$(".fa-layers-counter");
        if (basketCounter.exists())
            return basketCounter.getText();
        return "";
    }
    public String verifyNumberOfProductsInWishlist() {
        SelenideElement basketCounter = cartIcon.$(".fa-layers-counter");
        if (basketCounter.exists())
            return basketCounter.getText();
        return "";
    }
    public boolean validateBaskettContainsProducts() {

        return !this.counterProducts.isEmpty();
    }
    /**
     * Validators-displayed
     */
    public boolean validateProductPhotoIsDisplayed() {
        return this.productPhoto.exists() && this.productPhoto.isDisplayed();
    }

    public boolean validateProductLinkIsDisplayed() {
        return this.productLink.exists() && this.productLink.isDisplayed();
    }



    public boolean validateProductsInCartAreDisplayed() {
        for (SelenideElement products : this.counterProducts) {
            if (!products.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean validateProductDescriptionIsDisplayed() {
        return this.productDescription.exists() && this.productDescription.isDisplayed();
    }


    public boolean validateAddToBasketIconIsDisplayed() {
        return this.addToBasket.exists() && this.addToBasket.isDisplayed();
    }
    public boolean validateAddToFavoriteIconIsDisplayed() {
        return this.addToFavorite.exists() && this.addToFavorite.isDisplayed();
    }
    public boolean validateProductPriceIsDisplayed() {
        return  this.productPrice.exists() && this.productPrice.isDisplayed();
    }

    public boolean validateProductAvailabilityIsDisplayed() {
        return  this.productAvailability.exists() && this.productAvailability.isDisplayed();
    }
    /**
     * Validators-displayed
     */

    public boolean validateProductLinkIsEnabled() {
        return this.productLink.isEnabled();
    }
    public boolean validateAddToBasketIconIsEnabled() {
        return this.addToBasket.isEnabled();
    }

    public boolean validateAddToFavoriteIconIsEnabled() {
        return this.addToFavorite.isEnabled();
    }


}
