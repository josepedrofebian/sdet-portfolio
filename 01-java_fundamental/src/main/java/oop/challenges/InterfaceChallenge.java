// Tentukan package sesuai lokasi file ini
package oop.challenges;

// Buat sebuah class bernama InterfaceChallenge
public class InterfaceChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Di dalam method main, buat reference bertipe TestAction
        // Arahkan reference tersebut ke object Maker
        TestAction maker = new InterfaceMaker();
        // Gunakan reference TestAction tersebut untuk memanggil executeTest
        maker.executeTest();
    }
}

// Buat sebuah interface bernama TestAction
/**
 * TestAction
 */
interface TestAction {
    // Di dalam interface TestAction, buat method bernama executeTest
    // Gunakan return type void
    // Jangan berikan body pada method
    void executeTest();
}

// Buat class bernama Maker
// Gunakan keyword implements untuk mengimplementasikan interface TestAction
class InterfaceMaker implements TestAction {
    // Di dalam Maker, implementasikan method executeTest
    // Gunakan annotation @Override
    // Gunakan access modifier public
    // Gunakan return type void
    @Override
    public void executeTest() {
        // Di dalam executeTest milik Maker, tampilkan pesan bahwa Maker menjalankan
        // test
        System.out.println("Maker menjalankan test");
    }
}
