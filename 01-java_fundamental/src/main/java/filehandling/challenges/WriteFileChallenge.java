package filehandling.challenges;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileChallenge {
    public static void main(String[] args) {
        try {
            // Buat FileWriter untuk "testdata.txt"
            FileWriter writer = new FileWriter("01-java_fundamental/src/main/resources/testdata.txt");
            // Tulis:
            // username=Jose
            // password=Rahasia
            // role=MAKER
            writer.write("username=Jose Pedro Febian\n");
            writer.write("password=Rahasia\n");
            writer.write("role=Maker");
            // Tutup FileWriter
            writer.close();
            // Tampilkan:
            // "Test data berhasil ditulis"
            System.out.println("Test data berhasil ditulis");
        } catch (IOException exception) {
            System.out.println("Gagal menulis test");
        }
    }
}
