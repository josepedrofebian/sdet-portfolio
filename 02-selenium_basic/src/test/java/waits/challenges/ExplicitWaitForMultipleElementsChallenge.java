package waits.challenges;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForMultipleElementsChallenge {
    public static void main(String[] args) {
        // Buat ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Buka website
        driver.get("https://the-internet.herokuapp.com/");
        // Buat WebDriverWait
        // timeout 10 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Tunggu SEMUA link menggunakan:
        // visibilityOfAllElementsLocatedBy()
        // Locator:
        // By.tagName("a")
        // Simpan hasilnya:
        // List<WebElement>
        List<WebElement> links = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("a")));

        // Gunakan enhanced for loop
        for (WebElement link : links) {
            // Print text setiap link
            System.out.println(link.getText());
        }

        // Print jumlah link menggunakan size()
        System.out.println(links.size());
        // quit()
        driver.quit();
    }
}
