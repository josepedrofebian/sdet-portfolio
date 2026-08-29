// Menentukan package tempat class Scope berada
package methods.examples;

// Mendefinisikan class dengan nama Scope
public class Scope {

    // Membuat variable class yang dapat digunakan oleh method dalam class
    public static String browser = "Chrome";

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat variable local yang hanya dapat digunakan di dalam main
        String username = "Jose";

        // Menampilkan username dari local scope main
        System.out.println("Username: " + username);

        // Memanggil method loginTest
        loginTest();

        // Menampilkan browser dari class scope
        System.out.println("Browser: " + browser);
    }

    // Membuat method loginTest
    public static void loginTest() {

        // Membuat variable local yang hanya dapat digunakan di dalam loginTest
        String password = "Rahasia";

        // Menampilkan password dari local scope loginTest
        System.out.println("Password: " + password);

        // Mengakses variable browser dari class scope
        System.out.println("Browser: " + browser);
    }
}