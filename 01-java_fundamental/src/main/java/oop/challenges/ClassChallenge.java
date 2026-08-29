// Tentukan package sesuai lokasi file ini
package oop.challenges;

// Buat sebuah class bernama ClassChallenge
public class ClassChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Di dalam method main, buat object dari class LoginPage
        // Simpan object tersebut ke dalam variable bernama loginPage
        LoginPage loginPage = new LoginPage();
        // Gunakan object loginPage untuk memanggil method login
        loginPage.login();
    }
}

// Buat class bernama LoginPage
class LoginPage {
    // Di dalam class LoginPage, buat method bernama login
    // Gunakan access modifier public
    // Gunakan return type void
    public void login() {
        // Di dalam method login, tampilkan pesan bahwa proses login sedang dijalankan
        System.out.println("Login is Running");
    }
}
