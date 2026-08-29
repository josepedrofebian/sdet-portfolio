// Tentukan package sesuai lokasi file ini
package oop.challenges;

// Buat sebuah class bernama PolymorphismChallenge
public class PolymorphismChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Di dalam method main, buat reference bertipe User
        // Arahkan reference tersebut ke object Maker
        User maker = new Maker();
        // Gunakan reference User tersebut untuk memanggil method login
        maker.login();
        // Buat reference bertipe User kedua
        // Arahkan reference tersebut ke object Checker
        User checker = new Checker();
        // Gunakan reference User kedua untuk memanggil method login
        checker.login();
    }
}

// Buat parent class bernama User
class User {
    // Di dalam User, buat method bernama login
    // Gunakan access modifier public
    // Gunakan return type void
    // Tampilkan pesan login dari User
    public void login() {
        System.out.println("User Login");
    }
}

// Buat child class bernama Maker
// Gunakan keyword extends untuk mewarisi User
class Maker extends User {
    // Override method login dari User menggunakan annotation @Override
    @Override
    // Di dalam login milik Maker, tampilkan pesan login khusus Maker
    public void login() {
        System.out.println("Maker Login");
    }
}

// Buat child class bernama Checker
// Gunakan keyword extends untuk mewarisi User
class Checker extends User {
    // Override method login dari User menggunakan annotation @Override
    @Override
    public void login() {
        // Di dalam login milik Checker, tampilkan pesan login khusus Checker
        System.out.println("Checker Login");
    }
}
