package lambda.examples;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample {
    public static void main(String[] args) {

        // [Java - Stream]
        // Buat List berisi beberapa nama.
        List<String> names = Arrays.asList("Jose", "Budi", "Andi");

        // [Java - Stream]
        // stream() mengubah List menjadi Stream.
        // map() digunakan untuk mengubah setiap element menjadi bentuk baru.
        // Lambda name -> name.toUpperCase() berperan sebagai Function.
        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println("Name: " + name));
    }
}