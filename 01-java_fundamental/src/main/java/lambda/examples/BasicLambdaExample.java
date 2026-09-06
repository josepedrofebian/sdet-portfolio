package lambda.examples;

// [Java - Functional Interface]
// Interface dengan tepat satu abstract method
// dapat digunakan sebagai target Lambda.
@FunctionalInterface
interface Calculator {

    // [Java - Abstract Method]
    // Method yang akan diimplementasikan oleh Lambda.
    int calculate(int a, int b);
}

public class BasicLambdaExample {

    public static void main(String[] args) {

        // [Java - Lambda Expression]
        // Lambda memberikan implementasi untuk method calculate().
        Calculator calculator = (a, b) -> a * b;
        
        // [Java - Method Call]
        // Memanggil method calculate() melalui object calculator.
        int result = calculator.calculate(5, 6);

        // [Java - Output]
        // Menampilkan hasil perhitungan.
        System.out.println("Calculation result: " + result);
    }
}