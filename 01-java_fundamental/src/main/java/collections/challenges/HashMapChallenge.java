// Tentukan package sesuai lokasi file ini
package collections.challenges;

// Import HashMap
import java.util.HashMap;
// Import Map
import java.util.Map;

// Buat sebuah class bernama HashMapChallenge
public class HashMapChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Buat Map bertipe String untuk key dan String untuk value
        // Gunakan HashMap sebagai implementasinya
        Map<String, String> person = new HashMap<>();
        // Tambahkan data username dengan value pilihan lu
        person.put("username", "Jose Pedro Febian");
        // Tambahkan data password dengan value pilihan lu
        person.put("password", "rahasia");
        // Tambahkan data role dengan value MAKER
        person.put("role", "SDET");
        // Tampilkan seluruh isi Map
        System.out.println(person);
        // Gunakan get() untuk mengambil username berdasarkan key "username"
        System.out.println(person.get("username"));
        // Gunakan get() untuk mengambil role berdasarkan key "role"
        System.out.println(person.get("role"));
        // Gunakan containsKey() untuk mengecek apakah key "password" tersedia
        System.out.println("Apakah key password tersedia: " + person.containsKey("password"));
        // Gunakan containsValue() untuk mengecek apakah value "MAKER" tersedia
        System.out.println("Apakah value MAKER tersedia: " + person.containsValue("MAKER"));
        // Ubah role dari MAKER menjadi CHECKER menggunakan put()
        person.put("role", "Checker");
        // Tampilkan Map setelah role diubah
        System.out.println("Map setelah diubah: " + person);
        // Hapus key "password" menggunakan remove()
        person.remove("password");
        // Tampilkan Map setelah password dihapus
        System.out.println("Map setelah dihapus: " + person);
        // Gunakan enhanced for loop + keySet()
        // untuk menampilkan setiap key dan value
        for (String key : person.keySet()) {
            String value = person.get(key);
            System.out.println("Key: " + key + " Value: " + value);
        }
    }
}
