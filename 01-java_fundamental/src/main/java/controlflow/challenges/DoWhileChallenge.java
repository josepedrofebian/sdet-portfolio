// Tentukan package sesuai lokasi file ini
package controlflow.challenges;

// Buat sebuah class bernama DoWhileChallenge
public class DoWhileChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Buat variable bernama testCase
        // Gunakan tipe data int
        // Berikan nilai awal 1
        int testCase = 1;

        // Gunakan do-while loop
        do {
            // Di dalam do block, tampilkan nomor test case saat ini
            System.out.println("Test Case: " + testCase);

            // Di dalam do block, tambahkan nilai testCase sebanyak 1
            testCase++;
            // Buat kondisi while agar loop terus berjalan selama testCase kurang dari atau
            // sama dengan 5
            // Pastikan testCase bertambah agar loop tidak berjalan selamanya
        } while (testCase <= 5);
    }
}
