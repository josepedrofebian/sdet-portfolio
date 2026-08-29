// Menentukan package tempat class Inheritance berada
package oop.examples;

// Mendefinisikan class dengan nama Inheritance
public class Inheritance {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat object dari class Checker
        Checker checker = new Checker();

        // Memanggil method login yang diwarisi dari class User
        checker.login();

        // Memanggil method checkTest yang dimiliki oleh class Checker
        checker.checkTest();
    }
}

// Membuat parent class bernama User
class User {

    // Membuat method login yang dapat diwarisi oleh child class
    public void login() {

        // Menampilkan pesan ketika user melakukan login
        System.out.println("User melakukan login");
    }
}

// Membuat child class Checker yang mewarisi class User
class Checker extends User {

    // Membuat method checkTest yang dimiliki oleh Checker
    public void checkTest() {

        // Menampilkan pesan ketika checker menjalankan test
        System.out.println("Checker menjalankan test");
    }
}