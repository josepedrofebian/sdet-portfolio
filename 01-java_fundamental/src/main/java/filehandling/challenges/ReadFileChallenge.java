// Tentukan package sesuai lokasi file ini
package filehandling.challenges;

// Import File
import java.io.File;

// Import FileNotFoundException
import java.io.FileNotFoundException;

// Import Scanner
import java.util.Scanner;

// Buat class bernama ReadFileChallenge
public class ReadFileChallenge {
    // Buat method main
    public static void main(String[] args) {
        // Buat try-catch
        try {
            // Di dalam try, buat object File
            // Gunakan file bernama "testdata.txt"
            File file = new File("01-java_fundamental/src/main/resources/testdata.txt");
            // Buat object Scanner berdasarkan File tersebut
            Scanner scanner = new Scanner(file);
            // Gunakan while untuk membaca file selama masih memiliki baris
            while (scanner.hasNextLine()) {
                // Di dalam loop, ambil setiap baris menggunakan nextLine()
                String data = scanner.nextLine();
                // Tampilkan setiap baris ke console
                System.out.println(data);
            }
            // Setelah selesai membaca file, tutup Scanner menggunakan close()
            scanner.close();
            // Tangkap FileNotFoundException
        } catch (FileNotFoundException e) {
            // Di dalam catch, tampilkan:
            // "File tidak ditemukan"
            System.out.println("File Tidak Ditemukan");
        }
    }
}
