// Tentukan package sesuai lokasi file ini
package oop.challenges;

// Buat sebuah class bernama AbstractionChallenge
public class AbstractionChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Di dalam method main, buat reference bertipe User
        // Arahkan reference tersebut ke object Maker
        User maker = new Maker();
        maker.login();
        // Gunakan reference User tersebut untuk memanggil method login
    }
}

// Buat abstract class bernama User
abstract class User {
    // Di dalam User, buat abstract method bernama login
    // Gunakan access modifier public
    // Gunakan return type void
    // Jangan berikan body pada abstract method
    public abstract void login();
}

// Buat child class bernama Maker
// Gunakan keyword extends untuk mewarisi abstract class User
class Maker extends User {
    // Di dalam Maker, override method login milik User
    // Gunakan annotation @Override
    // Gunakan access modifier public
    // Gunakan return type void
    @Override
    public void login() {
        // Di dalam login milik Maker, tampilkan pesan bahwa Maker melakukan login
        System.out.println("Maker Login");
    }
}
