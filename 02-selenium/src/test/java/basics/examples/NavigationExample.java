package basics.examples;

// [Selenium]
// Tujuan: Interface untuk mengontrol browser.
import org.openqa.selenium.WebDriver;

// [Selenium]
// Tujuan: Implementasi WebDriver untuk Chrome.
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {

    public static void main(String[] args) {

        // [Java - OOP + Polymorphism]
        // Tujuan: Membuat object ChromeDriver untuk mengontrol Chrome.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Navigation]
        // Tujuan: Membuka halaman pertama.
        driver.get("https://www.google.com");

        // [Selenium - Navigation]
        // Tujuan: Membuka halaman berikutnya menggunakan browser navigation.
        driver.get("https://www.wikipedia.org");

        // [Selenium - Navigation]
        // Tujuan: Kembali ke halaman sebelumnya.
        driver.navigate().back();

        // [Selenium - Navigation]
        // Tujuan: Maju kembali ke halaman berikutnya.
        driver.navigate().forward();

        // [Selenium - Browser Control]
        // Tujuan: Mengakhiri WebDriver session.
        driver.quit();
    }
}