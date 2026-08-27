// Menentukan package tempat class IfElse berada
package controlflow.examples;

// Mendefinisikan class dengan nama IfElse
public class IfElse {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Menyimpan status login user
        boolean isLoggedIn = true;

        // Mengecek apakah user sudah login
        if (isLoggedIn) {

            // Menampilkan pesan jika kondisi bernilai true
            System.out.println("User berhasil login");

        } else {

            // Menampilkan pesan jika kondisi bernilai false
            System.out.println("User belum login");
        }
    }
}