package webelements.examples;

// [Selenium]
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementActionsExample {

        public static void main(String[] args) {

                // [Java - OOP + Polymorphism]
                // Tujuan: Membuat browser Chrome yang dikontrol Selenium.
                WebDriver driver = new ChromeDriver();

                // [Selenium - Navigation]
                // Tujuan: Membuka halaman login.
                driver.get("https://the-internet.herokuapp.com/login");

                // [Selenium - Locator]
                // Tujuan: Mencari input username.
                WebElement username = driver.findElement(By.id("username"));

                // [Selenium - WebElement]
                // Tujuan: Mengisi username.
                username.sendKeys("tomsmith");

                // [Selenium - WebElement]
                // Tujuan: Menghapus isi username.
                username.clear();

                // [Selenium - WebElement]
                // Tujuan: Mengisi username kembali.
                username.sendKeys("tomsmith");

                // [Selenium - Locator]
                // Tujuan: Mencari tombol Login.
                WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));

                // [Selenium - WebElement]
                // Tujuan: Mengklik tombol Login.
                loginButton.click();

                // [Selenium - Locator]
                // Tujuan: Mencari pesan setelah login.
                WebElement message = driver.findElement(By.id("flash"));

                // [Selenium - WebElement]
                // Tujuan: Mengambil text pesan.
                String messageText = message.getText();

                System.out.println("Message: " + messageText);

                // [Selenium - WebElement]
                // Tujuan: Mengambil attribute class dari message.
                String className = message.getAttribute("class");

                System.out.println("Class: " + className);

                // [Selenium - Browser Control]
                // Tujuan: Mengakhiri WebDriver session.
                driver.quit();
        }
}