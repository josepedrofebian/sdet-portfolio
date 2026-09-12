package webelements.challenges;

// [Java - Collections + Generic]
// Tujuan: Menyimpan banyak WebElement dalam sebuah List.
import java.util.List;

// [Selenium]
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsChallenge {

    public static void main(String[] args) {

        // Buat ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Buka website
        driver.get("https://the-internet.herokuapp.com/");
        // Cari SEMUA link menggunakan findElements()
        // Gunakan By.tagName("a")
        // Simpan hasilnya ke List<WebElement>
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Gunakan enhanced for loop
        for (WebElement link : links) {
            // Di dalam loop:
            // tampilkan text setiap link
            System.out.println(link.getText());
        }
        // Setelah loop:
        // tampilkan jumlah link menggunakan size()
        System.out.println(links.size());
        // List<WebElement> elements = driver.findElements(By.cssSelector(".ngasal"));
        // System.out.println(elements.size());
        // quit()
        driver.quit();
    }
}