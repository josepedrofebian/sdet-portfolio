// Menentukan package tempat class Parameter berada
package methods.examples;

// Mendefinisikan class dengan nama Parameter
public class Parameter {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Memanggil method loginTest dengan mengirimkan username
        loginTest("Jose");

        // Memanggil method searchTest dengan mengirimkan keyword
        searchTest("Selenium");
    }

    // Membuat method loginTest yang menerima parameter username bertipe String
    public static void loginTest(String username) {

        // Menampilkan username yang diterima oleh method
        System.out.println("Login dengan username: " + username);
    }

    // Membuat method searchTest yang menerima parameter keyword bertipe String
    public static void searchTest(String keyword) {

        // Menampilkan keyword yang diterima oleh method
        System.out.println("Searching for: " + keyword);
    }
}