// Menentukan package tempat class InputOutput berada
package basics.examples;

// Mengimport Scanner untuk menerima input dari user
import java.util.Scanner;

// Mendefinisikan class dengan nama InputOutput
public class InputOutput {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Membuat object Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pesan kepada user
        System.out.println("Masukkan username:");

        // Membaca input berupa String dari user
        String username = scanner.nextLine();

        // Menampilkan username yang dimasukkan user
        System.out.println("Username: " + username);

        // Menampilkan pesan kepada user
        System.out.println("Masukkan umur:");

        // Membaca input berupa bilangan bulat dari user
        int age = scanner.nextInt();

        // Menampilkan umur yang dimasukkan user
        System.out.println("Age: " + age);

        // Menutup Scanner setelah selesai digunakan
        scanner.close();
    }
}