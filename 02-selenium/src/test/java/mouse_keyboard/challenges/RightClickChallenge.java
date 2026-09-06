package mouse_keyboard.challenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClickChallenge {
    public static void main(String[] args) {
        // [Challenge]
        // 1. Buka browser Chrome.
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            // [Challenge]
            // 2. Buka halaman:
            // https://www.selenium.dev/selenium/web/mouse_interaction.html
            driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
            // [Challenge]
            // 3. Cari element dengan id "click".
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("click")));
            // [Challenge]
            // 4. Buat object Actions menggunakan WebDriver.
            Actions action = new Actions(driver);
            // [Challenge]
            // 5. Gunakan contextClick() untuk melakukan klik kanan
            // pada element tersebut.
            Actions a = action.contextClick(element);
            // [Challenge]
            // 6. Eksekusi action menggunakan perform().
            a.perform();
        } catch (Exception e) {
            // [Challenge]
            // 7. Gunakan try-catch-finally.
            // [Challenge]
            // 8. Jika terjadi error, tampilkan:
            // System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e.getMessage());
        } finally {
            // [Challenge]
            // 9. Pastikan browser selalu ditutup menggunakan driver.quit().
            driver.quit();
        }
    }
}
