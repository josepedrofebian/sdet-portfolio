package windows_tabs.challenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Set;

public class SwitchWindowByTitleChallenge {
    // ============================================================
    // TARGET CONCEPT
    // ============================================================

    // getWindowHandle()
    // getWindowHandles()
    // switchTo().window()
    // ExpectedConditions.numberOfWindowsToBe()
    // getTitle()
    // for loop
    // break
    // ============================================================

    public static void main(String[] args) {

        // ============================================================
        // CHALLENGE: SWITCH WINDOW BY TITLE
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
            // ini gw skip ga kepake
            // [5] Buka window baru dengan mengklik:
            // "Open new window"
            WebElement triggerBtnNewWindow = wait
                    .until(ExpectedConditions.elementToBeClickable(By.linkText("Open new window")));
            triggerBtnNewWindow.click();
            // [6] Gunakan Explicit Wait untuk menunggu sampai jumlah window
            // menjadi 2.
            //
            // ini gw skip karena gw pengennya nnti jumlah window dinamis jadi gaperlu cek
            // banyak jumlah window

            // [8] Gunakan looping untuk memeriksa setiap window.
            // [9] Pada setiap iterasi, switch ke window tersebut.
            // [10] Ambil title dari window yang sedang aktif menggunakan:
            // driver.getTitle()
            Set<String> windows = driver.getWindowHandles();

            for (String window : windows) {
                driver.switchTo().window(window);
                String titleActive = driver.getTitle();
                // [11] Cari window dengan title:
                // "Simple Page"
                if ("Simple Page".equals(titleActive)) {
                    // [12] Jika window dengan title tersebut ditemukan:
                    // tampilkan:
                    // "Target window found: Simple Page"
                    System.out.println("Target window found: Simple Page");
                    // [13] Hentikan looping setelah window tujuan ditemukan.
                    break;
                }
            }

        } catch (Exception e) {
            // [14] Jika terjadi exception, tampilkan:
            // "Error: " + e.getMessage()
            System.out.println("Error: " + e.getMessage());
        } finally {
            // [15] Gunakan finally untuk memastikan:
            // driver.quit()
            driver.quit();
        }
    }
}