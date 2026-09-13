package framework.pages.store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.base.BasePage;
import framework.pages.store.components.CartComponent;

public class StorePage extends BasePage {

    // [Store Page] Locator tombol Cart
    private final By cartButton = By.id("ecom-cart-button");

    // [Store Page] Locator untuk memastikan Cart sudah tampil
    private final By cartPanel = By.xpath("//*[normalize-space()='Your Cart']");

    public StorePage(WebDriver driver) {
        super(driver);
    }

    // [Allure] Business action + automatic screenshot
    public void addProductToCart(String productName) {

        // [Store Page] Mencari Add to Cart button berdasarkan nama product
        By addToCartButton = By.xpath(
                "//div[contains(@data-testid, 'product-card-')]" +
                        "[.//div[contains(@data-testid, 'view-product-')" +
                        " and normalize-space()='" + productName + "']]" +
                        "//button[contains(@data-testid, 'add-to-cart-')]");

        // [Store Page] Klik tombol Add to Cart
        click(addToCartButton);
    }

    // [Allure] Business action + automatic screenshot
    public CartComponent openCart() {

        // [Store Page] Klik tombol Cart
        click(cartButton);

        // [Explicit Wait] Memastikan Cart Component sudah tampil
        waitForVisibility(cartPanel);

        // [Component Object] Return Cart Component
        return new CartComponent(driver);
    }
}