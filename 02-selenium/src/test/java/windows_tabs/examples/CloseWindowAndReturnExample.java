package windows_tabs.examples;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloseWindowAndReturnExample {

    public static void main(String[] args) {

        // [Selenium - Membuka browser]
        // Membuat instance ChromeDriver untuk menjalankan browser Chrome.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Explicit Wait]
        // Membuat WebDriverWait dengan timeout maksimal 10 detik.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {

            // [Selenium - Membuka halaman]
            // Membuka halaman resmi Selenium untuk latihan window switching.
            driver.get(
                    "https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");

            // [Selenium - Menyimpan parent window]
            // Menyimpan handle window utama sebelum membuka window baru.
            String parentWindow = driver.getWindowHandle();

            // [Selenium - Membuka window baru]
            // Menunggu link dapat diklik lalu membuka window baru.
            wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.linkText("Open new window")))
                    .click();

            // [Selenium - Explicit Wait]
            // Menunggu sampai window baru tersedia.
            wait.until(
                    ExpectedConditions.numberOfWindowsToBe(2));

            // [Selenium - Mendapatkan window handles]
            // Mengambil seluruh handle window yang sedang terbuka.
            Set<String> allWindows = driver.getWindowHandles();

            // [Selenium - Mencari child window]
            // Melakukan iterasi untuk menemukan window selain parent window.
            for (String window : allWindows) {

                // [Selenium - Switch window]
                // Berpindah ke window yang sedang diperiksa.
                driver.switchTo().window(window);

                // [Selenium - Membaca title]
                // Mengambil title dari window yang sedang aktif.
                String title = driver.getTitle();

                // [Selenium - Identifikasi window]
                // Memeriksa apakah window yang aktif adalah child window.
                if ("Simple Page".equals(title)) {

                    // [Java - Menampilkan hasil]
                    // Menampilkan bahwa child window berhasil ditemukan.
                    System.out.println("Child window found: " + title);

                    break;
                }
            }

            // [Selenium - Menutup window]
            // Menutup child window yang sedang aktif.
            driver.close();

            // [Selenium - Kembali ke parent window]
            // Mengembalikan fokus WebDriver ke parent window.
            driver.switchTo().window(parentWindow);

            // [Selenium - Membaca title]
            // Mengambil title dari parent window setelah kembali.
            String parentTitle = driver.getTitle();

            // [Java - Menampilkan hasil]
            // Menampilkan title parent window untuk memastikan switch berhasil.
            System.out.println("Returned to parent window: " + parentTitle);

        } catch (Exception e) {

            // [Java - Exception Handling]
            // Menampilkan pesan error jika terjadi exception.
            System.out.println("Error: " + e.getMessage());

        } finally {

            // [Selenium - Menutup browser]
            // Menutup seluruh window dan mengakhiri WebDriver session.
            driver.quit();
        }
    }
}