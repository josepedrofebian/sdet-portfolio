// Tentukan package sesuai lokasi file ini
package basics.challenges;

// Buat sebuah class bernama OperatorChallenge
public class OperatorChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Buat variable bernama testCaseCount
        // Gunakan tipe data int
        // Isi dengan jumlah test case pilihan lu
        int testCaseCount = 5;

        // Buat variable bernama passedTest
        // Gunakan tipe data int
        // Isi dengan jumlah test case yang berhasil
        int passedTest = 3;
        // Buat variable bernama failedTest
        // Hitung jumlah failed test menggunakan operator arithmetic
        // Jangan langsung mengisi nilainya dengan hasil akhir
        int failedTest = testCaseCount - passedTest;
        // Tampilkan jumlah test case
        System.out.println("Jumlah Test Case: " + testCaseCount);
        // Tampilkan jumlah passed test
        System.out.println("Jumlah Passed Test: " + passedTest);
        // Tampilkan jumlah failed test
        System.out.println("Jumlah Failed Test: " + failedTest);

        // Buat variable boolean bernama allTestPassed
        // Gunakan comparison operator untuk mengecek apakah failedTest sama dengan 0
        boolean allTestPassed = failedTest == 0;
        // Tampilkan hasil allTestPassed
        System.out.println("Apakah Semua Test Pass: " + allTestPassed);
        // Buat variable boolean bernama hasTestResult
        // Gunakan logical operator untuk mengecek apakah testCaseCount lebih besar dari
        // 0
        // DAN passedTest lebih besar atau sama dengan 0
        boolean hasTestResult = testCaseCount > 0 && passedTest >= 0;
        // Tampilkan hasil hasTestResult
        System.out.println("Apakah Jumlah Test Case Lebih dari 0: " + hasTestResult);

        // Ubah nilai testCaseCount menggunakan operator arithmetic
        // Tambahkan 1 ke nilai testCaseCount
        testCaseCount += 1;
        // Tampilkan kembali testCaseCount setelah nilainya berubah
        System.out.println("Jumlah Test Case setelah diupdate: " + testCaseCount);
    }

}
