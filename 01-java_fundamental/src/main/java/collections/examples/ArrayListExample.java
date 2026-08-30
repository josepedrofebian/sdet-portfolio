// Menentukan package tempat class ArrayListExample berada
package collections.examples;

// Import ArrayList
import java.util.ArrayList;

// Import List
import java.util.List;

// Mendefinisikan class ArrayListExample
public class ArrayListExample {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat List bertipe String menggunakan ArrayList
        List<String> browsers = new ArrayList<>();

        // Menambahkan data ke dalam List
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Safari");

        // Menampilkan seluruh isi List
        System.out.println("Browsers: " + browsers);

        // Mengakses element berdasarkan index
        System.out.println("Browser pertama: " + browsers.get(0));

        // Menampilkan jumlah element
        System.out.println("Jumlah browser: " + browsers.size());

        // Mengubah element pada index tertentu
        browsers.set(1, "Edge");

        // Menampilkan List setelah element diubah
        System.out.println("Browsers setelah update: " + browsers);

        // Menghapus element berdasarkan index
        browsers.remove(2);

        // Menampilkan List setelah element dihapus
        System.out.println("Browsers setelah remove: " + browsers);

        // Mengecek apakah List mengandung value tertentu
        System.out.println("Ada Chrome: " + browsers.contains("Chrome"));

        // Melakukan iterasi menggunakan enhanced for loop
        for (String browser : browsers) {

            // Menampilkan setiap browser
            System.out.println("Browser: " + browser);
        }
    }
}