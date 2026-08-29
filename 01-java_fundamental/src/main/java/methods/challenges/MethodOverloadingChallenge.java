// Tentukan package sesuai lokasi file ini
package methods.challenges;

// Buat sebuah class bernama MethodOverloadingChallenge
public class MethodOverloadingChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Di dalam method main, panggil loginTest dengan satu argument username
        loginTest("Jose");

        // Di dalam method main, panggil loginTest dengan dua argument username dan
        // password
        loginTest("Jose", "Rahasia");
    }

    // Buat method bernama loginTest
    // Gunakan access modifier public
    // Gunakan static
    // Gunakan return type void
    // Buat satu parameter bertipe String untuk username
    public static void loginTest(String username) {
        // Tampilkan username yang diterima oleh method
        System.out.println("Login dengan username: " + username);
    }

    // Buat method loginTest kedua
    // Gunakan nama method yang sama dengan method sebelumnya
    // Gunakan access modifier public
    // Gunakan static
    // Gunakan return type void
    // Buat dua parameter bertipe String untuk username dan password
    public static void loginTest(String username, String password) {
        // Tampilkan username dan password yang diterima oleh method
        System.out.println("Login dengan username: " + username);
        System.out.println("Login dengan password: " + password);
    }
}