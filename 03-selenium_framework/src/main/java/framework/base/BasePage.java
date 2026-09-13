package framework.base;

import java.time.Duration;
import java.util.List;
import framework.config.ConfigReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    // [POM - WebDriver] Driver yang digunakan oleh seluruh Page Object
    protected WebDriver driver;

    // [POM - Explicit Wait] Wait yang digunakan oleh seluruh Page Object
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        // [Base Page] Simpan WebDriver dari test
        this.driver = driver;

        // [Config] Ambil timeout dari config.properties
        int timeout = ConfigReader.getInt("timeout");

        // [Wait] Buat explicit wait berdasarkan konfigurasi
        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(timeout));
    }

    // [Framework] Mengambil WebDriver yang digunakan Page Object
    public WebDriver getDriver() {
        return driver;
    }

    // ============================================================
    // ELEMENT ACTIONS
    // ============================================================

    protected void click(By locator) {
        // [Selenium - Click] Tunggu element clickable lalu klik
        wait.until(
                ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void type(By locator, String text) {
        // [Selenium - Type] Tunggu element clickable
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(locator));

        // [Selenium - Clear] Bersihkan nilai sebelumnya
        element.clear();

        // [Selenium - Type] Masukkan text
        element.sendKeys(text);
    }

    protected void sendKeys(By locator, String text) {
        // [Selenium - Send Keys] Tunggu element clickable lalu kirim text
        wait.until(
                ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
    }

    protected void clear(By locator) {
        // [Selenium - Clear] Tunggu element clickable lalu bersihkan input
        wait.until(
                ExpectedConditions.elementToBeClickable(locator)).clear();
    }

    // ============================================================
    // GET ELEMENT DATA
    // ============================================================

    protected String getText(By locator) {
        // [Selenium - Get Text] Tunggu element visible lalu ambil text
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    protected String getAttribute(By locator, String attribute) {
        // [Selenium - Get Attribute] Tunggu element visible lalu ambil attribute
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)).getAttribute(attribute);
    }

    protected boolean isDisplayed(By locator) {
        // [Selenium - Visibility] Cek apakah element tampil
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }

    protected boolean isEnabled(By locator) {
        // [Selenium - State] Tunggu element visible lalu cek enabled
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)).isEnabled();
    }

    // ============================================================
    // MULTIPLE ELEMENTS
    // ============================================================

    protected List<WebElement> getElements(By locator) {
        // [Selenium - Multiple Elements] Tunggu seluruh element tersedia
        return wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    protected int getElementCount(By locator) {
        // [Selenium - Multiple Elements] Ambil jumlah element
        return getElements(locator).size();
    }

    // ============================================================
    // WAIT CONDITIONS
    // ============================================================

    protected void waitForVisibility(By locator) {
        // [Explicit Wait] Tunggu sampai element visible
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForPresence(By locator) {
        // [Explicit Wait] Tunggu sampai element tersedia di DOM
        wait.until(
                ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void waitForClickable(By locator) {
        // [Explicit Wait] Tunggu sampai element clickable
        wait.until(
                ExpectedConditions.elementToBeClickable(locator));
    }

    protected void waitForInvisibility(By locator) {
        // [Explicit Wait] Tunggu sampai element menghilang
        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForUrl(String url) {
        // [Explicit Wait] Tunggu sampai URL sesuai
        wait.until(
                ExpectedConditions.urlToBe(url));
    }

    protected void waitForUrlContains(String text) {
        // [Explicit Wait] Tunggu sampai URL mengandung text
        wait.until(
                ExpectedConditions.urlContains(text));
    }

    protected void waitForTitle(String title) {
        // [Explicit Wait] Tunggu sampai title sesuai
        wait.until(
                ExpectedConditions.titleIs(title));
    }

    protected void waitForTitleContains(String text) {
        // [Explicit Wait] Tunggu sampai title mengandung text
        wait.until(
                ExpectedConditions.titleContains(text));
    }

    // ============================================================
    // PAGE INFORMATION
    // ============================================================

    protected String getCurrentUrl() {
        // [Selenium - Page Information] Ambil URL halaman saat ini
        return driver.getCurrentUrl();
    }

    protected String getPageTitle() {
        // [Selenium - Page Information] Ambil title halaman saat ini
        return driver.getTitle();
    }

    // ============================================================
    // BROWSER ACTIONS
    // ============================================================

    protected void navigateBack() {
        // [Selenium - Navigation] Kembali ke halaman sebelumnya
        driver.navigate().back();
    }

    protected void navigateForward() {
        // [Selenium - Navigation] Maju ke halaman berikutnya
        driver.navigate().forward();
    }

    protected void refreshPage() {
        // [Selenium - Navigation] Refresh halaman
        driver.navigate().refresh();
    }

    // ============================================================
    // SCROLL
    // ============================================================

    protected void scrollToElement(By locator) {
        // [Selenium - Scroll] Ambil element setelah menunggu tersedia
        WebElement element = wait.until(
                ExpectedConditions.presenceOfElementLocated(locator));

        // [Selenium - Scroll] Scroll element ke area viewport
        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block: 'center'});",
                        element);
    }
}