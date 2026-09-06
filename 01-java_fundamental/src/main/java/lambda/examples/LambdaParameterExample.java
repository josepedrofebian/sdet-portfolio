package lambda.examples;

// [Java - Functional Interface]
// Functional Interface dengan abstract method tanpa parameter.
@FunctionalInterface
interface NoParameterAction {

    // [Java - Abstract Method]
    // Method tidak menerima parameter.
    void execute();
}

// [Java - Functional Interface]
// Functional Interface dengan abstract method satu parameter.
@FunctionalInterface
interface OneParameterAction {

    // [Java - Abstract Method]
    // Method menerima satu parameter String.
    void execute(String message);
}

// [Java - Functional Interface]
// Functional Interface dengan abstract method dua parameter.
@FunctionalInterface
interface TwoParameterAction {

    // [Java - Abstract Method]
    // Method menerima dua parameter integer.
    int execute(int a, int b);
}

public class LambdaParameterExample {

    public static void main(String[] args) {

        // [Java - Lambda tanpa parameter]
        // Karena abstract method tidak memiliki parameter,
        // Lambda menggunakan tanda kurung kosong.
        NoParameterAction noParameter = () -> {
            System.out.println("Lambda tanpa parameter");
        };

        // [Java - Method Call]
        // Menjalankan Lambda tanpa mengirim argument.
        noParameter.execute();

        // [Java - Lambda dengan satu parameter]
        // Karena hanya memiliki satu parameter,
        // tanda kurung pada parameter boleh dihilangkan.
        OneParameterAction oneParameter = message -> {
            System.out.println("Message: " + message);
        };

        // [Java - Method Call]
        // Mengirim satu argument ke Lambda.
        oneParameter.execute("Hello Lambda");

        // [Java - Lambda dengan dua parameter]
        // Karena memiliki dua parameter,
        // tanda kurung wajib digunakan.
        TwoParameterAction twoParameter = (a, b) -> {
            return a + b;
        };

        // [Java - Method Call]
        // Mengirim dua argument ke Lambda.
        int result = twoParameter.execute(10, 20);

        // [Java - Output]
        // Menampilkan hasil dari Lambda dua parameter.
        System.out.println("Calculation result: " + result);
    }
}