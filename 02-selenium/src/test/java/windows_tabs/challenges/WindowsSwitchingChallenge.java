package windows_tabs.challenges;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsSwitchingChallenge {
    public static void main(String[] args) {
        // ============================================================
        // TARGET CONCEPT
        // ============================================================
        //
        // getWindowHandle()
        // getWindowHandles()
        // switchTo().window()
        // ExpectedConditions.numberOfWindowsToBe()
        // getTitle()
        // ============================================================
        // ============================================================
        // CHALLENGE: WINDOW SWITCHING
        // ============================================================
        // [1] Buka browser menggunakan ChromeDriver.
        WebDriver driver = new ChromeDriver();
        // [2] Buat WebDriverWait dengan timeout 10 detik.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            // [3] Buka halaman:
            // https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html
            driver.get("https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");
            // [4] Simpan window handle dari window utama.
            String originalWindow = driver.getWindowHandle();
            // [5] Cari link "Open new window" dan klik.
            driver.findElement(By.linkText("Open new window")).click();
            // [6] Gunakan Explicit Wait untuk menunggu sampai jumlah window
            // menjadi 2.
            // Hint: ExpectedConditions.numberOfWindowsToBe()
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
            // [7] Ambil semua window handles yang tersedia.
            Set<String> allWindow = driver.getWindowHandles();
            // [8] Gunakan looping untuk mencari window yang berbeda
            // dari window utama.
            for (String window : allWindow) {
                if (!window.equals(originalWindow)) {
                    // [9] Switch WebDriver ke window baru.
                    driver.switchTo().window(window);
                    // [10] Ambil title dari window yang sedang aktif menggunakan:
                    // driver.getTitle()
                    String titleWindowActive = driver.getTitle();
                    // [11] Tampilkan title window baru ke console.
                    System.out.println("Title Window Active: " + titleWindowActive);
                    // [12] Validasi bahwa title window baru adalah:
                    // "Simple Page"
                    //
                    // Jika sesuai:
                    // PASS: Successfully switched to new window.
                    //
                    // Jika tidak sesuai:
                    // FAIL: Unexpected window title.
                    if ("Simple Page".equals(titleWindowActive)) {
                        System.out.println("PASS: Successfully switched to new window.");
                    } else {
                        System.out.println("FAIL: Unexpected window title.");
                    }
                }

            }

        } catch (Exception e) {
            // [13] Gunakan try-catch untuk menangani exception.
            System.out.println("Error: " + e.getMessage());
        } finally {
            // [14] Gunakan finally untuk memastikan browser selalu ditutup
            // menggunakan driver.quit().
            driver.quit();
        }
    }
}
