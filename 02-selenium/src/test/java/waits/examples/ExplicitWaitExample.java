package waits.examples;

// [Java]
// Tujuan: Menentukan satuan waktu untuk Explicit Wait.
import java.time.Duration;

// [Selenium]
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// [Selenium - Wait]
// Tujuan: Membuat Explicit Wait.
import org.openqa.selenium.support.ui.WebDriverWait;

// [Selenium - Wait]
// Tujuan: Menentukan kondisi yang harus ditunggu.
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExplicitWaitExample {

        public static void main(String[] args) {

                // [Java - OOP + Polymorphism]
                // Tujuan: Membuat browser Chrome yang dikontrol Selenium.
                WebDriver driver = new ChromeDriver();

                // [Selenium - Navigation]
                // Tujuan: Membuka halaman login.
                driver.get("https://the-internet.herokuapp.com/login");

                // [Selenium - Explicit Wait]
                // Tujuan: Membuat wait dengan timeout maksimal 10 detik.
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                // [Selenium - Explicit Wait]
                // Tujuan: Menunggu username sampai tersedia di halaman.
                WebElement username = wait.until(
                                ExpectedConditions.visibilityOfElementLocated(
                                                By.id("username")));

                // [Selenium - WebElement]
                // Tujuan: Mengisi username setelah element tersedia.
                username.sendKeys("tomsmith");

                // [Selenium - Explicit Wait]
                // Tujuan: Menunggu password sampai tersedia.
                WebElement password = wait.until(
                                ExpectedConditions.visibilityOfElementLocated(
                                                By.id("password")));

                // [Selenium - WebElement]
                // Tujuan: Mengisi password.
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
                // Tujuan: Mengakhiri WebDriver session.
                driver.quit();
        }
}