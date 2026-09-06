package lambda.challenges;
// ============================================================

// ============================================================

// [1] Buat Functional Interface bernama Calculator.
// [2] Gunakan annotation:
// @FunctionalInterface
@FunctionalInterface
interface Calculator {
    // [3] Di dalam Calculator,
    // buat tepat satu abstract method:
    // int calculate(int a, int b);
    int calculate(int a, int b);
}

// [4] Buat class FunctionalInterfaceChallenge.
public class FunctionalInterfaceChallenge {
    // [5] Di dalam main(),
    // buat object Calculator menggunakan Anonymous Class.
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            // [6] Implementasikan method calculate()
            // untuk melakukan perkalian antara a dan b.
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };

        // [7] Panggil calculate() dengan:
        // 5 dan 6.
        // [8] Simpan hasilnya ke variable result.
        int result = calculator.calculate(5, 6);
        // [9] Tampilkan hasilnya ke console.
        // Expected output:
        // Calculation result: 30
        System.out.println("Calculation result: " + result);
        // ============================================================
        // CATATAN
        // ============================================================

        // Jangan menggunakan Lambda pada challenge ini.
        // Kita masih fokus memahami hubungan:
        //
        // Interface
        // ↓
        // Functional Interface
        // ↓
        // Anonymous Class
        //
        // Lambda akan kita pelajari setelah challenge ini selesai.

        // ============================================================
    }

}
