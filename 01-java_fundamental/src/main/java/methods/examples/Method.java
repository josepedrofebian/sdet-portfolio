// Menentukan package tempat class Method berada
package methods.examples;

// Mendefinisikan class dengan nama Method
public class Method {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Memanggil method loginTest
        loginTest();

        // Memanggil method runTest
        runTest();
    }

    // Membuat method bernama loginTest
    // void berarti method tidak mengembalikan nilai
    public static void loginTest() {

        // Menampilkan pesan dari method loginTest
        System.out.println("Running login test");
    }

    // Membuat method bernama runTest
    // void berarti method tidak mengembalikan nilai
    public static void runTest() {

        // Menampilkan pesan dari method runTest
        System.out.println("Running test");
    }
}