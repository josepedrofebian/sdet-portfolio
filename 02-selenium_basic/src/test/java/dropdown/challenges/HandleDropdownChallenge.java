// Tentukan package sesuai lokasi file
package dropdown.challenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

// Import Duration
public class HandleDropdownChallenge {
    // Buat method main
    public static void main(String[] args) {

        // Buat ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Buka:
        // https://the-internet.herokuapp.com/dropdown
        driver.get("https://the-internet.herokuapp.com/dropdown");

        // Buat WebDriverWait
        // timeout 10 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Tunggu dropdown sampai terlihat
        // visibilityOfElementLocated()
        // By.id("dropdown")
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdown")));
        // Buat object Select dari WebElement dropdown
        Select select = new Select(dropdown);
        // Pilih "Option 2"
        // WAJIB selectByVisibleText()
        select.selectByVisibleText("Option 2");
        // Ambil option yang sedang dipilih
        // getFirstSelectedOption()
        WebElement option = select.getFirstSelectedOption();
        // Ambil text option
        // getText()
        String textOption = option.getText();
        // Print:
        // Selected option: Option 2
        System.out.println("Selected option:" + textOption);
        // quit()
        driver.quit();
    }
}
