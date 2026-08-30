package basics.challenges;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationChallenge {
    public static void main(String[] args) {
        // Buat WebDriver Chrome
        WebDriver driver = new ChromeDriver();
        // Buka Google
        driver.get("https://www.google.com");
        // Buka Wikipedia menggunakan navigate().to()
        driver.navigate().to("https://www.wikipedia.com");
        // Kembali ke Google menggunakan navigate().back()
        driver.navigate().back();
        // Maju kembali ke Wikipedia menggunakan navigate().forward()
        driver.navigate().forward();
        // Tutup session dengan quit()
        driver.quit();
    }
}
