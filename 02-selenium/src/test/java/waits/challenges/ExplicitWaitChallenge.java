// package waits.challenges;

// import java.time.Duration;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.ExpectedCondition;
// import org.openqa.selenium.support.ui.WebDriverWait;

// public class ExplicitWaitChallenge {
// // Buat ChromeDriver
// WebDriver driver = new ChromeDriver();
// // Buka:
// // https://the-internet.herokuapp.com/login
// driver.get("https://the-internet.herokuapp.com/login");
// // Buat WebDriverWait
// // timeout 10 detik
// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// // Tunggu username menggunakan:
// // visibilityOfElementLocated()
// WebElement username =
// wait.until(ExpectedCondition.visibilityOfElementLocated(By.id("username")));
// // Isi:
// // tomsmith

// // Tunggu password menggunakan:
// // visibilityOfElementLocated()
// WebElement password =
// wait.until(ExpectedCondition.visibilityOfElementLocated(By.id("password")));
// // Isi:
// // SuperSecretPassword!

// // Tunggu tombol Login menggunakan:
// // elementToBeClickable()

// // Click Login

// // Tunggu flash message menggunakan:
// // visibilityOfElementLocated()

// // Print text flash message

// // quit()
// }
