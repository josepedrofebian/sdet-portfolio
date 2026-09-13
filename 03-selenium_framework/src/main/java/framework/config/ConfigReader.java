package framework.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    // [Config] Menyimpan seluruh konfigurasi
    private static final Properties properties = new Properties();

    // [Config] Load config.properties saat class pertama kali digunakan
    static {
        try (InputStream input = ConfigReader.class
                .getClassLoader()
                .getResourceAsStream("config/config.properties")) {

            // [Config] Pastikan file konfigurasi ditemukan
            if (input == null) {
                throw new RuntimeException(
                        "File config.properties tidak ditemukan");
            }

            // [Config] Baca seluruh isi file properties
            properties.load(input);

        } catch (IOException e) {
            throw new RuntimeException(
                    "Gagal membaca config.properties",
                    e);
        }
    }

    // [Config] Ambil nilai konfigurasi berdasarkan key
    public static String get(String key) {
        return properties.getProperty(key);
    }

    // [Config] Ambil timeout sebagai integer
    public static int getInt(String key) {
        return Integer.parseInt(
                properties.getProperty(key));
    }

    // [Config] Ambil nilai boolean
    public static boolean getBoolean(String key) {
        return Boolean.parseBoolean(
                properties.getProperty(key));
    }
}