package framework.pages.store.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.base.BasePage;

public class CartComponent extends BasePage {

    // [Cart Component] Locator untuk product item di dalam Cart
    private final By cartItem = By.cssSelector(".list-group-item");

    public CartComponent(WebDriver driver) {
        super(driver);
    }

    // [Allure] Mengambil informasi product dari Cart
    public String getProductInfo() {

        return getText(cartItem);
    }
}