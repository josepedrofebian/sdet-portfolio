package pom.challenges.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageChallenge {
    // [Challenge - Page Object]

    // 1. Buat private WebDriver.
    private WebDriver driver;
    // 2. Buat private WebDriverWait dengan timeout 10 detik.
    private WebDriverWait wait;
    // 3. Buat locator:
    // username → id "username"
    // password → id "password"
    // login button → CSS "button.radius"
    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By btnLogin = By.cssSelector("button.radius");

    // Tambahkan locator untuk flash message setelah login.
    // Locator harus menggunakan private final By.
    private final By flashMessage = By.id("flash");

    // 4. Buat constructor yang menerima WebDriver.
    // 5. Simpan WebDriver dari constructor.
    // 6. Buat Explicit Wait menggunakan WebDriver.
    public LoginPageChallenge(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // 7. Buat method:
    // enterUsername(String username)
    //
    // Tunggu username sampai clickable,
    // kemudian masukkan username.
    public void enterUsername(String username) {
        wait.until(ExpectedConditions.elementToBeClickable(usernameInput)).sendKeys(username);
    }

    // 8. Buat method:
    // enterPassword(String password)
    //
    // Tunggu password sampai clickable,
    // kemudian masukkan password.
    public void enterPassword(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordInput)).sendKeys(password);
    }

    // 9. Buat method:
    // clickLogin()
    //
    // Tunggu login button sampai clickable,
    // kemudian lakukan click.
    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();
    }

    // Gunakan Explicit Wait untuk menunggu flash message.
    // Gunakan visibilityOfElementLocated().
    // Ambil text flash message menggunakan getText().
    // Return text tersebut dari method.
    public String flashMessage() {

        // [Selenium - Wait] Menunggu flash message sampai terlihat.
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(flashMessage)).getText().split("\\R")[0].trim();
    };

}
