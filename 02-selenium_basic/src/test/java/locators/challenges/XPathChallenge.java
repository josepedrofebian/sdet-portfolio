// Tentukan package sesuai lokasi file
package locators.challenges;

// Import WebDriver
import org.openqa.selenium.WebDriver;
// Import ChromeDriver
import org.openqa.selenium.chrome.ChromeDriver;
// Import WebElement
import org.openqa.selenium.WebElement;
// Import By
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

// Buat class XPathChallenge
public class XPathChallenge {
    // Buat method main
    public static void main(String[] args) {
        // Buat ChromeDriver
        WebDriver driver = new ChromeDriver();
        try {
            // Buka halaman login
            driver.get("https://the-internet.herokuapp.com/login");
            // Cari username menggunakan XPath:
            // → attribute id
            WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
            // Isi:
            // tomsmith
            username.sendKeys("tomsmith");
            // Cari password menggunakan XPath:
            // → attribute id
            WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
            // Isi:
            // SuperSecretPassword!
            password.sendKeys("SuperSecretPassword!");
            // Cari tombol Login menggunakan XPath:
            // → text()
            // → INGAT: text "Login" ada di dalam <i>, bukan langsung di <button>
            // → tangani whitespace pada text
            WebElement btnLogin = driver.findElement(By.xpath("//button[i[normalize-space(text())='Login']]"));
            // Klik tombol Login
            btnLogin.click();
        } catch (NoSuchElementException e) {
            System.out.println("elemen tidak ditemukan");
        } finally {
            // quit
            driver.quit();
        }
    }
}
