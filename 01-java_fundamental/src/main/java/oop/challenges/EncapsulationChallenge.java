// Tentukan package sesuai lokasi file ini
package oop.challenges;

// Buat sebuah class bernama EncapsulationChallenge
public class EncapsulationChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Buat object dari class EncapsulationChallengeLoginPage
        EncapsulationChallengeLoginPage loginPage = new EncapsulationChallengeLoginPage();

        // Gunakan setter untuk memberikan username ke object
        loginPage.setUsername("");

        // Gunakan getter untuk mengambil username dari object
        String username = loginPage.getUsername();

        // Tampilkan username yang dikembalikan oleh getter
        System.out.println("Username: " + username);
    }
}

// Buat class LoginPage
class EncapsulationChallengeLoginPage {

    // Buat variable instance username dengan access modifier private
    private String username;

    // Buat setter untuk mengubah nilai username
    public void setUsername(String username) {

        // Mengecek apakah username tidak kosong
        if (!username.isEmpty()) {

            // Menyimpan nilai parameter ke variable instance
            this.username = username;

            // Menangani kondisi ketika username kosong
        } else {

            // Menampilkan pesan error
            System.out.println("Username tidak boleh kosong");
        }
    }

    // Buat getter untuk mengambil nilai username
    public String getUsername() {

        // Mengecek apakah username belum memiliki nilai
        if (username == null) {

            // Menampilkan pesan jika username masih kosong
            System.out.println("Username masih kosong");

            // Mengembalikan String sebagai hasil ketika username kosong
            return "Username Kosong";
        }

        // Mengembalikan nilai username
        return username;
    }
}