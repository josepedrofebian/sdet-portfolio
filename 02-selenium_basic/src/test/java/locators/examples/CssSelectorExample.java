package locators.examples;

// [Selenium]
// Tujuan: Mengontrol browser.
import org.openqa.selenium.WebDriver;

// [Selenium]
// Tujuan: Membuat browser Chrome.
import org.openqa.selenium.chrome.ChromeDriver;

// [Selenium]
// Tujuan: Merepresentasikan element HTML yang ditemukan.
import org.openqa.selenium.WebElement;

// [Selenium - Locator]
// Tujuan: Menentukan selector untuk mencari element.
import org.openqa.selenium.By;

public class CssSelectorExample {

    public static void main(String[] args) {

        // [Java - OOP + Polymorphism]
        // Tujuan: Membuat object ChromeDriver untuk mengontrol Chrome.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Navigation]
        // Tujuan: Membuka halaman login.
        driver.get("https://the-internet.herokuapp.com/login");

        // [CSS Selector - ID]
        // Tujuan: Mencari username berdasarkan ID.
        WebElement username = driver.findElement(By.cssSelector("#username"));

        // [WebElement]
        // Tujuan: Mengisi username.
        username.sendKeys("tomsmith");

        // [CSS Selector - Attribute]
        // Tujuan: Mencari password berdasarkan attribute type.
        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));

        // [WebElement]
        // Tujuan: Mengisi password.
        password.sendKeys("SuperSecretPassword!");

        // [CSS Selector - Tag + Class]
        // Tujuan: Mencari button berdasarkan tag dan class.
        WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));

        // [WebElement]
        // Tujuan: Mengklik tombol login.
        loginButton.click();

        // [Selenium - Browser Control]
        // Tujuan: Mengakhiri WebDriver session.
        driver.quit();
    }
}