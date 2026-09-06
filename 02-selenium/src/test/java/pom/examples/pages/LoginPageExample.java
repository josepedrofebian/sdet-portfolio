package pom.examples.pages;

// [Java - Import] Mengimpor Duration untuk menentukan timeout Explicit Wait.
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageExample {

    // [POM - WebDriver] Menyimpan WebDriver yang diberikan oleh test.
    private WebDriver driver;

    // [POM - Wait] Menyimpan Explicit Wait yang digunakan oleh Page Object.
    private WebDriverWait wait;

    // [POM - Locator] Menyimpan locator untuk input username.
    private By usernameInput = By.id("username");

    // [POM - Locator] Menyimpan locator untuk input password.
    private By passwordInput = By.id("password");

    // [POM - Locator] Menyimpan locator untuk tombol Login.
    private By loginButton = By.cssSelector("button.radius");

    // [POM - Constructor] Menerima WebDriver dari test dan menyimpannya ke variable
    // driver.
    public LoginPageExample(WebDriver driver) {

        // [POM - WebDriver] Menyimpan WebDriver ke variable instance.
        this.driver = driver;

        // [POM - Wait] Membuat Explicit Wait dengan timeout maksimal 10 detik.
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // [POM - Action] Mengisi username pada halaman Login.
    public void enterUsername(String username) {

        // [Selenium - Wait & Element] Menunggu input username sampai dapat diklik lalu
        // mengisi text.
        wait.until(
                ExpectedConditions.elementToBeClickable(usernameInput)).sendKeys(username);
    }

    // [POM - Action] Mengisi password pada halaman Login.
    public void enterPassword(String password) {

        // [Selenium - Wait & Element] Menunggu input password sampai dapat diklik lalu
        // mengisi text.
        wait.until(
                ExpectedConditions.elementToBeClickable(passwordInput)).sendKeys(password);
    }

    // [POM - Action] Menekan tombol Login.
    public void clickLogin() {

        // [Selenium - Wait & Element] Menunggu tombol Login sampai dapat diklik lalu
        // melakukan click.
        wait.until(
                ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}