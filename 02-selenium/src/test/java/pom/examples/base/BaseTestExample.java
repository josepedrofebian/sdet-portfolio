package pom.examples.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestExample {

    // [POM - WebDriver] Driver yang digunakan oleh test
    protected WebDriver driver;

    public void setUp() {
        // [Selenium - Setup] Membuka browser Chrome
        driver = new ChromeDriver();

        // [Selenium - Browser] Memaksimalkan window browser
        driver.manage().window().maximize();
    }

    public void tearDown() {
        // [Selenium - Cleanup] Menutup browser dan seluruh session
        if (driver != null) {
            driver.quit();
        }
    }
}