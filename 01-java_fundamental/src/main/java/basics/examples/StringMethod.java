// Menentukan package tempat class String berada
package basics.examples;

// Mendefinisikan class dengan nama String
public class StringMethod {

    // Method main sebagai titik awal program
    public static void main(java.lang.String[] args) {

        // Membuat variable username bertipe String
        String username = "Jose";

        // Menggabungkan String dengan teks lainnya
        String greeting = "Hello, " + username;

        // Menampilkan hasil concatenation
        System.out.println(greeting);

        // Menghitung jumlah karakter dalam username
        int usernameLength = username.length();

        // Menampilkan panjang username
        System.out.println(usernameLength);

        // Mengubah username menjadi huruf kapital
        String upperCaseUsername = username.toUpperCase();

        // Menampilkan username dalam huruf kapital
        System.out.println(upperCaseUsername);

        // Mengubah username menjadi huruf kecil
        String lowerCaseUsername = username.toLowerCase();

        // Menampilkan username dalam huruf kecil
        System.out.println(lowerCaseUsername);

        // Mengecek apakah username mengandung teks tertentu
        boolean containsJose = username.contains("Jose");

        // Menampilkan hasil pengecekan
        System.out.println(containsJose);

        // Membuat String lain untuk dibandingkan
        String anotherUsername = "Jose";

        // Membandingkan isi dua String menggunakan equals()
        boolean isSameUsername = username.equals(anotherUsername);

        // Menampilkan hasil perbandingan
        System.out.println(isSameUsername);
    }
}