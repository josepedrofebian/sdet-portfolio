package mouse_keyboard.examples;

// [Java - Import] Mengimpor Duration untuk menentukan timeout Explicit Wait.
import java.time.Duration;

// [Selenium - Import] Mengimpor By untuk mencari element.
import org.openqa.selenium.By;

// [Selenium - Import] Mengimpor WebDriver untuk mengontrol browser.
import org.openqa.selenium.WebDriver;

// [Selenium - Import] Mengimpor WebElement untuk merepresentasikan element.
import org.openqa.selenium.WebElement;

// [Selenium - Import] Mengimpor ChromeDriver untuk menjalankan Chrome.
import org.openqa.selenium.chrome.ChromeDriver;

// [Selenium - Import] Mengimpor Actions untuk interaksi mouse.
import org.openqa.selenium.interactions.Actions;

// [Selenium - Import] Mengimpor ExpectedConditions untuk Explicit Wait.
import org.openqa.selenium.support.ui.ExpectedConditions;

// [Selenium - Import] Mengimpor WebDriverWait untuk membuat Explicit Wait.
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropExample {

    public static void main(String[] args) {

        // [Selenium - Browser] Membuka browser Chrome.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Wait] Membuat Explicit Wait dengan timeout 10 detik.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {

            // [Selenium - URL] Membuka halaman demo Selenium.
            driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

            // [Selenium - Source] Menunggu element draggable sampai dapat ditemukan.
            WebElement draggable = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));

            // [Selenium - Target] Menunggu element droppable sampai dapat ditemukan.
            WebElement droppable = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("droppable")));

            // [Selenium - Actions] Membuat object Actions untuk interaksi mouse.
            Actions action = new Actions(driver);

            // [Selenium - Drag & Drop] Menyeret element draggable ke element droppable.
            action.dragAndDrop(draggable, droppable).perform();

        } catch (Exception e) {

            // [Java - Exception Handling] Menampilkan pesan error.
            System.out.println("Error: " + e.getMessage());

        } finally {

            // [Selenium - Cleanup] Memastikan browser selalu ditutup.
            driver.quit();
        }
    }
}