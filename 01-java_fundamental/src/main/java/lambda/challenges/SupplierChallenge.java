package lambda.challenges;

import java.util.function.Supplier;

public class SupplierChallenge {
    public static void main(String[] args) {

        // [Java - Challenge]
        // Buat Supplier<Integer> yang menghasilkan angka 100.
        // Supplier tidak menerima input.
        // Gunakan Lambda.
        Supplier<Integer> getValue = () -> 100;
        // [Java - Challenge]
        // Gunakan .get() untuk mengambil nilai dari Supplier.
        // Simpan hasilnya ke variable result.
        // Cetak dengan format:
        // "Supplied value: " + result
        int result = getValue.get();
        System.out.println("Supplied value: " + result);
    }
}