package alert.examples;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertExample {

        public static void main(String[] args) {

                // [Selenium - WebDriver]
                // Tujuan: Membuat browser Chrome.
                WebDriver driver = new ChromeDriver();

                // [Selenium - Navigation]
                // Tujuan: Membuka halaman JavaScript Alerts.
                driver.get(
                                "https://the-internet.herokuapp.com/javascript_alerts");

                // [Selenium - Explicit Wait]
                // Tujuan: Membuat wait maksimal 10 detik.
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                // [Selenium - Explicit Wait]
                // Tujuan: Menunggu button sampai terlihat.
                WebElement button = wait.until(
                                ExpectedConditions.visibilityOfElementLocated(
                                                By.xpath("//button[text()='Click for JS Alert']")));

                // [Selenium - WebElement]
                // Tujuan: Memunculkan JavaScript Alert.
                button.click();

                // [Selenium - Explicit Wait]
                // Tujuan: Menunggu alert sampai muncul.
                Alert alert = wait.until(
                                ExpectedConditions.alertIsPresent());

                // [Selenium - Alert]
                // Tujuan: Mengambil text alert.
                System.out.println(alert.getText());

                // [Selenium - Alert]
                // Tujuan: Menekan OK pada alert.
                alert.accept();

                // [Selenium - Browser Control]
                // Tujuan: Menutup browser.
                driver.quit();
        }
}