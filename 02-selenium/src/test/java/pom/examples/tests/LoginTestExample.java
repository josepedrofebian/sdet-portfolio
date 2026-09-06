package pom.examples.tests;

// [Selenium - Import] Mengimpor WebDriver untuk mengontrol browser.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.examples.pages.LoginPageExample;

public class LoginTestExample {

    public static void main(String[] args) {

        // [Selenium - Browser] Membuka browser Chrome.
        WebDriver driver = new ChromeDriver();

        try {

            // [Selenium - URL] Membuka halaman Login.
            driver.get("https://the-internet.herokuapp.com/login");

            // [POM - Object] Membuat object LoginPageExample dan mengirim WebDriver ke
            // constructor.
            LoginPageExample loginPage = new LoginPageExample(driver);

            // [POM - Action] Mengisi username melalui Page Object.
            loginPage.enterUsername("tomsmith");

            // [POM - Action] Mengisi password melalui Page Object.
            loginPage.enterPassword("SuperSecretPassword!");

            // [POM - Action] Menekan tombol Login melalui Page Object.
            loginPage.clickLogin();

        } catch (Exception e) {

            // [Java - Exception Handling] Menampilkan pesan error jika terjadi masalah.
            System.out.println("Error: " + e.getMessage());

        } finally {

            // [Selenium - Cleanup] Memastikan browser selalu ditutup.
            driver.quit();
        }
    }
}