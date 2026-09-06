package lambda.challenges;

import java.util.Arrays;
import java.util.List;

public class StreamMapChallenge {
    public static void main(String[] args) {

        // [Java - Challenge]
        // Buat List<String> berisi:
        // "selenium", "java", "automation"
        List<String> technologies = Arrays.asList("selenium", "java", "automation");
        // [Java - Challenge]
        // Ubah List menjadi Stream menggunakan stream().
        // Gunakan map() untuk mengubah setiap String
        // menjadi uppercase.
        // Gunakan Lambda.
        // [Java - Challenge]
        // Gunakan forEach() untuk mencetak setiap hasil.
        // Format:
        // "Technology: " + technology
        technologies.stream().map(technology -> technology.toUpperCase())
                .forEach(technology -> System.out.println("Technology: " + technology));
    }
}