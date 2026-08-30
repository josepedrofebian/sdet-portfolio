// Menentukan package tempat class FinallyExample berada
package exceptions.examples;

// Mendefinisikan class FinallyExample
public class FinallyExample {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Memulai blok yang mungkin menghasilkan exception
        try {

            // Membuat array dengan 3 element
            int[] testScores = { 70, 80, 90 };

            // Mencoba mengakses index yang tidak tersedia
            System.out.println(testScores[5]);

            // Menangkap exception yang terjadi
        } catch (ArrayIndexOutOfBoundsException e) {

            // Menampilkan pesan ketika exception terjadi
            System.out.println("Test score tidak ditemukan");

            // finally akan tetap dijalankan setelah try/catch
        } finally {

            // Menampilkan pesan cleanup
            System.out.println("Test selesai");
        }
    }
}