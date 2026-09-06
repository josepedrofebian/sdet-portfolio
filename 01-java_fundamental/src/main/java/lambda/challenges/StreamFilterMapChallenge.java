package lambda.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterMapChallenge {
    public static void main(String[] args) {

        // [Java - Challenge]
        // Buat List<String> berisi:
        // "java", "selenium", "api", "automation", "sql"
        List<String> technologies = Arrays.asList(
                "java",
                "selenium",
                "api",
                "automation",
                "sql");

        // [Java - Challenge]
        // Ubah List menjadi Stream.
        // Gunakan filter() untuk mengambil String
        // yang panjangnya lebih dari 3 karakter.
        // Gunakan Lambda.
        Stream<String> filterResult = technologies.stream().filter(text -> text.length() > 3);
        // [Java - Challenge]
        // Gunakan map() untuk mengubah setiap String
        // yang lolos menjadi uppercase.
        // [Java - Challenge]
        // Gunakan forEach() untuk mencetak hasil.
        // Format:
        // "Technology: " + technology
        filterResult.map(text -> text.toUpperCase())
                .forEach(technology -> System.out.println("Technology: " + technology));
    }
}