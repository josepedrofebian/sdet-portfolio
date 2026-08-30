// Tentukan package sesuai lokasi file ini
package exceptions.examples;

// Buat class bernama TryCatchChallenge
public class TryCatchChallenge {

    // Buat method main
    public static void main(String[] args) {

        // Buat try block
        try {
            // Di dalam try, buat array int bernama testScores
            // Isi dengan 3 nilai test score
            int[] testScores = { 70, 30, 80 };
            // Di dalam try, coba akses index ke-5
            System.out.println(testScores[5]);
            // Buat catch untuk menangkap ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Di dalam catch, tampilkan pesan:
            // "Test score tidak ditemukan"
            System.out.println("Test Score tidak ditemukan");
        }
        // Setelah try-catch selesai, tampilkan:
        // "Program tetap berjalan"
        System.out.println("Program tetap berjalan");
    }

}
