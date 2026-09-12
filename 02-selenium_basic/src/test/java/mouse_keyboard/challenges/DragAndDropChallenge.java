package mouse_keyboard.challenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropChallenge {
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
            // 5. Cari element dengan id "draggable"
            // menggunakan Explicit Wait.
            WebElement draggable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
            // [Challenge]
            // 6. Cari element dengan id "droppable"
            // menggunakan Explicit Wait.
            WebElement droppable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("droppable")));
            // [Challenge]
            // 7. Buat object Actions menggunakan WebDriver.
            Actions action = new Actions(driver);
            // [Challenge]
            // 8. Gunakan dragAndDrop() untuk menyeret element
            // "draggable" ke element "droppable".
            Actions a = action.dragAndDrop(draggable, droppable);
            // [Challenge]
            // 9. Eksekusi action menggunakan perform().
            a.perform();

        } catch (Exception e) {
            // [Challenge]
            // 10. Jika terjadi error, tampilkan:
            // System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e.getMessage());

        } finally {
            // [Challenge]
            // 11. Pastikan browser selalu ditutup menggunakan driver.quit().
            driver.quit();
        }
    }
}