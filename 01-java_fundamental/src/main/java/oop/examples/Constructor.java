// Menentukan package tempat class Constructor berada
package oop.examples;

// Mendefinisikan class dengan nama Constructor
public class Constructor {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat object LoginPage menggunakan constructor
        ConstructorLoginPage loginPage = new ConstructorLoginPage("Jose");

        // Memanggil method login dari object loginPage
        loginPage.login();
    }
}

// Membuat class LoginPage
class ConstructorLoginPage {

    // Membuat variable instance untuk menyimpan username
    private String username;

    // Membuat constructor dengan parameter username
    // Constructor memiliki nama yang sama dengan nama class
    public ConstructorLoginPage(String username) {

        // Menyimpan nilai parameter username ke variable instance username
        this.username = username;
    }

    // Membuat method login
    public void login() {

        // Menampilkan username yang tersimpan di object
        System.out.println("Login dengan username: " + username);
    }
}