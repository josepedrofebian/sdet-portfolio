package lambda.examples;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        // [Java - Challenge]
        // Buat Consumer<String> yang menerima sebuah nama.
        // Gunakan Lambda.
        // Consumer harus mencetak:
        // "Hello, " + nama
        Consumer<String> printMessage = nama -> System.out.println("Hello, " + nama);
        // [Java - Challenge]
        // Gunakan .accept() untuk mengirim nama "Jose".
        // Consumer tidak perlu menyimpan hasil ke variable
        // karena Consumer tidak memiliki return value.
        printMessage.accept("Jose Pedro Febian");
    }
}