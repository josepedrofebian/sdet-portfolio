// Menentukan package tempat class WhileLoop berada
package controlflow.examples;

// Mendefinisikan class dengan nama WhileLoop
public class WhileLoop {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat variable counter dengan nilai awal 1
        int counter = 1;

        // Menjalankan loop selama counter kurang dari atau sama dengan 5
        while (counter <= 5) {

            // Menampilkan nomor iterasi saat ini
            System.out.println("Running test case: " + counter);

            // Menambahkan 1 ke counter agar loop dapat berhenti
            counter++;
        }
    }
}