package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * @param <E>
 */
public class Stack<E> implements Iterable<E> {
    private static Stack<?> instance = null;
    /**
     * The first element in the data list, is the last in the stack
     */
    private List<E> data = new ArrayList<>();

    // private Stack() {
    //     // Constructor and its private
    // }

    // public static Stack<?> getInstance() {
    //     // The singleton method
    //     if (instance == null) {
    //         instance = new Stack<Object>();
    //     }
    //     return instance;
    // }

    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        this.data.add(element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        return this.data.remove(this.data.size() - 1);
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return this.data.get(this.data.size() - 1);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        ArrayList<E> x = this.toArrayList();
        return x.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return this.data.size();
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        ArrayList<E> x = new ArrayList<E>(this.data);
        Collections.reverse(x); // reversing it in place
        return x;
    }

    public static Integer sumStack(Stack<? extends Integer> stack) {
        int sum = 0;
        for (Integer x : stack) {
            sum += x;
        }
        return sum;
    }

    public static void prettyPrint(Stack<?> stack) {
        for (Object x : stack) {
            System.out.println(x);
        }
        Iterator<?> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");

        for (String x : stack) {
            System.out.println(x);
        }
        prettyPrint(stack);
    }

}