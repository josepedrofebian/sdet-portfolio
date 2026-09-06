package lambda.examples;

// [Java - Interface]
// Interface berfungsi sebagai kontrak yang harus diimplementasikan.
interface Greeting {

    // [Java - Abstract Method]
    // Class yang mengimplementasikan Greeting wajib menyediakan
    // implementasi untuk method sayHello().
    void sayHello();
}

public class AnonymousClassExample {

    public static void main(String[] args) {

        // [Java - Anonymous Class]
        // Membuat class anonim yang mengimplementasikan interface Greeting.
        // Class ini tidak memiliki nama.
        Greeting greeting = new Greeting() {

            // [Java - Method Implementation]
            // Memberikan implementasi untuk abstract method sayHello().
            @Override
            public void sayHello() {

                // [Java - Output]
                // Menampilkan pesan ke console.
                System.out.println("Hello from Anonymous Class!");
            }
        };

        // [Java - Method Call]
        // Memanggil method sayHello() dari object anonymous class.
        greeting.sayHello();
    }
}