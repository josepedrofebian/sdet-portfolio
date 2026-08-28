// Tentukan package sesuai lokasi file ini
package methods.challenges;

// Buat sebuah class bernama MethodChallenge
public class MethodChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Di dalam method main, panggil loginTest
        loginTest();
        searchTest();
        // Di dalam method main, panggil searchTest
    }

    // Buat sebuah method bernama loginTest
    // Gunakan access modifier public
    // Gunakan static
    // Gunakan return type void
    public static void loginTest() {
        // Di dalam loginTest, tampilkan pesan bahwa login test sedang dijalankan
        System.out.println("Login Test Sedang dijalankan");
    }

    // Buat sebuah method bernama searchTest
    // Gunakan access modifier public
    // Gunakan static
    // Gunakan return type void
    public static void searchTest() {
        // Di dalam searchTest, tampilkan pesan bahwa search test sedang dijalankan
        System.out.println("Search Test Sedang dijalankan");
    }
}
