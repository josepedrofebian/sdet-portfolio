// Tentukan package sesuai lokasi file ini
package controlflow.challenges;

// Buat sebuah class bernama ForLoopChallenge
public class ForLoopChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Buat for loop yang dimulai dari angka 1
        // Buat kondisi agar loop berjalan sampai angka 10
        // Gunakan increment agar nilai counter bertambah 1 setiap iterasi
        for (int i = 1; i <= 10; i++) {
            // Di dalam loop, tampilkan nomor test case saat ini
            System.out.println("Test Case: " + i);
        }

        // Buat for loop kedua yang dimulai dari angka 1
        // Buat kondisi agar loop berjalan sampai angka 5
        // Gunakan increment agar nilai counter bertambah 1 setiap iterasi
        for (int i = 1; i <= 5; i++) {
            // Di dalam loop, tampilkan pesan "Running test case" beserta nomor iterasi
            System.out.println("Running test case: " + i);
        }

    }
}