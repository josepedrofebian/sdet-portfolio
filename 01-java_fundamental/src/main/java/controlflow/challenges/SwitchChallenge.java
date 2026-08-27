// Tentukan package sesuai lokasi file ini
package controlflow.challenges;

// Buat sebuah class bernama SwitchChallenge
public class SwitchChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Buat variable bernama role
        // Gunakan tipe data String
        // Isi dengan nilai role pilihan lu
        String role = "MAKER";

        // Gunakan switch untuk mengecek nilai role
        switch (role) {
            // Gunakan case untuk mengecek apakah role bernilai MAKER
            case "MAKER":
                // Jika kondisi terpenuhi, tampilkan "User adalah Maker"
                System.out.println("User adalah Maker");
                // Gunakan break untuk menghentikan eksekusi switch
                break;

            // Gunakan case untuk mengecek apakah role bernilai CHECKER
            case "CHECKER":
                // Jika kondisi terpenuhi, tampilkan "User adalah Checker"
                System.out.println("User adalah Checker");
                // Gunakan break untuk menghentikan eksekusi switch
                break;

            // Gunakan default untuk menangani nilai selain MAKER dan CHECKER
            default:
                // Jika kondisi terpenuhi, tampilkan "Role tidak dikenali"
                System.out.println("Role tidak dikenali");
                // Gunakan break untuk menghentikan eksekusi switch
                break;
        }
    }
}