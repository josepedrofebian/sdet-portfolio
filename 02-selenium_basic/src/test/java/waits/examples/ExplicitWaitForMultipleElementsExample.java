package waits.examples;

// [Java - Time]
// Tujuan: Menentukan timeout Explicit Wait.
import java.time.Duration;

// [Java - Collections + Generic]
// Tujuan: Menyimpan banyak WebElement dalam List.
import java.util.List;

// [Selenium - Locator]
import org.openqa.selenium.By;

// [Selenium - WebDriver]
import org.openqa.selenium.WebDriver;

// [Selenium - WebElement]
import org.openqa.selenium.WebElement;

// [Selenium - Browser]
import org.openqa.selenium.chrome.ChromeDriver;

// [Selenium - Explicit Wait]
import org.openqa.selenium.support.ui.WebDriverWait;

// [Selenium - Expected Conditions]
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExplicitWaitForMultipleElementsExample {

    public static void main(String[] args) {

        // [Selenium - WebDriver]
        // Tujuan: Membuat browser Chrome.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Navigation]
        // Tujuan: Membuka halaman yang memiliki banyak link.
        driver.get("https://the-internet.herokuapp.com/");

        // [Selenium - Explicit Wait]
        // Tujuan: Membuat Explicit Wait dengan timeout 10 detik.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // [Selenium - Explicit Wait + List]
        // Tujuan: Menunggu sampai semua link yang ditemukan terlihat.
        List<WebElement> links = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.tagName("a")));

        // [Java - Enhanced For Loop]
        // Tujuan: Mengiterasi setiap WebElement dalam List.
        for (WebElement link : links) {

            // [Selenium - WebElement]
            // Tujuan: Mengambil text dari setiap link.
            System.out.println(link.getText());
        }

        // [Java - Collection]
        // Tujuan: Mengambil jumlah element dalam List.
        System.out.println("Total links: " + links.size());

        // [Selenium - Browser Control]
        // Tujuan: Mengakhiri WebDriver session.
        driver.quit();
    }
}