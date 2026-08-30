// Menentukan package tempat class berada
package exceptions.examples;

// Mendefinisikan class ThrowThrowsExample
public class ThrowThrowsExample {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Memanggil method login di dalam try
        try {
            login("");

            // Menangkap exception yang dilempar oleh login()
        } catch (IllegalArgumentException e) {

            // Menampilkan pesan exception
            System.out.println(e.getMessage());
        }
    }

    // Method login menerima username
    // Method dapat melempar IllegalArgumentException
    public static void login(String username) throws IllegalArgumentException {

        // Mengecek apakah username kosong
        if (username.isEmpty()) {

            // Melempar exception secara manual
            throw new IllegalArgumentException("Username tidak boleh kosong");
        }

        // Menampilkan username jika valid
        System.out.println("Login: " + username);
    }
}