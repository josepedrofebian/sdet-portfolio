// Tentukan package sesuai lokasi file ini
package basics.challenges;

// Import Scanner untuk menerima input dari keyboard
import java.util.Scanner;

// Buat sebuah class bernama InputOutputChallenge
public class InputOutputChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Buat object Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Minta user memasukkan username
        System.out.println("Masukkan username:");

        // Simpan input username ke dalam variable bertipe String
        String username = scanner.nextLine();

        // Minta user memasukkan password
        System.out.println("Masukkan password:");

        // Simpan input password ke dalam variable bertipe String
        String password = scanner.nextLine();

        // Minta user memasukkan umur
        System.out.println("Masukkan umur:");

        // Simpan input umur ke dalam variable bertipe int
        int age = scanner.nextInt();

        // Tampilkan username yang dimasukkan user
        System.out.println("Username: " + username);

        // Tampilkan password yang dimasukkan user
        System.out.println("Password: " + password);

        // Tampilkan umur yang dimasukkan user
        System.out.println("Age: " + age);

        // Tutup Scanner setelah selesai digunakan
        scanner.close();
    }
}
