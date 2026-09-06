package lambda.challenges;

import java.util.function.Function;

public class FunctionChallenge {
    public static void main(String[] args) {

        // [Java - Challenge]
        // Buat Function yang menerima String sebagai input
        // dan mengembalikan String dalam bentuk uppercase.
        // Gunakan Lambda.
        // Contoh: "selenium" -> "SELENIUM"
        Function<String, String> textUppercase = text -> text.toUpperCase();
        // [Java - Challenge]
        // Gunakan .apply() untuk mengirim String "java automation".
        // Simpan hasilnya ke variable result.
        // Cetak dengan format:
        // "Uppercase result: " + result
        String result = textUppercase.apply("java automation");
        System.out.println("Uppercase result: " + result);

    }
}