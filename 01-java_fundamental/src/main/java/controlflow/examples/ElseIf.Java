// Menentukan package tempat class ElseIf berada
package controlflow.examples;

// Mendefinisikan class dengan nama ElseIf
public class ElseIf {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Menyimpan nilai test score
        int testScore = 85;

        // Mengecek apakah testScore lebih besar atau sama dengan 90
        if (testScore >= 90) {

            // Menampilkan grade A jika kondisi pertama terpenuhi
            System.out.println("Grade: A");

        // Mengecek kondisi kedua jika kondisi pertama false
        } else if (testScore >= 80) {

            // Menampilkan grade B jika kondisi kedua terpenuhi
            System.out.println("Grade: B");

        // Mengecek kondisi ketiga jika kondisi sebelumnya false
        } else if (testScore >= 70) {

            // Menampilkan grade C jika kondisi ketiga terpenuhi
            System.out.println("Grade: C");

        // Menangani semua kondisi yang tidak memenuhi kondisi sebelumnya
        } else {

            // Menampilkan grade F
            System.out.println("Grade: F");
        }
    }
}