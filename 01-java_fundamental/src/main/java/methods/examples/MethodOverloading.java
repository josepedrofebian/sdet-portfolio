// Menentukan package tempat class MethodOverloading berada
package methods.examples;

// Mendefinisikan class dengan nama MethodOverloading
public class MethodOverloading {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Memanggil method loginTest dengan satu parameter username
        loginTest("Jose");

        // Memanggil method loginTest dengan dua parameter username dan password
        loginTest("Jose", "Rahasia");
    }

    // Membuat method loginTest dengan satu parameter String
    public static void loginTest(String username) {

        // Menampilkan username yang diterima
        System.out.println("Login dengan username: " + username);
    }

    // Membuat method loginTest dengan dua parameter String
    // Method memiliki nama yang sama tetapi parameter berbeda
    public static void loginTest(String username, String password) {

        // Menampilkan username dan password yang diterima
        System.out.println("Login dengan username: " + username);
        System.out.println("Login dengan password: " + password);
    }
}