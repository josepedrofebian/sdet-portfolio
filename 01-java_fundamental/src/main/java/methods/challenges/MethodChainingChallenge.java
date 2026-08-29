// Tentukan package sesuai lokasi file ini
package methods.challenges;

// Buat sebuah class bernama MethodChainingChallenge
public class MethodChainingChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Buat object dari class TestFlow
        TestFlow testFlow = new TestFlow();

        // Panggil method loginTest dari object tersebut
        // Pastikan method loginTest mengembalikan object TestFlow menggunakan return
        // this
        testFlow.loginTest()
                // Setelah loginTest selesai, panggil method searchTest menggunakan hasil return
                // dari loginTest
                // Pastikan method searchTest mengembalikan object TestFlow menggunakan return
                // this
                .searchTest()
                // Setelah searchTest selesai, panggil method logoutTest menggunakan hasil
                // return dari searchTest
                // Pastikan method logoutTest mengembalikan object TestFlow menggunakan return
                // this
                .logoutTest();
    }
}

// Buat class TestFlow
class TestFlow {
    // Buat method loginTest dengan return type TestFlow
    // Tampilkan pesan bahwa login test sedang dijalankan
    // Kembalikan object saat ini menggunakan return this
    public TestFlow loginTest() {
        System.out.println("Running login test");
        return this;
    }

    // Buat method searchTest dengan return type TestFlow
    // Tampilkan pesan bahwa search test sedang dijalankan
    // Kembalikan object saat ini menggunakan return this
    public TestFlow searchTest() {
        System.out.println("Running search test");
        return this;
    }

    // Buat method logoutTest dengan return type TestFlow
    // Tampilkan pesan bahwa logout test sedang dijalankan
    // Kembalikan object saat ini menggunakan return this
    public TestFlow logoutTest() {
        System.out.println("Running logout test");
        return this;
    }
}
