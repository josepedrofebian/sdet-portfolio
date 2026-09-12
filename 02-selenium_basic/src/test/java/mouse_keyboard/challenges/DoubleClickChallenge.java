package mouse_keyboard.challenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickChallenge {
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
            // 5. Cari element dengan id "clickable"
            // menggunakan Explicit Wait.
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("clickable")));
            // [Challenge]
            // 6. Buat object Actions menggunakan WebDriver.
            Actions action = new Actions(driver);
            // [Challenge]
            // 7. Gunakan doubleClick() pada element tersebut.
            Actions a = action.doubleClick(element);
            // [Challenge]
            // 8. Eksekusi action menggunakan perform().
            a.perform();

            WebElement elementAfterDoubleClick = wait
                    .until(ExpectedConditions.visibilityOfElementLocated(By.id("click-status")));

            String textAfterDoubleClick = elementAfterDoubleClick.getText();

            if ("double-clicked".equals(textAfterDoubleClick)) {
                System.out.println("Action: Double Click successfully");
            } else {
                throw new AssertionError("Fail: ekspektasi tidak sesuai");
            }
            // [Challenge]
            // 9. Jika terjadi error, tampilkan:
            // System.out.println("Error: " + e.getMessage());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
            // [Challenge]
            // 10. Pastikan browser selalu ditutup menggunakan driver.quit().
        } finally {
            driver.quit();
        }
    }
}
