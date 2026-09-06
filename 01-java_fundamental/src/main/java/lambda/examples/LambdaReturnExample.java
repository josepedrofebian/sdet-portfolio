package lambda.examples;

// [Java - Functional Interface]
// Functional Interface dengan method yang memiliki
// return type int.
@FunctionalInterface
interface Calculator {

    // [Java - Abstract Method]
    // Method menerima dua integer dan mengembalikan integer.
    int calculate(int a, int b);
}

public class LambdaReturnExample {

    public static void main(String[] args) {

        // [Java - Lambda dengan Expression Body]
        // Karena body hanya berupa satu expression,
        // hasil expression tersebut otomatis menjadi return value.
        Calculator expressionLambda = (a, b) -> a * b;

        // [Java - Lambda dengan Block Body]
        // Karena menggunakan { }, return harus ditulis secara eksplisit.
        Calculator blockLambda = (a, b) -> {
            return a * b;
        };

        // [Java - Method Call]
        // Memanggil Lambda pertama dan menyimpan hasilnya.
        int expressionResult = expressionLambda.calculate(5, 6);

        // [Java - Method Call]
        // Memanggil Lambda kedua dan menyimpan hasilnya.
        int blockResult = blockLambda.calculate(5, 6);

        // [Java - Output]
        // Menampilkan hasil dari kedua Lambda.
        System.out.println("Expression result: " + expressionResult);
        System.out.println("Block result: " + blockResult);
    }
}