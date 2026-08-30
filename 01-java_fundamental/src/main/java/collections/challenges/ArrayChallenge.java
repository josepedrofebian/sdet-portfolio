// Tentukan package sesuai lokasi file ini
package collections.challenges;

// Buat sebuah class bernama ArrayChallenge
public class ArrayChallenge {
    public static void main(String[] args) {
        // Buat sebuah array String bernama browsers
        // Isi array dengan 4 nama browser pilihan lu
        String[] browser = { "Chrome", "FireFox", "Safari", "Edge" };
        // Tampilkan element pertama dari array
        System.out.println(browser[0]);
        // Tampilkan element terakhir dari array
        // Gunakan index berdasarkan panjang array
        // Jangan menuliskan angka index terakhir secara hardcode
        System.out.println(browser[browser.length - 1]);
        // Tampilkan jumlah element yang terdapat di dalam array
        System.out.println(browser.length);
        // Gunakan for loop untuk melakukan iterasi terhadap seluruh element array
        for (int i = 0; i < browser.length; i++) {
            // Di dalam loop, tampilkan setiap nama browser
            System.out.println("Browser ke-" + (i + 1) + ": " + browser[i]);
        }
        // Buat sebuah array int bernama testScores
        // Isi array dengan 5 nilai test score pilihan lu
        int[] testScores = { 60, 70, 80, 90, 100 };
        // Gunakan for loop untuk menampilkan seluruh test score
        for (int i = 0; i < testScores.length; i++) {
            System.out.println("Test Score ke-" + (i + 1) + ": " + testScores[i]);
        }
    }
}
