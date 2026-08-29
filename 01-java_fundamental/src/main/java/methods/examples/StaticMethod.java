// Menentukan package tempat class StaticMethod berada
package methods.examples;

// Mendefinisikan class dengan nama StaticMethod
public class StaticMethod {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Memanggil static method tanpa membuat object
        loginTest();

        // Memanggil static method dengan argument
        searchTest("Selenium");
    }

    // Membuat static method bernama loginTest
    public static void loginTest() {

        // Menampilkan pesan dari static method
        System.out.println("Running login test");
    }

    // Membuat static method bernama searchTest
    public static void searchTest(String keyword) {

        // Menampilkan keyword yang diterima
        System.out.println("Searching: " + keyword);
    }
}