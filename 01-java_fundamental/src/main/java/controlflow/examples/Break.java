// Menentukan package tempat class Break berada
package controlflow.examples;

// Mendefinisikan class dengan nama Break
public class Break {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Menjalankan for loop dari angka 1 sampai 10
        for (int testCase = 1; testCase <= 10; testCase++) {

            // Mengecek apakah testCase sudah mencapai angka 5
            if (testCase == 5) {

                // Menghentikan loop ketika testCase bernilai 5
                break;
            }

            // Menampilkan nomor test case
            System.out.println("Running test case: " + testCase);
        }
    }
}