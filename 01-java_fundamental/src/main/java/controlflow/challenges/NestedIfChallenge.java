// Tentukan package sesuai lokasi file ini
package controlflow.challenges;

// Buat sebuah class bernama NestedIfChallenge
public class NestedIfChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Buat variable boolean bernama isLoggedIn
        // Isi dengan true atau false
        boolean isLoggedIn = true;
        // Buat variable boolean bernama isMaker
        // Isi dengan true atau false
        boolean isMaker = true;
        // Gunakan if untuk mengecek apakah user sudah login
        if (isLoggedIn) {
            // Jika user sudah login, tampilkan pesan bahwa user berhasil login
            System.out.println("User sudah login");
            // Di dalam if tersebut, gunakan nested if
            // Gunakan nested if untuk mengecek apakah user memiliki role maker
            if (isMaker) {
                // Jika user adalah maker, tampilkan bahwa user dapat mengakses halaman maker
                System.out.println("User dapat mengakses halaman maker");
            } else {
                // Gunakan else untuk menangani kondisi ketika user bukan maker
                // Jika user bukan maker, tampilkan bahwa user tidak memiliki akses ke halaman
                // maker
                System.out.println("User tidak memiliki akses ke halaman maker");
            }
        } else {
            // Gunakan else dari kondisi login
            // Jika user belum login, tampilkan bahwa user harus login terlebih dahulu
            System.out.println("User harus login terlebih dahulu");
        }
    }
}