package lambda.examples;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        // [Java - Function]
        // Function<T, R> adalah functional interface bawaan Java.
        // T = tipe data input.
        // R = tipe data return/output.

        // [Java - Function]
        // Lambda ini menerima String sebagai input
        // dan mengembalikan Integer sebagai output.
        Function<String, Integer> textLength = text -> text.length();

        // [Java - Function]
        // Kirim String "Selenium" sebagai input.
        // Hasil return dari Lambda adalah jumlah karakter String tersebut.
        int result = textLength.apply("Selenium");

        // [Java - Function]
        // Cetak hasil return Lambda.
        System.out.println("Text length: " + result);
    }
}