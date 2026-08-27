// Menentukan package tempat class NestedIf berada
package controlflow.examples;

// Mendefinisikan class dengan nama NestedIf
public class NestedIf {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Menyimpan status apakah user sudah login
        boolean isLoggedIn = true;

        // Menyimpan status apakah user memiliki role checker
        boolean isChecker = true;

        // Mengecek apakah user sudah login
        if (isLoggedIn) {

            // Menampilkan pesan bahwa user sudah login
            System.out.println("User sudah login");

            // Mengecek role user setelah user berhasil login
            if (isChecker) {

                // Menampilkan pesan jika user merupakan checker
                System.out.println("User dapat mengakses halaman checker");

                // Menangani kondisi jika user bukan checker
            } else {

                // Menampilkan pesan jika user tidak memiliki role checker
                System.out.println("User bukan checker");
            }

            // Menangani kondisi jika user belum login
        } else {

            // Menampilkan pesan bahwa user harus login
            System.out.println("User harus login terlebih dahulu");
        }
    }
}