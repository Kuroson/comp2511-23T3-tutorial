package example;

/**
 * Write a program that stores a message and has methods for getting the message,
 * updating the message and printing it out in all caps. Write a `main()` method
 * for testing this class.
 *
 * Create a:
 * - Getter
 * - Setter
 * - Constructor
 * - printMe
 * - shout
 * - toString
 */
public class Shouter {
    private String message;

    public Shouter(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return this.message;
    }

    public static void main(String[] args) {
        // TODO
        Shouter s = new Shouter("Hello123123");
        System.out.println(s.getMessage());
    }
}
