package webelements.challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementActionChallenge {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Buka halaman login
        driver.get("https://the-internet.herokuapp.com/login");
        // Cari username dengan By.id()
        WebElement username = driver.findElement(By.id("username"));
        // Isi username "tomsmith"
        username.sendKeys("tomsmith");
        // Clear username
        username.clear();
        // Isi username "tomsmith" lagi
        username.sendKeys("tomsmith");
        // Cari password dengan By.id()
        WebElement password = driver.findElement(By.id("password"));
        // Isi password "SuperSecretPassword!"
        password.sendKeys("SuperSecretPassword!");
        // Cari tombol Login dengan CSS Selector
        WebElement btnLogin = driver.findElement(By.cssSelector(".radius"));
        // Click Login
        btnLogin.click();
        // Cari flash message
        WebElement message = driver.findElement(By.cssSelector(".flash"));
        // Gunakan getText()
        // Print message
        System.out.println(message.getText());
        // Gunakan getAttribute("class")
        // Print class
        System.out.println(message.getAttribute("class"));
        // quit()
        driver.quit();
    }
}
