// Menentukan package tempat class ForLoop berada
package controlflow.examples;

// Mendefinisikan class dengan nama ForLoop
public class ForLoop {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat for loop yang dimulai dari angka 1
        // Loop akan berjalan selama nilai i kurang dari atau sama dengan 5
        // Setiap selesai satu putaran, nilai i bertambah 1
        for (int i = 1; i <= 5; i++) {

            // Menampilkan nomor iterasi saat ini
            System.out.println("Test Case: " + i);
        }
    }
}