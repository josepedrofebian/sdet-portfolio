// Tentukan package sesuai lokasi file
package filehandling.challenges;

// Import File
import java.io.File;
// Import FileNotFoundException
import java.io.FileNotFoundException;
// Import Scanner
import java.util.Scanner;
// Import HashMap
import java.util.HashMap;
// Import Map
import java.util.Map;

// Buat class bernama ReadTestDataChallenge
public class ReadTestDataChallenge {
    // Buat method main
    public static void main(String[] args) {
        // Gunakan try-catch
        try {
            // Buat object File yang menunjuk ke:
            // 01-java_fundamental/src/main/resources/testdata.txt
            File file = new File("01-java_fundamental/src/main/resources/testdata.txt");
            // Buat Map<String, String> bernama testData
            // Gunakan HashMap sebagai implementasinya
            Map<String, String> testData = new HashMap<>();
            // Buat Scanner berdasarkan File
            Scanner scanner = new Scanner(file);
            // Gunakan while untuk membaca file baris demi baris
            while (scanner.hasNextLine()) {
                // Ambil setiap baris menggunakan nextLine()
                String line = scanner.nextLine();
                // Pecah setiap baris menggunakan "=" dengan split()
                String[] data = line.split("=");
                // Masukkan hasil split ke dalam Map
                // data[0] → key
                // data[1] → value
                testData.put(data[0], data[1]);
            }
            // Tutup Scanner
            scanner.close();
            System.out.println(testData);
            // Ambil username dari Map menggunakan get("username")
            String username = testData.get("username");
            // Ambil password dari Map menggunakan get("password")
            String password = testData.get("password");
            // Ambil role dari Map menggunakan get("role")
            String role = testData.get("role");

            // Tampilkan:
            // Username: <username>
            System.out.println("Username: " + username);
            // Password: <password>
            System.out.println("Password: " + password);
            // Role: <role>
            System.out.println("Role: " + role);
            // Tangkap FileNotFoundException
        } catch (FileNotFoundException e) {
            // Tampilkan:
            // "File tidak ditemukan"
            System.out.println("File Tidak Ditemukan");
        }
    }
}

// Ambil username dari Map menggunakan get("username")

// Ambil password dari Map menggunakan get("password")

// Ambil role dari Map menggunakan get("role")

// Tampilkan:
// Username: <username>
// Password: <password>
// Role: <role>
