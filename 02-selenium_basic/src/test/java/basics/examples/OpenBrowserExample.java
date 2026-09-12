package basics.examples;

// [Selenium]
// Tujuan: Interface untuk mengontrol browser.
import org.openqa.selenium.WebDriver;

// [Selenium]
// Tujuan: Implementasi WebDriver untuk Chrome.
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserExample {

    public static void main(String[] args) {

        // [Java - OOP + Polymorphism]
        // Tujuan: Membuat object ChromeDriver untuk mengontrol browser.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Navigation]
        // Tujuan: Membuka URL di browser.
        driver.get("https://www.google.com");

        // [Selenium - Browser Control]
        // Tujuan: Mengakhiri WebDriver session dan menutup browser.
        driver.quit();
    }
}