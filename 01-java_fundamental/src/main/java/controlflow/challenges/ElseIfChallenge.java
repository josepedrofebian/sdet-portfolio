// Tentukan package sesuai lokasi file ini
package controlflow.challenges;

// Buat sebuah class bernama ElseIfChallenge
public class ElseIfChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Buat variable bernama testScore
        // Gunakan tipe data int
        // Isi dengan nilai test score pilihan lu
        int testScore = 85;

        // Gunakan if untuk mengecek apakah testScore lebih besar atau sama dengan 90
        if (testScore >= 90) {
            // Jika kondisi terpenuhi, tampilkan "Excellent"
            System.out.println("Excellent");
        }
        // Gunakan else if untuk mengecek apakah testScore lebih besar atau sama dengan
        // 80
        else if (testScore >= 80) {
            // Jika kondisi terpenuhi, tampilkan "Good"
            System.out.println("Good");
        }

        else if (testScore >= 70) {
            // Jika kondisi terpenuhi, tampilkan "Passed"
            System.out.println("Passed");
        }

        else {
            // Jika kondisi terpenuhi, tampilkan "Failed"
            System.out.println("Failed");
        }
    }
}
