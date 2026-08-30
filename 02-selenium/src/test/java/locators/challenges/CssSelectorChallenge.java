// Tentukan package sesuai lokasi file
package locators.challenges;

// Import WebDriver
// Import ChromeDriver
// Import WebElement
// Import By
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

// Buat class CssSelectorChallenge
public class CssSelectorChallenge {
    // Buat method main
    public static void main(String[] args) {
        // Buat ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Buka halaman login
        driver.get("https://the-internet.herokuapp.com/login");
        // Cari username menggunakan CSS Selector:
        // → gunakan TAG + ATTRIBUTE
        WebElement username = driver.findElement(By.cssSelector("input[id='username']"));
        // Isi username:
        // tomsmith
        username.sendKeys("tomsmith");
        // Cari password menggunakan CSS Selector:
        // → gunakan ATTRIBUTE
        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        // Isi password:
        // SuperSecretPassword!
        password.sendKeys("SuperSecretPassword!");
        // Cari tombol Login menggunakan CSS Selector:
        // → gunakan TAG + CLASS
        WebElement btnLogin = driver.findElement(By.cssSelector("button.radius"));
        // Klik tombol Login
        btnLogin.click();
        // Tutup browser dengan quit()
        driver.quit();
    }
}
