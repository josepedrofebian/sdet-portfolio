package lambda.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectChallenge {
    public static void main(String[] args) {

        // [Java - Challenge]
        // Buat List<String> berisi:
        // "java", "selenium", "api", "automation", "sql"
        List<String> technologies = Arrays.asList("java", "selenium", "api", "automation", "sql");
        // [Java - Challenge]
        // Ubah List menjadi Stream.
        // Gunakan filter() untuk mengambil String
        // yang panjangnya lebih dari 3 karakter.
        // [Java - Challenge]
        // Gunakan map() untuk mengubah setiap String
        // yang lolos menjadi uppercase.
        // [Java - Challenge]
        // Gunakan collect(Collectors.toList())
        // untuk mengumpulkan hasil Stream menjadi List<String>.
        // Simpan hasilnya ke variable result.
        // [Java - Challenge]
        // Cetak result dengan format:
        // "Result: " + result
        List<String> result = technologies.stream().filter(technology -> technology.length() > 3)
                .map(technology -> technology.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Result: " + result);
    }
}