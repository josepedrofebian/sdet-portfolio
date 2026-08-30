package filehandling.examples;

// Import Path untuk merepresentasikan lokasi file
import java.nio.file.Path;

// Import Paths untuk membuat object Path
import java.nio.file.Paths;

// Import Files untuk operasi file
import java.nio.file.Files;

// Import IOException untuk menangani error I/O
import java.io.IOException;

import java.util.List;

public class PathFilesExample {

    public static void main(String[] args) {

        try {
            // Menentukan lokasi file menggunakan Path
            Path path = Paths.get(
                    "01-java_fundamental/src/main/resources/testdata.txt");

            // Mengecek apakah file tersedia
            System.out.println("File exists: " + Files.exists(path));

            // Membaca seluruh isi file menjadi String
            String content = Files.readString(path);

            // Menampilkan isi file
            System.out.println(content);

            // Membaca seluruh isi file menjadi List<String>
            List<String> listContents = Files.readAllLines(path);

            // Menampilkan seluruh isi list file
            for (String listContent : listContents) {
                System.out.println(listContent);
            }

            // Menampilkan hanya username
            System.out.println(listContents.get(0));

        } catch (IOException e) {

            // Menangani error saat membaca file
            System.out.println("Gagal membaca file");
        }
    }
}