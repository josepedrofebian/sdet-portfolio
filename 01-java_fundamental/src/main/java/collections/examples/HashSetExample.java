// Menentukan package tempat class HashSetExample berada
package collections.examples;

// Import HashSet
import java.util.HashSet;

// Import Set
import java.util.Set;

// Mendefinisikan class HashSetExample
public class HashSetExample {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat Set bertipe String menggunakan HashSet
        Set<String> browsers = new HashSet<>();

        // Menambahkan data ke dalam Set
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");

        // Menambahkan data yang sama
        // HashSet tidak akan menyimpan duplicate
        browsers.add("Chrome");

        // Menampilkan seluruh isi Set
        System.out.println("Browsers: " + browsers);

        // Menampilkan jumlah element
        System.out.println("Jumlah browser: " + browsers.size());

        // Mengecek apakah Set mengandung value tertentu
        System.out.println("Ada Chrome: " + browsers.contains("Chrome"));

        // Menghapus element
        browsers.remove("Edge");

        // Menampilkan Set setelah element dihapus
        System.out.println("Setelah remove: " + browsers);

        // Melakukan iterasi terhadap seluruh element
        for (String browser : browsers) {

            // Menampilkan setiap browser
            System.out.println("Browser: " + browser);
        }
    }
}