package lambda.challenges;

// ============================================================
// CHALLENGE: ANONYMOUS CLASS
// ============================================================

// [1] Buat interface bernama Calculator.
interface Calculator {
    // [2] Di dalam interface Calculator,
    // buat abstract method:
    // int calculate(int a, int b);
    int calculate(int a, int b);
}
// [3] Buat class AnonymousClassChallenge.

public class AnonymousClassChallenge {
    public static void main(String[] args) {

        // [4] Di dalam main(), buat object Calculator
        // menggunakan Anonymous Class.
        Calculator calculator = new Calculator() {
            // [5] Implementasikan method calculate()
            // untuk menjumlahkan a dan b.
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        // [6] Panggil calculate() dengan:
        // 10 dan 20.
        int result = calculator.calculate(10, 20);
        // [7] Tampilkan hasilnya ke console.
        // Expected output:
        // Calculation result: 30
        System.out.println("Calculation result: " + result);
    }
}
