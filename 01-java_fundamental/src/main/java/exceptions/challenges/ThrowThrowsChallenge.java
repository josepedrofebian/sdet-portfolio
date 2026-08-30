// Tentukan package sesuai lokasi file ini
package exceptions.challenges;

// Buat class bernama ThrowThrowsChallenge
public class ThrowThrowsChallenge {
    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Di dalam main, gunakan try-catch
        try {
            // Di dalam try, panggil method login()
            // Kirimkan username kosong sebagai argument
            login("");
        } catch (IllegalArgumentException e) {
            // Di dalam catch, tangkap IllegalArgumentException
            // Tampilkan pesan exception menggunakan getMessage()
            System.out.println(e.getMessage());
        } finally {
            // Setelah try-catch, tampilkan:
            // "Program tetap berjalan"
            System.out.println("Program tetap berjalan");
        }
    }

    // Buat method login()
    // Gunakan access modifier public
    // Gunakan static
    // Gunakan return type void
    // Terima parameter String bernama username
    // Deklarasikan throws IllegalArgumentException
    public static void login(String username) throws IllegalArgumentException {
        // Di dalam login(), cek apakah username kosong menggunakan isEmpty()
        if (username.isEmpty()) {
            // Jika username kosong:
            // Gunakan throw untuk melempar IllegalArgumentException
            // Dengan pesan "Username tidak boleh kosong"
            throw new IllegalArgumentException("Username tidak boleh kosong");
        } else {
            // Jika username tidak kosong:
            // Tampilkan "Login berhasil: " + username
            System.out.println("Login berhasil " + username);
        }
    }
}
