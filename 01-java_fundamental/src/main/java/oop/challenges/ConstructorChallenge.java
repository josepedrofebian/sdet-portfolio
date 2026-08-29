// Tentukan package sesuai lokasi file ini
package oop.challenges;

// Buat sebuah class bernama ConstructorChallenge
public class ConstructorChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Di dalam method main, buat object LoginPage
        // Kirimkan username pilihan lu melalui constructor
        ConstructorChllengeLoginPage loginPage = new ConstructorChllengeLoginPage("Jose Pedro Febian");
        // Gunakan object loginPage untuk memanggil method login
        loginPage.login();
    }
}

// Buat class bernama LoginPage
class ConstructorChllengeLoginPage {

    // Di dalam LoginPage, buat variable instance bernama username
    // Gunakan tipe data String
    private String username;

    // Buat constructor LoginPage
    // Constructor menerima satu parameter String bernama username
    public ConstructorChllengeLoginPage(String username) {
        // Di dalam constructor, simpan nilai parameter username ke variable instance
        // username
        // Gunakan keyword this
        this.username = username;
    }

    // Buat method login
    // Gunakan access modifier public
    // Gunakan return type void
    public void login() {
        // Di dalam method login, tampilkan username yang tersimpan pada object
        System.out.println("User Login: " + username);
    }

}