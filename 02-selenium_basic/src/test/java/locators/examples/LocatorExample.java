package locators.examples;

// [Selenium]
// Tujuan: Interface untuk mengontrol browser.
import org.openqa.selenium.WebDriver;

// [Selenium]
// Tujuan: Implementasi WebDriver untuk Chrome.
import org.openqa.selenium.chrome.ChromeDriver;

// [Selenium]
// Tujuan: Merepresentasikan element HTML yang ditemukan.
import org.openqa.selenium.WebElement;

// [Selenium]
// Tujuan: Menentukan cara/lokasi element yang ingin dicari.
import org.openqa.selenium.By;

public class LocatorExample {

    public static void main(String[] args) {

        // [Java - OOP + Polymorphism]
        // Tujuan: Membuat object ChromeDriver untuk mengontrol browser.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Navigation]
        // Tujuan: Membuka halaman login.
        driver.get("https://the-internet.herokuapp.com/login");

        // [Selenium - Locator: ID]
        // Tujuan: Mencari input username berdasarkan attribute id.
        WebElement username = driver.findElement(By.id("username"));

        // [Selenium - WebElement]
        // Tujuan: Memasukkan username ke input.
        username.sendKeys("tomsmith");

        // [Selenium - Locator: ID]
        // Tujuan: Mencari input password berdasarkan attribute id.
        WebElement password = driver.findElement(By.id("password"));

        // [Selenium - WebElement]
        // Tujuan: Memasukkan password ke input.
        password.sendKeys("SuperSecretPassword!");

        // [Selenium - Locator: CSS Selector]
        // Tujuan: Mencari tombol Login menggunakan CSS Selector.
        WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));

        // [Selenium - WebElement]
        // Tujuan: Mengklik tombol Login.
        loginButton.click();

        // [Selenium - Browser Control]
        // Tujuan: Mengakhiri WebDriver session.
        driver.quit();
    }
}