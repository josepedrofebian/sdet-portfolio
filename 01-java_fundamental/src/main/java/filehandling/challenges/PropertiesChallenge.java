package filehandling.challenges;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;

public class PropertiesChallenge {
    public static void main(String[] args) {
        // Gunakan try-catch untuk menangani IOException
        try {
            // Buat object Properties bernama config
            Properties config = new Properties();
            // Gunakan FileInputStream untuk membuka config.properties
            FileInputStream input = new FileInputStream("01-java_fundamental/src/main/resources/config.properties");
            // Gunakan config.load() untuk membaca file
            config.load(input);
            // Tutup FileInputStream
            input.close();
            // Ambil browser menggunakan getProperty()
            String browser = config.getProperty("browser");
            // Ambil url menggunakan getProperty()
            String url = config.getProperty("url");
            // Ambil username menggunakan getProperty()
            String username = config.getProperty("username");
            // Ambil environment menggunakan getProperty()
            String environment = config.getProperty("environment");
            // Tampilkan seluruh value tersebut
            System.out.println("Browser: " + browser);
            System.out.println("URL: " + url);
            System.out.println("Username: " + username);
            System.out.println("Environment: " + environment);
        } catch (IOException e) {
            System.out.println("Gagal Membaca Config");
        }
    }
}
