package pom.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pom.examples.base.BasePageExample;

public class LoginPageExample extends BasePageExample {

    // [POM - Locator] Locator untuk username
    private final By usernameInput = By.id("username");

    // [POM - Locator] Locator untuk password
    private final By passwordInput = By.id("password");

    // [POM - Locator] Locator untuk tombol login
    private final By loginButton = By.cssSelector("button.radius");

    public LoginPageExample(WebDriver driver) {
        // [POM - Constructor] Kirim driver ke BasePage
        super(driver);
    }

    public void enterUsername(String username) {
        // [POM - Action] Mengisi username
        type(usernameInput, username);
    }

    public void enterPassword(String password) {
        // [POM - Action] Mengisi password
        type(passwordInput, password);
    }

    public SecureAreaPageExample clickLogin() {
        // [POM - Action] Klik tombol login
        click(loginButton);

        // [POM - Navigation] Tunggu sampai halaman Secure Area terbuka
        waitForUrl("https://the-internet.herokuapp.com/secure");

        // [POM - Navigation] Return Page Object tujuan
        return new SecureAreaPageExample(driver);
    }

    public SecureAreaPageExample login(String username, String password) {
        // [POM - Business Action] Mengisi username
        enterUsername(username);

        // [POM - Business Action] Mengisi password
        enterPassword(password);

        // [POM - Business Action] Menjalankan proses login
        return clickLogin();
    }
}