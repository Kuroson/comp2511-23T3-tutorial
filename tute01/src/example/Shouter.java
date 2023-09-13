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
    private String message; // class variable

    public Shouter(String message) {
        // Constructor
        System.out.println("It ran here");
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String msg) {
        // this.message = message
        message = msg;
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("Hello World");
        // System.out.println(s.getMessage());
        // s.setMessage("Hello COMP2511");
        // System.out.println(s.getMessage());
    }
}
