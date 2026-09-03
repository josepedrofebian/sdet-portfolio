package windows_tabs.examples;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindowByTitleExample {

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

            // [Selenium - Mendapatkan window handle]
            // Menyimpan handle dari window utama sebelum membuka window baru.
            // String originalWindow = driver.getWindowHandle();

            // [Selenium - Membuka window baru]
            // Mengklik link untuk membuka window baru.
            driver.findElement(By.linkText("Open new window")).click();

            // [Selenium - Explicit Wait]
            // Menunggu sampai window baru benar-benar terbuka.
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));

            // [Selenium - Mendapatkan window handles]
            // Mengambil seluruh handle window yang sedang terbuka.
            Set<String> allWindows = driver.getWindowHandles();

            // [Selenium - Mencari window berdasarkan title]
            // Melakukan iterasi untuk menemukan window dengan title yang diinginkan.
            for (String window : allWindows) {

                // [Selenium - Switch window]
                // Berpindah ke window yang sedang diperiksa.
                driver.switchTo().window(window);

                // [Selenium - Membaca title]
                // Mengambil title dari window yang sedang aktif.
                String title = driver.getTitle();

                // [Selenium - Validasi window]
                // Memeriksa apakah title window sesuai dengan window tujuan.
                if ("Simple Page".equals(title)) {

                    // [Java - Menampilkan hasil]
                    // Menampilkan informasi bahwa window tujuan berhasil ditemukan.
                    System.out.println("Target window found: " + title);

                    // [Java - Menghentikan looping]
                    // Menghentikan pencarian setelah window tujuan ditemukan.
                    break;
                }
            }

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