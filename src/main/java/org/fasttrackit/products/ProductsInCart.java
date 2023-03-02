package org.fasttrackit.products;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductsInCart {

    private final SelenideElement productLinkCart;
    private final SelenideElement container;
    private final SelenideElement plusButton;
    private final SelenideElement minusButton;
    private final SelenideElement trashButton;
    private final SelenideElement priceSeveralProducts;
    private final SelenideElement priceOneProduct;

    public ProductsInCart(String productIdCart) {
        this.productLinkCart = $(String.format("#item_%s_title_link", productIdCart));
        this.container = productLinkCart.parent().parent();
        this.plusButton = container.$(".fa-plus-circle");
        this.minusButton = container.$(".fa-minus-circle");
        this.trashButton = container.$(".fa-trash");
        this.priceSeveralProducts = container.$(".col-md-auto:nth-child(3)");
        this.priceOneProduct = container.$(".col-md-auto:nth-child(2)");
    }

    /**
     * Quantity Modifiers
     */
    public void increaseNumberOfProducts() {
        this.plusButton.click();
    }

    public void decreaseNumberOfProducts() {
        this.minusButton.click();
    }

    public void deleteProductFromCart() {
        this.trashButton.click();

    }

    /**
     * Validators-displayed
     */
    public boolean validateMinusButtonIsDisplayedForAllProducts() {
        return this.minusButton.exists() && this.minusButton.isDisplayed();
    }

    public boolean validatePlusButtonIsDisplayedForAllProducts() {
        return this.plusButton.exists() && this.plusButton.isDisplayed();
    }

    public boolean validatePriceForOneProductIsDisplayedForAllProducts() {
        return this.priceOneProduct.exists() && this.priceOneProduct.isDisplayed();
    }

    public boolean validatePriceForSeveralProductsIsDisplayedForAllProducts() {
        return this.priceSeveralProducts.exists() && this.priceSeveralProducts.isDisplayed();
    }

    public boolean validateProductLinkIsDisplayedForAllProducts() {
        return this.productLinkCart.exists() && this.productLinkCart.isDisplayed();
    }

    public boolean validateTrashButtonIsDisplayedForAllProducts() {
        return this.trashButton.exists() && this.trashButton.isDisplayed();
    }

    /**
     * Validators-enabled
     */

    public boolean validateMinusButtonIsEnabledForAllProducts() {
        return this.minusButton.isEnabled();
    }

    public boolean validatePlusButtonIsEnabledForAllProducts() {
        return this.plusButton.isEnabled();
    }

    public boolean validateProductLinkIsEnabledForAllProducts() {
        return this.productLinkCart.isEnabled();
    }

    public boolean validateTrashButtonIsEnabledForAllProducts() {
        return this.trashButton.isEnabled();
    }














}
