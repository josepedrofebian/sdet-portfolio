package iframe.examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IframeSwitchingExample {

    public static void main(String[] args) {

        // [Selenium - Membuka browser]
        // Membuat ChromeDriver untuk mengontrol browser Chrome.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Membuat Explicit Wait]
        // Membuat wait dengan timeout maksimal 10 detik.
        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10));

        try {

            // [Selenium - Membuka website]
            // Membuka halaman demo iframe dari Selenium.
            driver.get("https://www.selenium.dev/selenium/web/iframes.html");

            // [Selenium - Switch ke iframe]
            // Menunggu iframe tersedia lalu memindahkan browsing context
            // Selenium dari main document ke document di dalam iframe.
            wait.until(
                    ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                            By.id("iframe1")));

            // [Selenium - Mencari element di dalam iframe]
            // Setelah switch, pencarian element dilakukan pada document iframe.
            WebElement email = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.id("email")));

            // [Selenium - Mengisi input]
            // Memasukkan alamat email ke input yang berada di dalam iframe.
            email.sendKeys("test@example.com");

            // [Selenium - Membaca value input]
            // Mengambil value yang sedang tersimpan di dalam attribute value.
            String emailValue = email.getAttribute("value");

            // [Java - Menampilkan hasil]
            // Menampilkan value input ke console.
            System.out.println("Email: " + emailValue);

            // [Selenium - Kembali ke main document]
            // Mengembalikan browsing context Selenium ke document utama.
            driver.switchTo().defaultContent();

        } finally {

            // [Selenium - Menutup browser]
            // Memastikan browser selalu ditutup meskipun terjadi error.
            driver.quit();
        }
    }
}