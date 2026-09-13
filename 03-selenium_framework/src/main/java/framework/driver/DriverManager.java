package framework.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    // [Driver] Menyimpan WebDriver yang sedang digunakan Scenario
    private static WebDriver driver;

    // [Driver] Menyimpan WebDriver ke DriverManager
    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    // [Driver] Mengambil WebDriver yang sedang aktif
    public static WebDriver getDriver() {
        return driver;
    }

    // [Driver] Membersihkan referensi WebDriver
    public static void removeDriver() {
        driver = null;
    }
}