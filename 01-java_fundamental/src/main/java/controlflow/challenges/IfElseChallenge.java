// Tentukan package sesuai lokasi file ini
package controlflow.challenges;

// Buat sebuah class bernama IfElseChallenge
public class IfElseChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Buat variable bernama testScore
        // Gunakan tipe data int
        // Isi dengan nilai test score pilihan lu
        int testScore = 85;
        // Gunakan if untuk mengecek apakah testScore lebih besar atau sama dengan 70
        if (testScore >= 70) {
            // Jika kondisi true, tampilkan bahwa test berhasil
            System.out.println("Test berhasil");
        }
        // Gunakan else untuk menangani kondisi ketika testScore kurang dari 70
        else {
            // Jika kondisi false, tampilkan bahwa test gagal
            System.out.println("Test gagal");
        }

        // Buat variable boolean bernama isLoggedIn
        // Isi dengan true atau false
        boolean isLoggedIn = true;

        // Gunakan if untuk mengecek apakah user sudah login
        if (isLoggedIn) {
            // Jika user sudah login, tampilkan bahwa user dapat mengakses halaman
            System.out.println("User dapat mengakses halaman");
        }
        // Jika user belum login, tampilkan bahwa user harus login terlebih dahulu
        else {
            System.out.println("User harus login terlebih dahulu");
        }
    }

}