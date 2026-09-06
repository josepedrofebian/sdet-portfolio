package lambda.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterChallenge {
    public static void main(String[] args) {

        // [Java - Challenge]
        // Buat List<Integer> berisi angka:
        // 5, 10, 15, 20, 25, 30
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);
        // [Java - Challenge]
        // Ubah List menjadi Stream menggunakan stream().
        // Gunakan filter() untuk mengambil hanya angka
        // yang lebih besar dari 15.
        // Gunakan Lambda.
        Stream<Integer> filterResult = numbers.stream().filter(number -> number > 15);

        // [Java - Challenge]
        // Gunakan forEach() untuk mencetak setiap angka
        // yang lolos filter.
        // Format:
        // "Number: " + number
        filterResult.forEach(number -> System.out.println("Number: " + number));
    }
}