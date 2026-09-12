package mouse_keyboard.examples;

// [Selenium - Import] Mengimpor class untuk mengontrol browser.
import org.openqa.selenium.WebDriver;

// [Selenium - Import] Mengimpor class untuk mencari dan merepresentasikan element.
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// [Selenium - Import] Mengimpor ChromeDriver untuk menjalankan Chrome.
import org.openqa.selenium.chrome.ChromeDriver;

// [Selenium - Import] Mengimpor Actions untuk simulasi interaksi mouse dan keyboard.
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

    public static void main(String[] args) {

        // [Selenium - Browser] Membuka browser Chrome.
        WebDriver driver = new ChromeDriver();

        try {

            // [Selenium - URL] Membuka halaman demo Selenium untuk mouse interaction.
            driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

            // [Selenium - Element] Mencari element yang akan digunakan untuk mouse hover.
            WebElement element = driver.findElement(By.id("hover"));

            // [Selenium - Actions] Membuat object Actions untuk melakukan interaksi mouse.
            Actions actions = new Actions(driver);

            // [Selenium - Mouse Hover] Memindahkan cursor mouse ke element.
            actions.moveToElement(element).perform();

        } catch (Exception e) {

            // [Java - Exception Handling] Menampilkan pesan error jika terjadi masalah.
            System.out.println("Error: " + e.getMessage());

        } finally {

            // [Selenium - Cleanup] Memastikan browser selalu ditutup.
            driver.quit();
        }
    }
}