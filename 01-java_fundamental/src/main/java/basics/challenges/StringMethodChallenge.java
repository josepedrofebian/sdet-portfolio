// Tentukan package sesuai lokasi file ini
package basics.challenges;

// Buat sebuah class bernama StringChallenge
public class StringMethodChallenge {

    // Buat method main sebagai titik awal program
    public static void main(String[] args) {

        // Buat variable bernama firstName
        // Gunakan tipe data String
        // Isi dengan nama depan pilihan lu
        String firstName = "Jose";
        // Buat variable bernama lastName
        // Gunakan tipe data String
        // Isi dengan nama belakang pilihan lu
        String lastName = "Pedro Febian";
        // Gabungkan firstName dan lastName menjadi fullName
        // Gunakan String concatenation
        String fullName = firstName + " " + lastName;
        // Tampilkan fullName ke console
        System.out.println("Full Name: " + fullName);

        // Hitung jumlah karakter yang terdapat pada fullName
        // Gunakan method length()
        int characterCountOfFullName = fullName.length();
        // Tampilkan jumlah karakter fullName
        System.out.println("Character Count of Full Name: " + characterCountOfFullName);

        // Ubah fullName menjadi huruf kapital
        // Gunakan method toUpperCase()
        String fullNameInUpperCase = fullName.toUpperCase();

        // Tampilkan hasilnya
        System.out.println("Full Name in Upper Case: " + fullNameInUpperCase);

        // Ubah fullName menjadi huruf kecil
        // Gunakan method toLowerCase()
        String fullNameInLowerCase = fullName.toLowerCase();

        // Tampilkan hasilnya
        System.out.println("Full Name in Lower Case: " + fullNameInLowerCase);

        // Cek apakah fullName mengandung nama depan
        // Gunakan method contains()
        boolean containsFirstName = fullName.contains(firstName);

        // Simpan hasil pengecekan ke dalam variable boolean

        // Tampilkan hasil pengecekan
        System.out.println("Full Name contains first name: " + containsFirstName);

        // Buat variable bernama expectedName
        // Isi dengan nama lengkap yang sama seperti fullName
        String expectedName = "Jose Pedro Febian";
        // Bandingkan fullName dengan expectedName
        // Gunakan method equals()
        // Simpan hasilnya ke dalam variable boolean
        boolean isNameEqual = fullName.equals(expectedName);

        // Tampilkan hasil perbandingan
        System.out.println("Full Name is equal to expected name: " + isNameEqual);
    }
}