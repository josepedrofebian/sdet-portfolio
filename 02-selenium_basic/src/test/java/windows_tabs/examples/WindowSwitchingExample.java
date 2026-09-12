package windows_tabs.examples;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowSwitchingExample {

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
            // Menyimpan ID window utama sebelum membuka window baru.
            String originalWindow = driver.getWindowHandle();

            // [Selenium - Membuka window baru]
            // Mencari link "Open new window" lalu mengkliknya.
            driver.findElement(By.linkText("Open new window")).click();

            // [Selenium - Explicit Wait]
            // Menunggu sampai jumlah window menjadi 2.
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));

            // [Selenium - Mendapatkan semua window handles]
            // Mengambil ID dari seluruh window/tab yang sedang terbuka.
            Set<String> allWindows = driver.getWindowHandles();

            // [Selenium - Switch window]
            // Mencari window yang berbeda dari window utama.
            for (String window : allWindows) {

                // [Selenium - Membandingkan window handle]
                // Memastikan window yang ditemukan bukan window utama.
                if (!window.equals(originalWindow)) {

                    // [Selenium - Berpindah window]
                    // Memindahkan fokus WebDriver ke window baru.
                    driver.switchTo().window(window);

                    break;
                }
            }

            // [Selenium - Membaca title]
            // Mengambil title dari window yang sedang aktif.
            String title = driver.getTitle();

            // [Java - Menampilkan hasil]
            // Menampilkan title window baru ke console.
            System.out.println("New window title: " + title);

            // [Java - Validasi]
            // Memastikan title window baru sesuai dengan yang diharapkan.
            if ("Simple Page".equals(title)) {
                System.out.println("PASS: Successfully switched to new window.");
            } else {
                System.out.println("FAIL: Unexpected window title.");
            }

        } catch (Exception e) {

            // [Java - Exception Handling]
            // Menangkap error yang terjadi selama proses window switching.
            System.out.println("Error: " + e.getMessage());

        } finally {

            // [Selenium - Menutup browser]
            // Menutup seluruh window dan mengakhiri WebDriver session.
            driver.quit();
        }
    }
}