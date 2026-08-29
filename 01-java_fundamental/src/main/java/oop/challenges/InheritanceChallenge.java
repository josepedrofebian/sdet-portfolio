// Tentukan package sesuai lokasi file ini
package oop.challenges;

// Buat sebuah class bernama InheritanceChallenge
public class InheritanceChallenge {
    // Buat method main sebagai titik awal program

    public static void main(String[] args) {
        // Di dalam method main, buat object dari class Maker
        Maker maker = new Maker();
        // Gunakan object Maker untuk memanggil method login
        // Method login berasal dari parent class User
        maker.login();
        // Gunakan object Maker untuk memanggil method submitTest
        // Method submitTest berasal dari class Maker
        maker.submitTest();
    }
}

// Buat parent class bernama User
class User {
    // Di dalam User, buat method bernama login
    // Gunakan access modifier public
    // Gunakan return type void
    // Tampilkan pesan bahwa user melakukan login
    public void login() {
        System.out.println("User Login");
    }
}

// Buat child class bernama Maker
// Gunakan keyword extends untuk mewarisi class User
class Maker extends User {

    // Di dalam Maker, buat method bernama submitTest
    // Gunakan access modifier public
    // Gunakan return type void
    // Tampilkan pesan bahwa Maker melakukan submit test
    public void submitTest() {
        System.out.println("Maker Submit Test");
    }
}
