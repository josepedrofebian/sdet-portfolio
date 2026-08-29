// Tentukan package sesuai lokasi file ini
package methods.challenges;

// Buat sebuah class bernama ScopeChallenge
public class ScopeChallenge {

    // Buat sebuah variable class bernama browser
    // Gunakan tipe data String
    // Gunakan static
    // Isi dengan nama browser pilihan lu
    public static String browser = "Chrome";

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Di dalam method main, buat variable local bernama username
        // Gunakan tipe data String
        // Isi dengan username pilihan lu
        String username = "Jose";

        // Tampilkan username dari dalam method main
        System.out.println("Username: " + username);

        // Panggil method loginTest
        loginTest();

        // Tampilkan variable browser dari dalam method main
        System.out.println("Browser: " + browser);
    }

    // Buat method loginTest
    // Gunakan access modifier public
    // Gunakan static
    // Gunakan return type void
    public static void loginTest() {

        // Di dalam loginTest, buat variable local bernama password
        // Gunakan tipe data String
        // Isi dengan password pilihan lu
        String password = "Rahasia";

        // Tampilkan password dari dalam method loginTest
        System.out.println("Password: " + password);

        // Tampilkan variable browser dari dalam method loginTest
        System.out.println("Browser: " + browser);
    }
}