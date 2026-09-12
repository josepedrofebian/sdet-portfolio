package pom.examples.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageExample {

    // [POM - WebDriver] Driver yang digunakan oleh Page Object
    protected WebDriver driver;

    // [POM - Explicit Wait] Wait yang digunakan oleh semua Page Object
    protected WebDriverWait wait;

    public BasePageExample(WebDriver driver) {
        // [POM - Constructor] Simpan WebDriver dari test
        this.driver = driver;

        // [POM - Explicit Wait] Buat wait dengan timeout 10 detik
        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10));
    }

    protected void click(By locator) {
        // [Selenium - Explicit Wait] Tunggu element sampai clickable
        wait.until(
                ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void type(By locator, String text) {
        // [Selenium - Explicit Wait] Tunggu element sampai clickable
        wait.until(
                ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
    }

    protected String getText(By locator) {
        // [Selenium - Explicit Wait] Tunggu element sampai visible
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    protected void waitForUrl(String url) {
        // [Selenium - Explicit Wait] Tunggu sampai URL sesuai
        wait.until(
                ExpectedConditions.urlToBe(url));
    }
}