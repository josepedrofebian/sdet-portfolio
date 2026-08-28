// Menentukan package tempat class ReturnValue berada
package methods.examples;

// Mendefinisikan class dengan nama ReturnValue
public class ReturnValue {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Memanggil method calculateSum dan menyimpan nilai yang dikembalikan
        int result = calculateSum(10, 5);

        // Menampilkan hasil yang dikembalikan oleh method
        System.out.println("Result: " + result);

        // Memanggil method getUsername dan menyimpan String yang dikembalikan
        String username = getUsername();

        // Menampilkan username yang dikembalikan
        System.out.println("Username: " + username);
    }

    // Membuat method calculateSum yang menerima dua parameter bertipe int
    // int sebelum nama method menunjukkan method mengembalikan nilai bertipe int
    public static int calculateSum(int firstNumber, int secondNumber) {

        // Menghitung penjumlahan dua parameter
        int result = firstNumber + secondNumber;

        // Mengembalikan result kepada kode yang memanggil method
        return result;
    }

    // Membuat method getUsername yang mengembalikan String
    public static String getUsername() {

        // Mengembalikan username dari method
        return "Jose";
    }
}