package pom.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pom.examples.base.BasePageExample;

public class SecureAreaPageExample extends BasePageExample {

    // [POM - Locator] Locator untuk flash message
    private final By flashMessage = By.id("flash");

    // [POM - Locator] Locator untuk heading Secure Area
    private final By secureAreaHeading = By.cssSelector("h2");

    // [POM - Locator] Locator untuk tombol logout
    private final By logoutButton = By.cssSelector(
            "a.button.secondary.radius");

    public SecureAreaPageExample(WebDriver driver) {
        // [POM - Constructor] Kirim driver ke BasePage
        super(driver);
    }

    public String getFlashMessage() {
        // [POM - Verification] Ambil text utama dari flash message
        return getText(flashMessage)
                .split("\\R")[0]
                .trim();
    }

    public String getHeading() {
        // [POM - Verification] Ambil text heading
        return getText(secureAreaHeading);
    }

    public LoginPageExample logout() {
        // [POM - Action] Klik tombol logout
        click(logoutButton);

        // [POM - Navigation] Tunggu sampai kembali ke Login Page
        waitForUrl("https://the-internet.herokuapp.com/login");

        // [POM - Navigation] Return Page Object tujuan
        return new LoginPageExample(driver);
    }
}