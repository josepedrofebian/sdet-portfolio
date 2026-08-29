// Menentukan package tempat class Encapsulation berada
package oop.examples;

// Mendefinisikan class dengan nama Encapsulation
public class Encapsulation {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat object dari class LoginPage
        EncapsulationLoginPage loginPage = new EncapsulationLoginPage();

        // Mengisi username melalui method setter
        loginPage.setUsername("Jose");

        // Mengambil username melalui method getter
        System.out.println("Username: " + loginPage.getUsername());
    }
}

// Membuat class LoginPage
class EncapsulationLoginPage {

    // Membuat variable username sebagai private
    // Variable ini tidak dapat diakses langsung dari luar class
    private String username;

    // Membuat setter untuk mengubah nilai username
    public void setUsername(String username) {

        // Menyimpan nilai parameter ke variable instance
        this.username = username;
    }

    // Membuat getter untuk mengambil nilai username
    public String getUsername() {

        // Mengembalikan nilai username
        return username;
    }
}