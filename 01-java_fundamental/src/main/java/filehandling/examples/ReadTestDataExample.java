package filehandling.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadTestDataExample {

    public static void main(String[] args) {

        try {
            // Menentukan lokasi file test data
            File file = new File(
                    "01-java_fundamental/src/main/resources/testdata.txt");

            // Membuat Map untuk menyimpan key dan value
            Map<String, String> testData = new HashMap<>();

            // Membuka file untuk dibaca
            Scanner scanner = new Scanner(file);

            // Membaca file baris demi baris
            while (scanner.hasNextLine()) {

                // Mengambil satu baris
                String line = scanner.nextLine();

                // Memisahkan key dan value berdasarkan "="
                String[] data = line.split("=");
                // System.out.println(data[0]);
                // System.out.println(data[1]);
                // Menyimpan key dan value ke dalam Map
                testData.put(data[0], data[1]);
                // System.out.println(testData);
            }

            // Menutup Scanner
            scanner.close();

            // Mengambil data berdasarkan key
            String username = testData.get("username");
            String password = testData.get("password");
            String role = testData.get("role");

            // Menampilkan hasil
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Role: " + role);

        } catch (FileNotFoundException e) {

            // Menangani file yang tidak ditemukan
            System.out.println("File tidak ditemukan");
        }
    }
}