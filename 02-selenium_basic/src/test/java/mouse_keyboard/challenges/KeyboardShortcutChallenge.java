package mouse_keyboard.challenges;

// [Java - Import] Mengimpor Duration untuk menentukan timeout Explicit Wait.
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardShortcutChallenge {

    public static void main(String[] args) {

        // [Selenium - Browser] Membuka browser Chrome.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Wait] Membuat Explicit Wait dengan timeout maksimal 10 detik.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {

            // [Selenium - URL] Membuka halaman demo Selenium.
            driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

            // [Selenium - Element & Wait] Menunggu input sampai terlihat dan mengambil
            // WebElement.
            WebElement elementInput = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("clickable")));

            // [Selenium - Actions] Membuat object Actions untuk melakukan keyboard
            // interaction.
            Actions action = new Actions(driver);

            // [Selenium - Keyboard] Mengisi input dengan text "Hello Selenium".
            action.sendKeys(elementInput, "Hello Selenium");

            // [Selenium - Keyboard] Menahan tombol CTRL.
            action.keyDown(Keys.CONTROL);

            // [Selenium - Keyboard] Menekan tombol A saat CTRL masih ditahan.
            action.sendKeys("a");

            // [Selenium - Keyboard] Melepaskan tombol CTRL.
            action.keyUp(Keys.CONTROL);

            // [Selenium - Keyboard] Mengeksekusi seluruh rangkaian keyboard action.
            action.perform();

        } catch (Exception e) {

            // [Java - Exception Handling] Menampilkan pesan error jika terjadi masalah.
            System.out.println("Error: " + e.getMessage());

        } finally {

            // [Selenium - Cleanup] Memastikan browser selalu ditutup setelah test selesai.
            driver.quit();
        }
    }
}