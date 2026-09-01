// Menentukan package tempat class Polymorphism berada
package oop.examples;

// Mendefinisikan class dengan nama Polymorphism
public class Polymorphism {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat reference bertipe User yang menunjuk ke object Maker
        UserPolymorphism user = new Maker();

        // Memanggil method login melalui reference User
        user.login();

        // Membuat reference bertipe User yang menunjuk ke object Checker
        UserPolymorphism checker = new Checker();

        // Memanggil method login melalui reference User
        checker.login();
    }
}

// Membuat parent class User
class UserPolymorphism {

    // Membuat method login yang dapat dioverride oleh child class
    public void login() {

        // Menampilkan pesan login dari User
        System.out.println("User login");
    }
}

// Membuat child class Maker yang mewarisi User
class Maker extends UserPolymorphism {

    // Mengoverride method login milik User
    @Override
    public void login() {

        // Menampilkan pesan login khusus Maker
        System.out.println("Maker login");
    }
}

// Membuat child class Checker yang mewarisi User
class Checker extends UserPolymorphism {

    // Mengoverride method login milik User
    @Override
    public void login() {

        // Menampilkan pesan login khusus Checker
        System.out.println("Checker login");
    }
}