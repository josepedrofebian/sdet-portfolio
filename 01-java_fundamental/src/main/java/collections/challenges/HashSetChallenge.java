// Tentukan package sesuai lokasi file ini
package collections.challenges;

// Import HashSet
import java.util.HashSet;
// Import Set
import java.util.Set;

// Buat sebuah class bernama HashSetChallenge
public class HashSetChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Buat Set bertipe String bernama browsers
        // Gunakan HashSet sebagai implementasinya
        Set<String> browsers = new HashSet<>();
        // Tambahkan 4 nama browser ke dalam Set
        browsers.add("Chrome");
        browsers.add("Safari");
        browsers.add("FireFox");
        browsers.add("Edge");
        // Tambahkan salah satu browser yang sama sekali lagi
        // Perhatikan apa yang terjadi dengan duplicate value
        browsers.add("Edge");
        // Tampilkan seluruh isi Set
        System.out.println(browsers);
        // Tampilkan jumlah element menggunakan size()
        System.out.println(browsers.size());
        // Gunakan contains() untuk mengecek apakah browser tertentu ada di dalam Set
        System.out.println("Ada Edge: " + browsers.contains("Edge"));
        // Hapus salah satu browser menggunakan remove()
        browsers.remove("Edge");
        // Tampilkan kembali isi Set setelah browser dihapus
        System.out.println("Setelah dihapus: " + browsers);
        // Gunakan enhanced for loop untuk menampilkan seluruh browser
        for (String browser : browsers) {
            System.out.println(browser);
        }
    }
}
