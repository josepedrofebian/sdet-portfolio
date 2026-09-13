package framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    public static WebDriver createDriver(String browser, boolean headless) {

        // [Driver Factory] Validasi browser yang diberikan
        if (browser == null || browser.isBlank()) {
            throw new IllegalArgumentException(
                    "Browser tidak boleh kosong");
        }

        // [Driver Factory] Normalisasi nama browser
        String browserName = browser.toLowerCase().trim();

        // [Driver Factory] Buat WebDriver berdasarkan browser
        return switch (browserName) {

            case "chrome" -> createChromeDriver(headless);

            case "firefox" -> createFirefoxDriver(headless);

            case "edge" -> createEdgeDriver(headless);

            default -> throw new IllegalArgumentException(
                    "Browser tidak didukung: " + browser);
        };
    }

    private static WebDriver createChromeDriver(boolean headless) {

        // [Driver Factory] Buat ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // [Driver Factory] Aktifkan headless jika diperlukan
        if (headless) {
            options.addArguments("--headless=new");

            // [Driver Factory] Samakan ukuran viewport dengan browser normal
            options.addArguments("--window-size=1920,1080");
        }

        // [Driver Factory] Buat ChromeDriver dengan options
        return new ChromeDriver(options);
    }

    private static WebDriver createFirefoxDriver(boolean headless) {

        // [Driver Factory] Buat FirefoxOptions
        FirefoxOptions options = new FirefoxOptions();

        // [Driver Factory] Aktifkan headless jika diperlukan
        if (headless) {
            options.addArguments("-headless");

            // [Driver Factory] Samakan ukuran viewport dengan browser normal
            options.addArguments("--window-size=1920,1080");
        }

        // [Driver Factory] Buat FirefoxDriver dengan options
        return new FirefoxDriver(options);
    }

    private static WebDriver createEdgeDriver(boolean headless) {

        // [Driver Factory] Buat EdgeOptions
        EdgeOptions options = new EdgeOptions();

        // [Driver Factory] Aktifkan headless jika diperlukan
        if (headless) {
            options.addArguments("--headless=new");

            // [Driver Factory] Samakan ukuran viewport dengan browser normal
            options.addArguments("--window-size=1920,1080");
        }

        // [Driver Factory] Buat EdgeDriver dengan options
        return new EdgeDriver(options);
    }
}