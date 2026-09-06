package lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstExample {
    public static void main(String[] args) {

        // [Java - Stream]
        // Buat List berisi beberapa angka.
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

        // [Java - Stream]
        // Cari element pertama yang lebih besar dari 12.
        // findFirst() menghasilkan Optional<Integer>
        // karena hasil pencarian belum tentu ditemukan.
        Optional<Integer> result = numbers.stream()
                .filter(number -> number > 12)
                .findFirst();

        // [Java - Stream]
        // Cek apakah hasil pencarian ditemukan.
        if (result.isPresent()) {

            // [Java - Stream]
            // get() mengambil value yang berada di dalam Optional.
            System.out.println("First result: " + result.get());
        }
    }
}