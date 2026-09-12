package waits.examples;

// [Java - Time]
// Tujuan: Menentukan batas waktu Explicit Wait.
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForSingleElementExample {

        public static void main(String[] args) {

                // [Selenium - WebDriver]
                // Tujuan: Membuat browser Chrome.
                WebDriver driver = new ChromeDriver();

                // [Selenium - Navigation]
                // Tujuan: Membuka halaman login.
                driver.get("https://the-internet.herokuapp.com/login");

                // [Selenium - Explicit Wait]
                // Tujuan: Membuat wait dengan batas waktu maksimal 10 detik.
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                // [Selenium - Explicit Wait]
                // Tujuan: Menunggu username sampai terlihat.
                WebElement username = wait.until(
                                ExpectedConditions.visibilityOfElementLocated(
                                                By.id("username")));

                // [Selenium - WebElement]
                // Tujuan: Mengisi username setelah element tersedia.
                username.sendKeys("tomsmith");

                // [Selenium - Explicit Wait]
                // Tujuan: Menunggu password sampai terlihat.
                WebElement password = wait.until(
                                ExpectedConditions.visibilityOfElementLocated(
                                                By.id("password")));

                // [Selenium - WebElement]
                // Tujuan: Mengisi password setelah element tersedia.
                password.sendKeys("SuperSecretPassword!");

                // [Selenium - Explicit Wait]
                // Tujuan: Menunggu tombol Login sampai bisa diklik.
                WebElement loginButton = wait.until(
                                ExpectedConditions.elementToBeClickable(
                                                By.cssSelector("button.radius")));

                // [Selenium - WebElement]
                // Tujuan: Mengklik tombol Login.
                loginButton.click();

                // [Selenium - Browser Control]
                // Tujuan: Menutup browser dan mengakhiri WebDriver session.
                driver.quit();
        }
}