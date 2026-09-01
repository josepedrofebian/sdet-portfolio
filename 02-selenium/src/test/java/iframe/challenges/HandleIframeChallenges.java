package iframe.challenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleIframeChallenges {

    public static void main(String[] args) {

        // [Selenium - WebDriver]
        // Tujuan: Membuat browser Chrome.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Navigation]
        // Tujuan: Membuka halaman iframe.
        driver.get("https://the-internet.herokuapp.com/iframe");

        // [Selenium - Explicit Wait]
        // Tujuan: Membuat wait maksimal 10 detik.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // [Selenium - Explicit Wait + Iframe]
        // Tujuan: Menunggu iframe tersedia lalu langsung masuk ke iframe.
        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        By.id("mce_0_ifr")));

        // [Selenium - Explicit Wait]
        // Tujuan: Menunggu editor sampai terlihat di dalam iframe.
        WebElement editor = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("tinymce")));

        // [Selenium - WebElement]
        // Tujuan: Mengisi text di dalam iframe.
        editor.clear();
        editor.sendKeys("Hello from Selenium!");

        // [Selenium - Frame Control]
        // Tujuan: Keluar dari iframe dan kembali ke halaman utama.
        driver.switchTo().defaultContent();

        // [Selenium - Browser Control]
        // Tujuan: Mengakhiri WebDriver session.
        driver.quit();
    }
}