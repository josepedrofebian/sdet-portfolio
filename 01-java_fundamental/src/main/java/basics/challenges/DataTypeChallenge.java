// Tentukan package sesuai lokasi file ini
package basics.challenges;

// Buat sebuah class bernama DataTypeChallenge
public class DataTypeChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {
        // Buat variable bernama employeeCount
        // Gunakan tipe data int
        // Isi dengan jumlah employee pilihan lu
        int employeeCount = 10;

        // Buat variable bernama averageScore
        // Gunakan tipe data double
        // Isi dengan nilai desimal pilihan lu
        double averageScore = 9.0;

        // Buat variable bernama isTestPassed
        // Gunakan tipe data boolean
        // Isi dengan true atau false
        boolean isTestPassed = true;

        // Buat variable bernama testGrade
        // Gunakan tipe data char
        // Isi dengan satu karakter
        char testGrade = 'A';

        // Buat variable bernama browser
        // Gunakan tipe data String
        // Isi dengan nama browser pilihan lu
        String browser = "Chrome";

        // Tampilkan semua variable ke console
        System.out.println("Jumlah Employee: " + employeeCount);
        System.out.println("Rata-Rata Nilai: " + averageScore);
        System.out.println("Apakah Lolos Uji: " + isTestPassed);
        System.out.println("Test Grade: " + testGrade);
        System.out.println("Browser: " + browser);

        // Ubah nilai employeeCount ke nilai baru
        employeeCount = 20;

        // Tampilkan kembali employeeCount setelah nilainya diubah
        System.out.println("Jumlah Employee Baru: " + employeeCount);
    }

}