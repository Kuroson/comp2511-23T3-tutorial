package calculator.Expression;

/**
 * Leaf node
 */
public class Number implements Expression {
    private double num;

    public Number(double num) {
        this.num = num;
    }

    /**
     * @preconditions - none
     * @postconditions - returns number
     */
    public double compute() {
        return this.num;
    }
}
