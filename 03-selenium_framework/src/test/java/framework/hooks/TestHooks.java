package framework.hooks;

import org.openqa.selenium.WebDriver;

import framework.config.ConfigReader;
import framework.driver.DriverFactory;
import framework.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooks {

    // [Cucumber] Menjalankan setup sebelum setiap Scenario
    @Before
    public void setUp() {

        String browser = ConfigReader.get("browser");
        boolean headless = ConfigReader.getBoolean("headless");

        // [Driver] Membuat WebDriver melalui DriverFactory
        WebDriver driver = DriverFactory.createDriver(
                browser,
                headless);

        // [Driver] Menyimpan driver agar bisa digunakan Step Definition
        DriverManager.setDriver(driver);

        // [Browser] Memaksimalkan browser jika bukan headless
        if (!headless) {
            driver.manage().window().maximize();
        }

        // [Browser] Membuka halaman utama aplikasi
        driver.get(
                ConfigReader.get("baseUrl"));
    }

    // [Cucumber] Menjalankan teardown setelah setiap Scenario
    @After
    public void tearDown() {

        WebDriver driver = DriverManager.getDriver();

        // [Browser] Menutup browser setelah Scenario selesai
        if (driver != null) {
            driver.quit();
        }

        // [Driver] Membersihkan referensi driver
        DriverManager.removeDriver();
    }
}