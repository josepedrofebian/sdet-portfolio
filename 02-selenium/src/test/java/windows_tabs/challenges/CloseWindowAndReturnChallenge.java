package windows_tabs.challenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloseWindowAndReturnChallenge {

    public static void main(String[] args) {

        // ============================================================
        // CHALLENGE: CLOSE CHILD WINDOW & RETURN TO PARENT
        // ============================================================

        // [1] Buka browser menggunakan ChromeDriver.
        WebDriver driver = new ChromeDriver();
        // [2] Buat WebDriverWait dengan timeout 10 detik.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // [3] Buka halaman:
        // https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html
        driver.get("https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");
        // [4] Simpan window handle dari parent window.
        String parentWindow = driver.getWindowHandle();
        // [5] Klik "Open new window".
        //
        // Gunakan Explicit Wait dengan:
        // ExpectedConditions.elementToBeClickable()
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Open new window"))).click();
        // [6] Tunggu sampai window baru tersedia.
        wait.until();
        // [7] Ambil seluruh window handles.

        // [8] Loop seluruh window handles.

        // [9] Switch ke setiap window.

        // [10] Ambil title dari window yang sedang aktif.

        // [11] Cari window dengan title:
        // "Simple Page"

        // [12] Setelah child window ditemukan, hentikan looping.

        // [13] Tutup child window menggunakan:
        // driver.close()

        // [14] Switch kembali ke parent window menggunakan:
        // driver.switchTo().window()

        // [15] Ambil title parent window.

        // [16] Tampilkan:
        // "Returned to parent window: " + parentTitle

        // [17] Gunakan try-catch untuk menangani exception.

        // [18] Gunakan finally untuk:
        // driver.quit()

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
        // ExpectedConditions.numberOfWindowsToBe()
        // for loop
        // break

        // ============================================================
    }
}