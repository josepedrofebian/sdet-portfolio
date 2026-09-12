package pom.challenges.tests;

// [Challenge - Test]

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.challenges.pages.LoginPageChallenge;

public class LoginTestChallenge {
    public static void main(String[] args) {
        // 1. Buat WebDriver menggunakan ChromeDriver.
        WebDriver driver = new ChromeDriver();
        // 2. Gunakan try-catch-finally.
        try {
            // 3. Buka:
            // https://the-internet.herokuapp.com/login
            driver.get("https://the-internet.herokuapp.com/login");
            // 4. Buat object LoginPageChallenge
            // dan kirim WebDriver ke constructor.
            LoginPageChallenge loginPage = new LoginPageChallenge(driver);
            // 5. Gunakan Page Object untuk:
            // - username: "tomsmith"
            // - password: "SuperSecretPassword!"
            // - click login.
            // 6. JANGAN menggunakan driver.findElement()
            // di dalam Test.
            // 7. JANGAN membuat locator By
            // di dalam Test.
            loginPage.enterUsername("tomsmith");
            loginPage.enterPassword("SuperSecretPassword!");
            loginPage.clickLogin();

            // Setelah proses login selesai, ambil flash message menggunakan Page Object.
            // Tampilkan flash message ke console.
            String flashMessage = loginPage.flashMessage();
            System.out.println("Flash Message: [" + flashMessage + "]");
            // Verifikasi bahwa flash message sesuai dengan:
            // "You logged into a secure area!"
            if ("You logged into a secure area!".equals(flashMessage)) {
                // Jika sesuai, tampilkan:
                // "PASS: Login berhasil."
                // Jika tidak sesuai, buat verification gagal menggunakan AssertionError.
                System.out.println("PASS: Login berhasil");
            } else {
                throw new AssertionError("Login Gagal");
            }
            // Jika sesuai, tampilkan:
            // "PASS: Login berhasil."
            // Jika tidak sesuai, buat verification gagal menggunakan AssertionError.

            // 8. Jika terjadi error:
            // System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            // 9. Pastikan browser ditutup:
            // driver.quit();
        } finally {
            driver.quit();
        }
    }
}
