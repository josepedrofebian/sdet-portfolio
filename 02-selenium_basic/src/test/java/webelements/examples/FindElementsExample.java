package webelements.examples;

// [Java - Collections + Generic]
// Tujuan: Menyimpan banyak WebElement dalam sebuah List.
import java.util.List;

// [Selenium]
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {

    public static void main(String[] args) {

        // [Java - OOP + Polymorphism]
        // Tujuan: Membuat object ChromeDriver untuk mengontrol browser.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Navigation]
        // Tujuan: Membuka halaman yang memiliki banyak link.
        driver.get("https://the-internet.herokuapp.com/");

        // [Selenium - findElements + Generic]
        // Tujuan: Mengambil seluruh link yang ada di halaman.
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // [Java - Enhanced For Loop]
        // Tujuan: Mengiterasi seluruh link yang ditemukan.
        for (WebElement link : links) {

            // [Selenium - WebElement]
            // Tujuan: Mengambil text dari setiap link.
            System.out.println(link.getText());
        }

        // [Selenium - Browser Control]
        // Tujuan: Mengakhiri WebDriver session.
        driver.quit();
    }
}