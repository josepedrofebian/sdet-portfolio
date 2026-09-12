package mouse_keyboard.examples;

// [Selenium - Import] Mengimpor class untuk mengontrol browser.
import org.openqa.selenium.WebDriver;

// [Selenium - Import] Mengimpor class untuk mencari element.
import org.openqa.selenium.By;

// [Selenium - Import] Mengimpor representasi WebElement.
import org.openqa.selenium.WebElement;

// [Selenium - Import] Mengimpor ChromeDriver.
import org.openqa.selenium.chrome.ChromeDriver;

// [Selenium - Import] Mengimpor Actions untuk interaksi mouse dan keyboard.
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {

    public static void main(String[] args) {

        // [Selenium - Browser] Membuka browser Chrome.
        WebDriver driver = new ChromeDriver();

        try {

            // [Selenium - URL] Membuka halaman demo Selenium.
            driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

            // [Selenium - Element] Mencari element yang akan diklik kanan.
            WebElement element = driver.findElement(By.id("click"));

            // [Selenium - Actions] Membuat object Actions.
            Actions actions = new Actions(driver);

            // [Selenium - Right Click] Melakukan klik kanan pada element.
            actions.contextClick(element).perform();

        } catch (Exception e) {

            // [Java - Exception Handling] Menampilkan pesan error.
            System.out.println("Error: " + e.getMessage());

        } finally {

            // [Selenium - Cleanup] Memastikan browser ditutup.
            driver.quit();
        }
    }
}