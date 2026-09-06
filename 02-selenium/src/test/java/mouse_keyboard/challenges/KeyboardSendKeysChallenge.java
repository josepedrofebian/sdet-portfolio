package mouse_keyboard.challenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardSendKeysChallenge {
    public static void main(String[] args) {
        // [Challenge]
        // 1. Buka browser Chrome.
        WebDriver driver = new ChromeDriver();
        // [Challenge]
        // 2. Buat Explicit Wait dengan timeout 10 detik.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // [Challenge]
        // 3. Gunakan try-catch-finally.
        try {
            // [Challenge]
            // 4. Buka halaman:
            // https://www.selenium.dev/selenium/web/mouse_interaction.html
            driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
            // [Challenge]
            // 5. Cari element input dengan id "clickable"
            // menggunakan Explicit Wait.
            WebElement elementInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clickable")));
            // [Challenge]
            // 6. Buat object Actions menggunakan WebDriver.
            Actions action = new Actions(driver);
            // [Challenge]
            // 7. Gunakan Actions untuk mengirim text:
            // "Hello Selenium"
            // ke element input.
            Actions input = action.sendKeys(elementInput, "Hello Selenium");
            // [Challenge]
            // 8. Eksekusi action menggunakan perform().
            input.perform();
            // [Challenge]
            // 9. Gunakan Actions untuk menekan tombol ENTER.
            Actions keyboardEnter = action.sendKeys(Keys.ENTER);
            // [Challenge]
            // 10. Eksekusi action menggunakan perform().
            keyboardEnter.perform();
        } catch (Exception e) {
            // [Challenge]
            // 11. Jika terjadi error, tampilkan:
            // System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e.getMessage());
        } finally {
            // [Challenge]
            // 12. Pastikan browser selalu ditutup menggunakan driver.quit().
            driver.quit();
        }
    }
}
