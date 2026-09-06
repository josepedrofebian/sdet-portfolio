package lambda.challenges;
// ============================================================

// CHALLENGE: LAMBDA PARAMETERS
// ============================================================

// [1] Buat Functional Interface bernama NoParameterAction.
// [2] Buat abstract method:
// void execute();
@FunctionalInterface
interface NoParameterAction {
    void execute();
}

// [3] Buat Functional Interface bernama OneParameterAction.
// [4] Buat abstract method dengan satu parameter String:
// void execute(String message);
@FunctionalInterface
interface OneParameterAction {
    void execute(String message);
}

// [5] Buat Functional Interface bernama TwoParameterAction.
// [6] Buat abstract method dengan dua parameter int:
// int execute(int a, int b);
@FunctionalInterface
interface TwoParameterAction {
    int execute(int a, int b);
}
// ============================================================

// [7] Buat class LambdaParameterChallenge.
public class LambdaParameterChallenge {
    public static void main(String[] args) {
        // [8] Di dalam main(),
        // buat Lambda untuk NoParameterAction.
        // Lambda tidak boleh memiliki parameter.
        // Lambda harus menampilkan:
        // "No parameter"
        NoParameterAction noParameterAction = () -> {
            System.out.println("No Parameter");
        };
        noParameterAction.execute();
        // ============================================================

        // [9] Buat Lambda untuk OneParameterAction.
        // Gunakan satu parameter bernama message.
        // Lambda harus menampilkan:
        // "Message: " + message
        OneParameterAction oneParameterAction = message -> System.out.println("Message: " + message);
        // Panggil Lambda dengan:
        // "Hello Lambda"
        oneParameterAction.execute("Hello Lambda");
        // ============================================================

        // [10] Buat Lambda untuk TwoParameterAction.
        // Gunakan dua parameter:
        // a dan b
        // Lambda harus mengembalikan hasil:
        // a * b
        TwoParameterAction twoParameterAction = (a, b) -> {
            return a * b;
        };
        // Panggil Lambda dengan:
        // 7 dan 8
        // Simpan hasilnya ke variable result.

        int result = twoParameterAction.execute(7, 8);

        // ============================================================

        // [11] Tampilkan hasil TwoParameterAction.
        // Expected output:
        //
        // No parameter
        // Message: Hello Lambda
        // Calculation result: 56
        System.out.println("Calculation result: " + result);
        // ============================================================
        // CATATAN
        // ============================================================

        // WAJIB menggunakan Lambda.

        // JANGAN menggunakan Anonymous Class.

        // Target konsep:
        //
        // 0 parameter:
        // () -> ...
        //
        // 1 parameter:
        // message -> ...
        //
        // 2 parameter:
        // (a, b) -> ...

        // ============================================================
    }
}
