package generic.examples;

public class GenericExample {

    public static void main(String[] args) {

        // GenericBox ini menggunakan String sebagai tipe data
        GenericBox<String> username = new GenericBox<>();
        username.setValue("Jose");

        // Mengambil value sebagai String
        String name = username.getValue();

        System.out.println("Username: " + name);

        // GenericBox ini menggunakan Integer sebagai tipe data
        GenericBox<Integer> score = new GenericBox<>();
        score.setValue(95);

        // Mengambil value sebagai Integer
        Integer testScore = score.getValue();

        System.out.println("Score: " + testScore);
    }
}

// T adalah placeholder untuk tipe data
class GenericBox<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}