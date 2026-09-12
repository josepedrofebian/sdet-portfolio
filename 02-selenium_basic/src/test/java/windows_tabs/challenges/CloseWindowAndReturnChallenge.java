package windows_tabs.challenges;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloseWindowAndReturnChallenge {

    // ============================================================
    // TARGET CONCEPT
    // ============================================================

    // getWindowHandle()
    // getWindowHandles()
    // switchTo().window()
    // close()
    // quit()
    // getTitle()
    // ExpectedConditions.elementToBeClickable()
    // Custom Explicit Wait dengan Lambda
    // for loop
    // break
    // try-catch-finally

    // ============================================================

    public static void main(String[] args) {

        // ============================================================
        // CHALLENGE: CLOSE CHILD WINDOW & RETURN TO PARENT
        // ============================================================

        // [1] Buka browser menggunakan ChromeDriver.
        WebDriver driver = new ChromeDriver();

        // [2] Buat WebDriverWait dengan timeout 10 detik.
        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10));

        try {

            // [3] Buka halaman yang menyediakan fitur membuka window baru.
            driver.get(
                    "https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");

            // [4] Ambil dan simpan window handle dari parent window.
            String parentWindow = driver.getWindowHandle();

            // [Selenium - Menyimpan title window child yang ingin dicari.]
            String titleWindowExpected = "Simple Page";

            // [Selenium - Menghitung jumlah window.]
            // Menyimpan jumlah window yang sedang terbuka sebelum membuka window baru.
            int initialWindowCount = driver.getWindowHandles().size();

            // [5] Tunggu sampai tombol "Open new window" dapat diklik.
            // Setelah clickable, klik tombol untuk membuka child window.
            wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.linkText("Open new window")))
                    .click();

            // [6] Tunggu sampai jumlah window bertambah.
            // Lambda digunakan untuk membuat custom Explicit Wait.
            wait.until(
                    currentDriver -> currentDriver.getWindowHandles().size() > initialWindowCount);

            // [7] Ambil seluruh window handles yang sedang terbuka.
            Set<String> windows = driver.getWindowHandles();

            // Menyimpan handle child window setelah window yang sesuai ditemukan.
            String childWindow = null;

            // [8] Loop seluruh window handles.
            for (String window : windows) {

                // [9] Switch WebDriver focus ke window yang sedang diperiksa.
                driver.switchTo().window(window);

                // [10] Ambil title dari window yang sedang aktif.
                String activeTitle = driver.getTitle();

                // [11] Cek apakah title window sama dengan title yang diharapkan.
                if (titleWindowExpected.equals(activeTitle)) {

                    // Simpan handle window yang berhasil ditemukan.
                    childWindow = window;

                    // Tampilkan informasi bahwa child window berhasil ditemukan.
                    System.out.println(
                            "Child window found: " + activeTitle);

                    // [12] Hentikan loop setelah child window ditemukan.
                    break;
                }
            }

            // [13] Pastikan child window berhasil ditemukan.
            if (childWindow != null) {

                // Switch ke child window yang sudah ditemukan.
                driver.switchTo().window(childWindow);

                // Tutup child window yang sedang aktif.
                driver.close();

                // Kembali ke parent window menggunakan window handle.
                driver.switchTo().window(parentWindow);

                // [15] Ambil title dari parent window setelah kembali.
                String titleParent = driver.getTitle();

                // [16] Tampilkan title parent window.
                System.out.println(
                        "Returned to parent window: " + titleParent);

            } else {

                // Jika child window tidak ditemukan,
                // lempar exception untuk menandakan validasi gagal.
                throw new IllegalStateException(
                        "Child window with title '"
                                + titleWindowExpected
                                + "' was not found.");
            }

            // [17] Tangani error ketika kondisi validasi window tidak terpenuhi.
        } catch (IllegalStateException e) {

            // Tampilkan pesan error validasi window.
            System.out.println(
                    "Window validation error: " + e.getMessage());

            // Tangani error ketika window yang ingin digunakan sudah tidak tersedia.
        } catch (NoSuchWindowException e) {

            // Tampilkan pesan error terkait window.
            System.out.println(
                    "Window error: " + e.getMessage());

            // Tangani error ketika Explicit Wait melebihi timeout.
        } catch (TimeoutException e) {

            // Tampilkan pesan error timeout.
            System.out.println(
                    "Timeout error: " + e.getMessage());

        } finally {

            // [18] Tutup seluruh WebDriver session.
            // quit() menutup semua window yang masih terbuka.
            driver.quit();
        }
    }
}