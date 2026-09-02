package iframe.challenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IframeSwitchingChallenge {
    public static void main(String[] args) {
        // [Selenium - Membuka browser]
        // Buat ChromeDriver untuk mengontrol browser Chrome.
        WebDriver driver = new ChromeDriver();
        // [Selenium - Membuat Explicit Wait]
        // Buat WebDriverWait dengan timeout 10 detik.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            // [Selenium - Membuka website]
            // Buka halaman Selenium IFrames Demo.
            // URL: https://www.selenium.dev/selenium/web/iframes.html
            driver.get("https://www.selenium.dev/selenium/web/iframes.html");
            // [Selenium - Menunggu iframe]
            // Gunakan Explicit Wait dengan frameToBeAvailableAndSwitchToIt()
            // untuk menunggu iframe dengan id "iframe1" tersedia sekaligus switch ke
            // dalamnya.
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframe1")));
            // [Selenium - Mencari element di dalam iframe]
            // Setelah berhasil switch ke iframe, cari element dengan id "email".
            // Gunakan Explicit Wait dengan visibilityOfElementLocated()
            // untuk memastikan input email sudah terlihat.
            WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

            // [Selenium - Mengisi input]
            // Masukkan text "qa.automation@example.com" ke dalam input email menggunakan
            // sendKeys().
            email.sendKeys("josepedro190299@gmail.com");
            // [Selenium - Mengambil value input]
            // Ambil current value dari input menggunakan getAttribute("value").
            // Simpan hasilnya ke dalam variable String.
            String emailValue = email.getAttribute("value");
            // [Java - Menampilkan hasil]
            // Print value email ke console.
            System.out.println(emailValue);
            // [Selenium - Kembali ke main document]
            // Gunakan driver.switchTo().defaultContent()
            // untuk kembali dari iframe ke main document.
            driver.switchTo().defaultContent();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            // [Selenium - Menutup browser]
            // Gunakan finally agar driver.quit() tetap dijalankan
            // meskipun terjadi error.
        } finally {
            driver.quit();
        }

    }
}
