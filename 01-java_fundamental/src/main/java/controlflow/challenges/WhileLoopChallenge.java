// Tentukan package sesuai lokasi file ini
package controlflow.challenges;

// Buat sebuah class bernama WhileLoopChallenge
public class WhileLoopChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Buat variable bernama testCase
        // Gunakan tipe data int
        // Berikan nilai awal 1
        int testCase = 1;

        // Gunakan while loop
        // Buat kondisi agar loop berjalan selama testCase kurang dari atau sama dengan
        // 5
        while (testCase <= 5) {

            // Di dalam loop, tampilkan nomor test case saat ini
            System.out.println("Test Case: " + testCase);

            // Di dalam loop, tambahkan nilai testCase sebanyak 1
            // Gunakan increment agar loop tidak berjalan selamanya
            testCase++;
        }
    }
}