// Tentukan package sesuai lokasi file ini
package controlflow.challenges;

// Buat sebuah class bernama BreakChallenge
public class BreakChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Buat for loop yang dimulai dari angka 1

        // Buat kondisi agar loop berjalan sampai angka 10

        // Gunakan increment agar counter bertambah 1 setiap iterasi
        for (int i = 1; i <= 10; i++) {
            // Di dalam loop, cek apakah nomor test case sudah mencapai angka 6
            if (i == 6) {
                // Jika nomor test case sudah mencapai angka 6, gunakan break untuk menghentikan
                // loop
                break;
            }
            // Jika belum mencapai angka 6, tampilkan nomor test case yang sedang dijalankan
            System.out.println("Running test case: " + i);
        }
    }
}
