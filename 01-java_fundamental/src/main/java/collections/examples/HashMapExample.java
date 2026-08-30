// Menentukan package tempat class HashMapExample berada
package collections.examples;

// Import HashMap
import java.util.HashMap;

// Import Map
import java.util.Map;

// Mendefinisikan class HashMapExample
public class HashMapExample {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat Map dengan String sebagai key dan String sebagai value
        Map<String, String> testData = new HashMap<>();

        // Menambahkan data menggunakan key dan value
        testData.put("username", "Jose");
        testData.put("password", "Rahasia");
        testData.put("role", "MAKER");

        // Menampilkan seluruh isi Map
        System.out.println("Test Data: " + testData);

        // Mengambil value berdasarkan key
        System.out.println("Username: " + testData.get("username"));

        // Mengambil password berdasarkan key
        System.out.println("Password: " + testData.get("password"));

        // Mengecek apakah key tertentu ada
        System.out.println("Ada role: " + testData.containsKey("role"));

        // Mengecek apakah value tertentu ada
        System.out.println("Ada MAKER: " + testData.containsValue("MAKER"));

        // Mengubah value berdasarkan key
        testData.put("role", "CHECKER");

        // Menampilkan data setelah value diubah
        System.out.println("Setelah update: " + testData);

        // Menghapus data berdasarkan key
        testData.remove("password");

        // Menampilkan data setelah dihapus
        System.out.println("Setelah remove: " + testData);

        // Melakukan iterasi terhadap setiap key
        for (String key : testData.keySet()) {

            // Mengambil value berdasarkan key saat ini
            String value = testData.get(key);

            // Menampilkan pasangan key dan value
            System.out.println(key + " = " + value);
        }
    }
}