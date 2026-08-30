// Menentukan package tempat class TryCatchExample berada
package exceptions.challenges;

// Mendefinisikan class TryCatchExample
public class TryCatchExample {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Memulai blok yang kemungkinan menghasilkan exception
        try {

            // Membuat array dengan 3 element
            int[] testScores = { 80, 90, 100 };

            // Mencoba mengakses index yang tidak tersedia
            System.out.println(testScores[3]);

            // Menangkap exception jika terjadi ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {

            // Menampilkan pesan ketika exception terjadi
            System.out.println("Index array tidak tersedia");
        }

        // Program tetap melanjutkan eksekusi setelah exception ditangani
        System.out.println("Test selesai");
    }
}