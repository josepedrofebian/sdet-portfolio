// Menentukan package tempat class berada
package filehandling.examples;

// Import FileInputStream untuk membaca file
import java.io.FileInputStream;

// Import IOException untuk menangani error I/O
import java.io.IOException;

// Import Properties untuk membaca file .properties
import java.util.Properties;

// Membuat class PropertiesExample
public class PropertiesExample {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat object Properties
        Properties config = new Properties();

        try {

            // Membuka file config.properties
            FileInputStream input = new FileInputStream(
                    "01-java_fundamental/src/main/resources/config.properties");

            // Memasukkan isi file ke object Properties
            config.load(input);

            // Menutup FileInputStream
            input.close();

            // Mengambil value berdasarkan key
            String browser = config.getProperty("browser");
            String url = config.getProperty("url");
            String username = config.getProperty("username");

            // Menampilkan data
            System.out.println("Browser: " + browser);
            System.out.println("URL: " + url);
            System.out.println("Username: " + username);

        } catch (IOException e) {

            // Menampilkan pesan jika file gagal dibaca
            System.out.println("Gagal membaca config");
        }
    }
}