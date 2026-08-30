package filehandling.examples;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

    public static void main(String[] args) {

        try {
            // Menunjuk ke testdata.txt di folder resources
            FileWriter writer = new FileWriter(
                    "01-java_fundamental/src/main/resources/testdata.txt");

            // Menulis data ke file
            writer.write("username=Jose\n");
            writer.write("password=Rahasia\n");
            writer.write("role=MAKER\n");

            // Menutup FileWriter
            writer.close();

            System.out.println("Test data berhasil ditulis");

        } catch (IOException e) {
            System.out.println("Gagal menulis test data");
        }
    }
}