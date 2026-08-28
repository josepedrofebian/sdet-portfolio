// Tentukan package sesuai lokasi file ini
package methods.challenges;

// Buat sebuah class bernama ParameterChallenge
public class ParameterChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Di dalam method main, panggil loginTest
        // Kirimkan username pilihan lu sebagai argument
        loginTest("Jose Pedro Febian");
        // Di dalam method main, panggil searchTest
        // Kirimkan keyword pilihan lu sebagai argument
        searchTest("Jose");
    }

    // Buat method loginTest
    // Gunakan access modifier public
    // Gunakan static
    // Gunakan return type void
    // Buat satu parameter bernama username dengan tipe data String
    public static void loginTest(String username) {
        // Di dalam loginTest, tampilkan username yang diterima oleh parameter
        System.out.println("User Login: " + username);
    }

    // Buat method searchTest
    // Gunakan access modifier public
    // Gunakan static
    // Gunakan return type void
    // Buat satu parameter bernama keyword dengan tipe data String
    public static void searchTest(String keyword) {
        // Di dalam searchTest, tampilkan keyword yang diterima oleh parameter
        System.out.println("Search Key With: " + keyword);
    }
}