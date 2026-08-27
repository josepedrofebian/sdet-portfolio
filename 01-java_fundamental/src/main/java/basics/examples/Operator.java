// Menentukan package tempat class Operator berada
package basics.examples;

// Mendefinisikan class dengan nama Operator
public class Operator {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        // =========================
        // Arithmetic Operator
        // =========================

        // Menyimpan angka pertama
        int firstNumber = 10;

        // Menyimpan angka kedua
        int secondNumber = 3;

        // Melakukan penjumlahan
        int addition = firstNumber + secondNumber;

        // Melakukan pengurangan
        int subtraction = firstNumber - secondNumber;

        // Melakukan perkalian
        int multiplication = firstNumber * secondNumber;

        // Melakukan pembagian
        int division = firstNumber / secondNumber;

        // Mendapatkan sisa pembagian
        int remainder = firstNumber % secondNumber;

        // Menampilkan hasil penjumlahan
        System.out.println("Addition: " + addition);

        // Menampilkan hasil pengurangan
        System.out.println("Subtraction: " + subtraction);

        // Menampilkan hasil perkalian
        System.out.println("Multiplication: " + multiplication);

        // Menampilkan hasil pembagian
        System.out.println("Division: " + division);

        // Menampilkan sisa pembagian
        System.out.println("Remainder: " + remainder);

        // =========================
        // Comparison Operator
        // =========================

        // Membuat variable untuk menyimpan umur
        int age = 26;

        // Mengecek apakah age sama dengan 26
        boolean isAgeEqual = age == 26;

        // Mengecek apakah age tidak sama dengan 30
        boolean isAgeNotEqual = age != 30;

        // Mengecek apakah age lebih besar dari 20
        boolean isOlderThanTwenty = age > 20;

        // Mengecek apakah age lebih kecil dari 30
        boolean isYoungerThanThirty = age < 30;

        // Menampilkan hasil comparison
        System.out.println("Age equal 26: " + isAgeEqual);

        // Menampilkan hasil comparison
        System.out.println("Age not equal 30: " + isAgeNotEqual);

        // Menampilkan hasil comparison
        System.out.println("Age older than 20: " + isOlderThanTwenty);

        // Menampilkan hasil comparison
        System.out.println("Age younger than 30: " + isYoungerThanThirty);

        // =========================
        // Logical Operator
        // =========================

        // Menyimpan status login user
        boolean isLoggedIn = true;

        // Menyimpan status admin user
        boolean isAdmin = true;

        // Mengecek apakah user sudah login DAN merupakan admin
        boolean canAccessAdminPage = isLoggedIn && isAdmin;

        // Mengecek apakah user sudah login ATAU merupakan admin
        boolean hasBasicAccess = isLoggedIn || isAdmin;

        // Membalik nilai isLoggedIn
        boolean isNotLoggedIn = !isLoggedIn;

        // Menampilkan hasil logical operator
        System.out.println("Can access admin page: " + canAccessAdminPage);

        // Menampilkan hasil logical operator
        System.out.println("Has basic access: " + hasBasicAccess);

        // Menampilkan hasil NOT operator
        System.out.println("Is not logged in: " + isNotLoggedIn);
    }
}