package mouse_keyboard.challenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverChallenge {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            // [Challenge]
            // 1. Buka browser Chrome.
            // [Challenge]
            // 2. Buka halaman:
            // https://www.selenium.dev/selenium/web/mouse_interaction.html
            driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
            // [Challenge]
            // 3. Cari element dengan id "hover".
            WebElement hover = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hover")));
            // [Challenge]
            // 4. Buat object Actions menggunakan WebDriver.
            Actions action = new Actions(driver);
            // [Challenge]
            // 5. Gunakan moveToElement() untuk melakukan mouse hover
            // ke element tersebut.
            // [Challenge]
            // 6. Eksekusi action menggunakan perform().
            action.moveToElement(hover).perform();

            // [Challenge]
            // 9. Pastikan browser selalu ditutup menggunakan driver.quit().
            // [Challenge]
        } catch (Exception e) {
            // [Challenge]
            // 8. Jika terjadi error, tampilkan pesan error menggunakan:
            // System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e.getMessage());
            // 7. Gunakan try-catch-finally.
        } finally {
            driver.quit();
        }
    }
}
