package framework.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {

        // [Screenshot] Format timestamp untuk nama file screenshot
        private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");

        // [Screenshot] Mengambil screenshot dan menyimpannya berdasarkan status test
        public static void takeScreenshot(
                        WebDriver driver,
                        String status,
                        String screenshotName) {

                // [Screenshot] Membuat folder berdasarkan status PASS atau FAIL
                Path screenshotDirectory = Paths.get(
                                "target",
                                "screenshots",
                                status);

                try {

                        // [Screenshot] Membuat folder jika belum tersedia
                        Files.createDirectories(screenshotDirectory);

                        // [Screenshot] Mengambil screenshot dalam bentuk byte array
                        byte[] screenshot = ((TakesScreenshot) driver)
                                        .getScreenshotAs(OutputType.BYTES);

                        // [Screenshot] Membuat timestamp agar nama file selalu unik
                        String timestamp = LocalDateTime.now().format(FORMATTER);

                        // [Screenshot] Membuat nama file screenshot
                        String fileName = screenshotName + "_" + timestamp + ".png";

                        // [Screenshot] Menentukan lokasi file screenshot
                        Path screenshotPath = screenshotDirectory.resolve(fileName);

                        // [Screenshot] Menulis screenshot ke file
                        Files.write(
                                        screenshotPath,
                                        screenshot);

                } catch (IOException e) {

                        // [Screenshot] Melempar error jika screenshot gagal disimpan
                        throw new RuntimeException(
                                        "Gagal menyimpan screenshot",
                                        e);
                }
        }
}