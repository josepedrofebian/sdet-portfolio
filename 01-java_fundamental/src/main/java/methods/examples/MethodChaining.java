// Menentukan package tempat class MethodChaining berada
package methods.examples;

// Mendefinisikan class dengan nama MethodChaining
public class MethodChaining {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat object dari class TestFlow
        TestFlow testFlow = new TestFlow();

        // Memanggil method loginTest
        // Method mengembalikan object TestFlow yang sama
        testFlow.loginTest()

                // Memanggil method searchTest dari object yang dikembalikan sebelumnya
                .searchTest()

                // Memanggil method logoutTest dari object yang dikembalikan sebelumnya
                .logoutTest();
    }
}

// Membuat class TestFlow
class TestFlow {

    // Membuat method loginTest
    // Return type TestFlow berarti method mengembalikan object TestFlow
    public TestFlow loginTest() {

        // Menampilkan proses login
        System.out.println("Running login test");

        // Mengembalikan object saat ini
        return this;
    }

    // Membuat method searchTest
    // Return type TestFlow memungkinkan method berikutnya dipanggil
    public TestFlow searchTest() {

        // Menampilkan proses search
        System.out.println("Running search test");

        // Mengembalikan object saat ini
        return this;
    }

    // Membuat method logoutTest
    // Return type TestFlow
    public TestFlow logoutTest() {

        // Menampilkan proses logout
        System.out.println("Running logout test");

        // Mengembalikan object saat ini
        return this;
    }
}