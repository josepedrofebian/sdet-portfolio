// Menentukan package tempat class Class berada
package oop.examples;

// Mendefinisikan class dengan nama Class
public class Class {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat object dari class LoginPage
        LoginPage loginPage = new LoginPage();

        // Memanggil method login menggunakan object loginPage
        loginPage.login();
    }
}

// Membuat class LoginPage sebagai blueprint
class LoginPage {

    // Membuat method login yang dimiliki oleh LoginPage
    public void login() {

        // Menampilkan pesan ketika method login dijalankan
        System.out.println("Running login");
    }
}