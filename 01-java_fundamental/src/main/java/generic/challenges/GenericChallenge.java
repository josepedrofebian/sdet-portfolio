package generic.challenges;

public class GenericChallenge {
    public static void main(String[] args) {
        // Di main buat GenericBox<String>
        // Isi dengan "Jose"
        // Ambil dan print
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("Jose Pedro Febian");
        System.out.println(stringBox.getValue());

        // Buat GenericBox<Integer>
        // Isi dengan 100
        // Ambil dan print
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setValue(100);
        System.out.println(intBox.getValue());
    }
}

// Buat class GenericBox<T>
class GenericBox<T> {
    // Buat variable T value
    private T value;

    // Buat setter setValue(T value)
    public void setValue(T value) {
        this.value = value;
    }

    // Buat getter getValue()
    public T getValue() {
        return this.value;
    }

}
