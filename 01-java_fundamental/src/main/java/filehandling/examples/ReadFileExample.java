// Tentukan package sesuai lokasi file ini
package filehandling.examples;

// Import File untuk merepresentasikan file
import java.io.File;

// Import exception jika file tidak ditemukan
import java.io.FileNotFoundException;

// Import Scanner untuk membaca isi file
import java.util.Scanner;

// Buat class bernama ReadFileExample
public class ReadFileExample {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Gunakan try untuk menjalankan proses pembacaan file
        try {
            // Buat object File yang menunjuk ke testdata.txt
            File file = new File("01-java_fundamental/src/main/resources/testdata.txt");
            // Buat Scanner untuk membaca isi file
            Scanner scanner = new Scanner(file);

            // Selama masih ada baris yang bisa dibaca
            while (scanner.hasNextLine()) {

                // Ambil satu baris dari file
                String data = scanner.nextLine();

                // Tampilkan baris yang sudah dibaca
                System.out.println(data);
            }

            // Tutup Scanner setelah selesai digunakan
            scanner.close();

            // Tangkap error jika file tidak ditemukan
        } catch (FileNotFoundException e) {

            // Tampilkan pesan error
            System.out.println("File tidak ditemukan");
        }
    }
}