// Menentukan package tempat class Interface berada
package oop.examples;

// Mendefinisikan class dengan nama Interface
public class Interface {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat reference bertipe TestAction
        // Reference tersebut menunjuk ke object Maker
        TestActionInterface testAction = new Maker();

        // Memanggil method executeTest melalui interface
        testAction.executeTest();
    }
}

// Membuat interface TestAction
interface TestActionInterface {

    // Mendefinisikan method executeTest sebagai contract
    // Method interface secara default bersifat public dan abstract
    void executeTest();
}

// Membuat class Maker yang mengimplementasikan interface TestAction
class Maker implements TestActionInterface {

    // Mengimplementasikan method yang diwajibkan oleh interface
    @Override
    public void executeTest() {

        // Menampilkan proses test yang dilakukan Maker
        System.out.println("Maker menjalankan test");
    }
}