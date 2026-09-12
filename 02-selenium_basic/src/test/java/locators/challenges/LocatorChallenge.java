package locators.challenges;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorChallenge {
    public static void main(String[] args) {
        // Buka https://the-internet.herokuapp.com/login
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        // Cari username menggunakan By.id()
        WebElement username = driver.findElement(By.id("username"));
        // Isi username: tomsmith
        username.sendKeys("tomsmith");
        // Cari password menggunakan By.id()
        WebElement password = driver.findElement(By.id("password"));
        // Isi password: SuperSecretPassword!
        password.sendKeys("SuperSecretPassword!");
        // Cari tombol login menggunakan By.cssSelector()
        WebElement btnLogin = driver.findElement(By.cssSelector("button[type='submit']"));
        // Klik tombol login
        btnLogin.click();
        // quit()
        driver.quit();
    }
}
