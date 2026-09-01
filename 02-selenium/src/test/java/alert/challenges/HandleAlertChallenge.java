package alert.challenges;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertChallenge {
    public static void main(String[] args) {
        // Buat ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Buka halaman JavaScript Alerts
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // Buat WebDriverWait
        // timeout 10 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Cari button:
        // "Click for JS Confirm"
        // Gunakan Explicit Wait:
        // visibilityOfElementLocated()
        WebElement btnAlert = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click for JS Confirm']")));

        // Click button
        btnAlert.click();

        // Tunggu JavaScript Alert:
        // alertIsPresent()
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        // Ambil text alert menggunakan:
        // getText()
        String alertText = alert.getText();
        // Print text alert
        System.out.println(alertText);
        // Dismiss alert menggunakan:
        // dismiss()
        alert.dismiss();
        // quit()
        driver.quit();
    }
}
