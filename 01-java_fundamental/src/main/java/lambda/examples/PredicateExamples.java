package lambda.examples;

import java.util.function.Predicate;

public class PredicateExamples {
    public static void main(String[] args) {

        // [Java - Challenge]
        // Buat Predicate<Integer> untuk mengecek apakah sebuah angka genap.
        // Gunakan Lambda.
        // Angka genap adalah angka yang habis dibagi 2.
        Predicate<Integer> isEvenNumber = number -> number % 2 == 0;
        // [Java - Challenge]
        // Gunakan .test() untuk mengecek angka 24.
        // Simpan hasilnya ke variable result.
        // Cetak dengan format:
        // "Is even: " + result
        boolean result = isEvenNumber.test(24);
        System.out.println("Is even: " + result);
    }
}