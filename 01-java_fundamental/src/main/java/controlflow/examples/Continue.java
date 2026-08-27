// Menentukan package tempat class Continue berada
package controlflow.examples;

// Mendefinisikan class dengan nama Continue
public class Continue {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Menjalankan for loop dari angka 1 sampai 5
        for (int testCase = 1; testCase <= 5; testCase++) {

            // Mengecek apakah testCase bernilai 3
            if (testCase == 3) {

                // Melewati iterasi saat ini dan langsung lanjut ke iterasi berikutnya
                continue;
            }

            // Menampilkan test case yang tidak dilewati
            System.out.println("Running test case: " + testCase);
        }
    }
}