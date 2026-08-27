// Menentukan package tempat class DoWhile berada
package controlflow.examples;

// Mendefinisikan class dengan nama DoWhile
public class DoWhile {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat variable counter dengan nilai awal 1
        int counter = 1;

        // Menjalankan blok code minimal satu kali sebelum mengecek kondisi
        do {

            // Menampilkan nomor iterasi saat ini
            System.out.println("Running test case: " + counter);

            // Menambahkan 1 ke counter
            counter++;

            // Mengecek kondisi setelah blok code dijalankan
        } while (counter <= 5);
    }
}