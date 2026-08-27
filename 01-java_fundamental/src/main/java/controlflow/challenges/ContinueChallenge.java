// Tentukan package sesuai lokasi file ini
package controlflow.challenges;

// Buat sebuah class bernama ContinueChallenge
public class ContinueChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Buat for loop yang dimulai dari angka 1

        // Buat kondisi agar loop berjalan sampai angka 10

        // Gunakan increment agar counter bertambah 1 setiap iterasi
        for (int i = 1; i <= 10; i++) {
            // Di dalam loop, cek apakah nomor test case merupakan angka 5
            if (i == 5) {
                // Jika nomor test case adalah 5, gunakan continue untuk melewati iterasi
                // tersebut
                continue;
            }
            // Jika nomor test case bukan 5, tampilkan nomor test case yang sedang
            // dijalankan
            System.out.println("Running test case: " + i);
        }
    }
}
