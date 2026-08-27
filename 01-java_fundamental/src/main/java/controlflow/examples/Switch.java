// Menentukan package tempat class Switch berada
package controlflow.examples;

// Mendefinisikan class dengan nama Switch
public class Switch {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // Menyimpan role user
        String role = "CHECKER";

        // Mengecek nilai role menggunakan switch
        switch (role) {

            // Menjalankan blok ini jika role bernilai MAKER
            case "MAKER":

                // Menampilkan akses untuk maker
                System.out.println("User adalah Maker");

                // Menghentikan eksekusi switch
                break;

            // Menjalankan blok ini jika role bernilai CHECKER
            case "CHECKER":

                // Menampilkan akses untuk checker
                System.out.println("User adalah Checker");

                // Menghentikan eksekusi switch
                break;

            // Menjalankan blok ini jika tidak ada case yang cocok
            default:

                // Menampilkan pesan jika role tidak dikenali
                System.out.println("Role tidak dikenali");

                // Menghentikan switch
                break;
        }
    }
}