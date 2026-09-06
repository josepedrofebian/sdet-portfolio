package lambda.challenges;
// ============================================================

// CHALLENGE: BASIC LAMBDA
// ============================================================

// [1] Buat Functional Interface bernama Calculator
// [2] Gunakan annotation:
// @FunctionalInterface
@FunctionalInterface
interface Calculator {
    // [3] Buat tepat satu abstract method:
    // int calculate(int a, int b);
    int calculate(int a, int b);
}

// [4] Buat class BasicLambdaChallenge.
public class BasicLambdaChallenge {
    public static void main(String[] args) {
        // [5] Di dalam main(),
        // buat object Calculator menggunakan Lambda.
        // [6] Lambda harus melakukan pengurangan:
        // a - b
        Calculator calculator = (a, b) -> a - b;

        // [7] Panggil calculate() dengan:
        // 50 dan 20.
        // [8] Simpan hasilnya ke variable result.
        int result = calculator.calculate(50, 20);

        // [9] Tampilkan hasilnya.
        // Expected output:
        // Calculation result: 30
        System.out.println("Calculation Result: " + result);

        // ============================================================
        // CATATAN
        // ============================================================

        // WAJIB menggunakan Lambda.
        // JANGAN menggunakan Anonymous Class.

        // Target:
        // Calculator calculator = (a, b) -> ...
    }
}
