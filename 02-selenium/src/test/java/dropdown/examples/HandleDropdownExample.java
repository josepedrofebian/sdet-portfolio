package dropdown.examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDropdownExample {

    public static void main(String[] args) {

        // [Selenium - WebDriver]
        // Tujuan: Membuat browser Chrome.
        WebDriver driver = new ChromeDriver();

        // [Selenium - Navigation]
        // Tujuan: Membuka halaman dropdown.
        driver.get("https://the-internet.herokuapp.com/dropdown");

        // [Selenium - Explicit Wait]
        // Tujuan: Membuat wait maksimal 10 detik.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // [Selenium - Explicit Wait]
        // Tujuan: Menunggu dropdown sampai terlihat.
        WebElement dropdownElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("dropdown")));

        // [Selenium - Select]
        // Tujuan: Membuat object Select dari element <select>.
        Select dropdown = new Select(dropdownElement);

        // [Selenium - Select]
        // Tujuan: Memilih option berdasarkan text yang terlihat.
        dropdown.selectByVisibleText("Option 1");

        // [Selenium - Select]
        // Tujuan: Mengambil option yang sedang dipilih.
        WebElement selectedOption = dropdown.getFirstSelectedOption();

        // [Selenium - WebElement]
        // Tujuan: Mengambil text option.
        System.out.println(
                "Selected option: " + selectedOption.getText());

        // [Selenium - Browser Control]
        // Tujuan: Menutup browser.
        driver.quit();
    }
}