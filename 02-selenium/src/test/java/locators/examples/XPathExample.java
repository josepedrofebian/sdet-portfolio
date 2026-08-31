package locators.examples;

// [Selenium]
// Tujuan: Mengontrol browser.
import org.openqa.selenium.WebDriver;

// [Selenium]
// Tujuan: Membuat browser Chrome.
import org.openqa.selenium.chrome.ChromeDriver;

// [Selenium]
// Tujuan: Merepresentasikan element HTML.
import org.openqa.selenium.WebElement;

// [Selenium]
// Tujuan: Menentukan locator.
import org.openqa.selenium.By;

public class XPathExample {

    public static void main(String[] args) {

        // [Java - OOP + Polymorphism]
        // Tujuan: Membuat object ChromeDriver untuk mengontrol Chrome.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Navigation]
        // Tujuan: Membuka halaman login.
        driver.get("https://the-internet.herokuapp.com/login");

        // [XPath - Attribute]
        // Tujuan: Mencari username berdasarkan attribute id.
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));

        // [WebElement]
        // Tujuan: Mengisi username.
        username.sendKeys("tomsmith");

        // [XPath - Attribute]
        // Tujuan: Mencari password berdasarkan attribute id.
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

        // [WebElement]
        // Tujuan: Mengisi password.
        password.sendKeys("SuperSecretPassword!");

        // [XPath - text()]
        // Tujuan: Mencari button berdasarkan text "Login".
        WebElement loginButton = driver.findElement(By.xpath("//button[i[normalize-space(text())='Login']]"));

        // [WebElement]
        // Tujuan: Mengklik tombol Login.
        loginButton.click();

        // [Selenium - Browser Control]
        // Tujuan: Mengakhiri WebDriver session.
        driver.quit();
    }
}