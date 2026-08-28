// Tentukan package sesuai lokasi file ini
package methods.challenges;

// Buat sebuah class bernama ReturnValueChallenge
public class ReturnValueChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Di dalam method main, panggil calculateTestResult
        // Kirimkan total test dan passed test sebagai argument
        // Simpan nilai yang dikembalikan method ke dalam variable bernama failedTest
        int totalFailedTest = calculateTestResult(100, 95);
        // Tampilkan nilai failedTest ke console
        System.out.println("Total Failed Test: " + totalFailedTest);
        // Di dalam method main, panggil getBrowser
        // Simpan nilai yang dikembalikan ke dalam variable bernama browser
        String browser = getBrowser();
        // Tampilkan nilai browser ke console
        System.out.println(browser);
    }

    // Buat method bernama calculateTestResult
    // Gunakan access modifier public
    // Gunakan static
    // Gunakan return type int
    // Buat dua parameter bertipe int: totalTest dan passedTest
    public static int calculateTestResult(int totalTest, int passedTest) {
        // Hitung jumlah failed test dari totalTest dikurangi passedTest
        int totalFailedTest = totalTest - passedTest;
        // Kembalikan hasil failed test menggunakan return
        return totalFailedTest;
    }

    // Buat method bernama getBrowser
    // Gunakan access modifier public
    // Gunakan static
    // Gunakan return type String
    // Method tidak membutuhkan parameter
    public static String getBrowser() {
        // Kembalikan nama browser pilihan lu menggunakan return
        return "Chrome";
    }

}
