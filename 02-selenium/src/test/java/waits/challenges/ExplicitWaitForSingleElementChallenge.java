package waits.challenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForSingleElementChallenge {
    public static void main(String[] args) {
        // Buat ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Buka:
        // https://the-internet.herokuapp.com/login
        driver.get("https://the-internet.herokuapp.com/login");
        // Buat WebDriverWait
        // timeout 10 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Tunggu username menggunakan:
        // visibilityOfElementLocated()
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        // Isi:
        // tomsmith
        username.sendKeys("tomsmith");
        // Tunggu password menggunakan:
        // visibilityOfElementLocated()
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        // Isi:
        // SuperSecretPassword!
        password.sendKeys("SuperSecretPassword!");
        // Tunggu tombol Login menggunakan:
        // elementToBeClickable()
        WebElement btnLogin = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".radius")));
        // Klik Login
        btnLogin.click();
        // Tunggu flash message menggunakan:
        // visibilityOfElementLocated()
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".flash")));
        // Print text flash message
        System.out.println(message.getText());
        // quit()
        driver.quit();
    }
}
