package pom.examples.tests;

import pom.examples.base.BaseTestExample;
import pom.examples.pages.LoginPageExample;
import pom.examples.pages.SecureAreaPageExample;

public class LoginTestExample extends BaseTestExample {

    public static void main(String[] args) {

        // [POM - Test Setup] Buat object test
        LoginTestExample test = new LoginTestExample();

        // [POM - Test Setup] Jalankan browser setup
        test.setUp();

        try {
            // [Selenium - Navigation] Buka Login Page
            test.driver.get(
                    "https://the-internet.herokuapp.com/login");

            // [POM - Page Object] Buat object Login Page
            LoginPageExample loginPage = new LoginPageExample(test.driver);

            // [POM - Business Action] Login menggunakan credential
            SecureAreaPageExample secureAreaPage = loginPage.login(
                    "tomsmith",
                    "SuperSecretPassword!");

            // [POM - Verification] Ambil flash message
            System.out.println(
                    "Flash Message: "
                            + secureAreaPage.getFlashMessage());

            // [POM - Verification] Ambil heading
            System.out.println(
                    "Heading: "
                            + secureAreaPage.getHeading());
            // [POM - Business Action] Logout dari Secure Area
            LoginPageExample loginPageAfterLogout = secureAreaPage.logout();

            // [POM - Verification] Pastikan sudah kembali ke Login Page
            System.out.println(
                    "Logout berhasil, kembali ke Login Page");

        } catch (Exception e) {
            // [Java - Exception Handling] Tampilkan error
            System.out.println(
                    "Error: " + e.getMessage());

        } finally {
            // [POM - Test Cleanup] Tutup browser
            test.tearDown();
        }
    }
}