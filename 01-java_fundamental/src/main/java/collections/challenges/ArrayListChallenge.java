// Tentukan package sesuai lokasi file ini
package collections.challenges;

// Import ArrayList
import java.util.ArrayList;
// Import List
import java.util.List;

// Buat sebuah class bernama ArrayListChallenge
public class ArrayListChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Buat List bertipe String bernama browsers
        // Gunakan ArrayList sebagai implementasinya
        List<String> browsers = new ArrayList<>();
        // Tambahkan 4 nama browser ke dalam List
        browsers.add("Chrome");
        browsers.add("Edge");
        browsers.add("Safari");
        browsers.add("FireFox");
        // Tampilkan seluruh isi List
        System.out.println(browsers);
        // Tampilkan element pertama menggunakan method get()
        System.out.println(browsers.get(0));
        // Tampilkan jumlah element menggunakan method size()
        System.out.println(browsers.size());
        // Ubah salah satu browser menggunakan method set()
        browsers.set(1, "Opera");
        // Tampilkan kembali List setelah diubah
        System.out.println("Setelah diubah: " + browsers);
        // Hapus salah satu browser menggunakan method remove()
        browsers.remove(1);
        // Tampilkan kembali List setelah element dihapus
        System.out.println("Setelah dihapus: " + browsers);
        // Gunakan method contains() untuk mengecek apakah List
        // mengandung browser tertentu
        System.out.println("Cek Chrome: " + browsers.contains("Chrome"));
        // Gunakan enhanced for loop untuk menampilkan seluruh browser
        for (String browser : browsers) {
            System.out.println(browser);
        }
    }
}
