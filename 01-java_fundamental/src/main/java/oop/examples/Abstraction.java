// Menentukan package tempat class Abstraction berada
package oop.examples;

// Mendefinisikan class dengan nama Abstraction
public class Abstraction {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat reference bertipe User yang menunjuk ke object Maker
        User user = new Maker();

        // Memanggil method login dari object Maker
        user.login();
    }
}

// Membuat abstract class User
abstract class User {

    // Membuat abstract method login
    // Abstract method tidak memiliki body
    public abstract void login();
}

// Membuat child class Maker yang mewarisi abstract class User
class Maker extends User {

    // Mengimplementasikan abstract method login dari User
    @Override
    public void login() {

        // Menampilkan proses login Maker
        System.out.println("Maker Login");
    }
}