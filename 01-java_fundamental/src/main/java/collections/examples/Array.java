// Menentukan package tempat class Array berada
package collections.examples;

// Mendefinisikan class dengan nama Array
public class Array {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat array String untuk menyimpan nama browser
        String[] browsers = { "Chrome", "Firefox", "Edge" };

        // Mengakses element pertama menggunakan index 0
        System.out.println("Browser pertama: " + browsers[0]);

        // Mengakses element kedua menggunakan index 1
        System.out.println("Browser kedua: " + browsers[1]);

        // Mengakses element ketiga menggunakan index 2
        System.out.println("Browser ketiga: " + browsers[2]);

        // Menampilkan jumlah element yang dimiliki array
        System.out.println("Jumlah browser: " + browsers.length);

        // Menggunakan for loop untuk mengakses setiap element array
        for (int i = 0; i < browsers.length; i++) {

            // Menampilkan browser berdasarkan index saat ini
            System.out.println("Browser: " + browsers[i]);
        }
    }
}