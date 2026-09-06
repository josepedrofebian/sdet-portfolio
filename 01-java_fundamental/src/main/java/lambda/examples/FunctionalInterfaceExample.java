package lambda.examples;

// [Java - Functional Interface]
// Interface yang memiliki tepat satu abstract method
// disebut Functional Interface.
@FunctionalInterface
interface Calculator {

    // [Java - Abstract Method]
    // Ini adalah satu-satunya abstract method dalam interface.
    int calculate(int a, int b);
}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        // [Java - Anonymous Class]
        // Membuat object Calculator menggunakan Anonymous Class.
        Calculator calculator = new Calculator() {

            // [Java - Method Implementation]
            // Mengimplementasikan abstract method dari Calculator.
            @Override
            public int calculate(int a, int b) {

                // [Java - Return Value]
                // Mengembalikan hasil penjumlahan dua angka.
                return a + b;
            }
        };

        // [Java - Method Call]
        // Memanggil method calculate() menggunakan object calculator.
        int result = calculator.calculate(10, 20);

        // [Java - Output]
        // Menampilkan hasil perhitungan.
        System.out.println("Calculation result: " + result);
    }
}