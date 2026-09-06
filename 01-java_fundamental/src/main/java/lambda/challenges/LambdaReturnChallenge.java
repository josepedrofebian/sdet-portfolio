package lambda.challenges;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class LambdaReturnChallenge {
    public static void main(String[] args) {

        // [Java - Challenge]
        // Buat Lambda dengan expression body yang mengembalikan hasil pembagian a
        // dengan b.
        // Gunakan angka 20 dan 5.
        // Simpan hasilnya ke variable expressionResult.
        // Cetak dengan format: "Expression result: " + expressionResult
        Calculator expressionBody = (a, b) -> a / b;
        int expressionResult = expressionBody.calculate(20, 5);
        System.out.println("Expression result: " + expressionResult);
        // [Java - Challenge]
        // Buat Lambda dengan block body yang mengembalikan hasil pengurangan a dengan
        // b.
        // Gunakan angka 50 dan 20.
        // Karena menggunakan block body {}, wajib menggunakan return.
        // Simpan hasilnya ke variable blockResult.
        // Cetak dengan format: "Block result: " + blockResult
        Calculator blockBody = (a, b) -> {
            return a - b;
        };
        int blockResult = blockBody.calculate(50, 20);
        System.out.println("Block result: " + blockResult);
    }
}