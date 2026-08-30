// Tentukan package sesuai lokasi file ini
package exceptions.challenges;

// Buat class bernama FinallyChallenge
public class FinallyChallenge {
    public static void main(String[] args) {
        // Buat method main

        // Buat try block
        try {
            // Di dalam try, buat array int bernama testScores
            // Isi dengan 3 nilai
            int[] testScores = new int[3];
            testScores[0] = 1;
            testScores[1] = 2;
            testScores[2] = 3;
            // Coba akses index yang tidak tersedia
            System.out.println(testScores[5]);
            // Buat catch untuk menangkap ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Di dalam catch, tampilkan:
            // "Test score tidak ditemukan"
            System.out.println("Test Score Tidak Ditemukan");
            // Buat finally block
        } finally {
            // Di dalam finally, tampilkan:
            // "Cleanup test selesai"
            System.out.println("Cleanup test selesai");
        }
    }
}
