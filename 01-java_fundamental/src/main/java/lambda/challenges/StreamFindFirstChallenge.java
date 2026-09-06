package lambda.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstChallenge {
    public static void main(String[] args) {

        // [Java - Challenge]
        // Buat List<Integer> berisi:
        // 10, 15, 20, 25, 30
        List<Integer> value = Arrays.asList(10, 15, 20, 25, 30);
        // [Java - Challenge]
        // Gunakan stream().
        // Gunakan filter() untuk mencari angka
        // yang lebih besar dari 18.
        // [Java - Challenge]
        // Gunakan findFirst().
        // Simpan hasilnya ke Optional<Integer> result.
        // [Java - Challenge]
        // Gunakan isPresent() untuk mengecek
        // apakah hasil ditemukan.
        Optional<Integer> result = value.stream().filter(val -> val > 18).findFirst();
        // [Java - Challenge]
        // Jika hasil ditemukan, gunakan get()
        // untuk mengambil value dan mencetak:
        // "First result: " + result.get()
        if (result.isPresent()) {
            System.out.println("First result: " + result.get());
        }
    }
}