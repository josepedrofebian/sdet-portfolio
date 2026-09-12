package mouse_keyboard.examples;

// [Java - Import] Mengimpor Duration untuk timeout Explicit Wait.
import java.time.Duration;

// [Selenium - Import] Mengimpor By untuk mencari element.
import org.openqa.selenium.By;

// [Selenium - Import] Mengimpor Keys untuk tombol keyboard.
import org.openqa.selenium.Keys;

// [Selenium - Import] Mengimpor WebDriver untuk mengontrol browser.
import org.openqa.selenium.WebDriver;

// [Selenium - Import] Mengimpor WebElement untuk merepresentasikan element.
import org.openqa.selenium.WebElement;

// [Selenium - Import] Mengimpor ChromeDriver untuk menjalankan Chrome.
import org.openqa.selenium.chrome.ChromeDriver;

// [Selenium - Import] Mengimpor Actions untuk interaksi keyboard.
import org.openqa.selenium.interactions.Actions;

// [Selenium - Import] Mengimpor ExpectedConditions untuk Explicit Wait.
import org.openqa.selenium.support.ui.ExpectedConditions;

// [Selenium - Import] Mengimpor WebDriverWait untuk membuat Explicit Wait.
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardShortcutExample {

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

            // [Selenium - Keyboard] Mengisi input dengan text terlebih dahulu.
            action.sendKeys(input, "Hello Selenium").perform();

            // [Selenium - Keyboard] Menahan tombol CTRL.
            action.keyDown(Keys.CONTROL);

            // [Selenium - Keyboard] Menekan tombol A saat CTRL masih ditahan.
            action.sendKeys("a");

            // [Selenium - Keyboard] Melepaskan tombol CTRL.
            action.keyUp(Keys.CONTROL);

            // [Selenium - Keyboard] Mengeksekusi rangkaian CTRL + A.
            action.perform();

        } catch (Exception e) {

            // [Java - Exception Handling] Menampilkan pesan error.
            System.out.println("Error: " + e.getMessage());

        } finally {

            // [Selenium - Cleanup] Memastikan browser selalu ditutup.
            driver.quit();
        }
    }
}