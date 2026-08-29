// Tentukan package sesuai lokasi file ini
package methods.challenges;

// Buat sebuah class bernama StaticMethodChallenge
public class StaticMethodChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Dari dalam method main, panggil loginTest
        loginTest();

        // Dari dalam method main, panggil searchTest
        searchTest("Selenium");
    }

    // Buat sebuah static method bernama loginTest
    // Gunakan access modifier public
    // Gunakan return type void
    // Method tidak membutuhkan parameter
    public static void loginTest() {
        // Di dalam loginTest, tampilkan pesan bahwa login test sedang dijalankan
        System.out.println("Running login test");
    }

    // Buat sebuah static method bernama searchTest
    // Gunakan access modifier public
    // Gunakan return type void
    // Buat satu parameter bernama keyword dengan tipe data String
    public static void searchTest(String keyword) {
        // Di dalam searchTest, tampilkan keyword yang diterima
        System.out.println("Searching: " + keyword);
    }
}