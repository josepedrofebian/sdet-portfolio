package mouse_keyboard.examples;

// [Java - Import] Mengimpor Duration untuk timeout Explicit Wait.
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardSendKeysExample {

    public static void main(String[] args) {

        // [Selenium - Browser] Membuka browser Chrome.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Wait] Membuat Explicit Wait dengan timeout 10 detik.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {

            // [Selenium - URL] Membuka halaman demo Selenium.
            driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

            // [Selenium - Element & Wait] Menunggu input sampai dapat diklik.
            WebElement input = wait.until(
                    ExpectedConditions.elementToBeClickable(By.id("clickable")));

            // [Selenium - Actions] Membuat object Actions untuk interaksi keyboard.
            Actions action = new Actions(driver);

            // [Selenium - Keyboard] Mengirim text ke input menggunakan keyboard.
            action.sendKeys(input, "Hello Selenium").perform();

            // [Selenium - Keyboard] Menekan tombol ENTER.
            action.sendKeys(Keys.ENTER).perform();

        } catch (Exception e) {

            // [Java - Exception Handling] Menampilkan pesan error.
            System.out.println("Error: " + e.getMessage());

        } finally {

            // [Selenium - Cleanup] Memastikan browser selalu ditutup.
            driver.quit();
        }
    }
}