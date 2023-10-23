package calculator.Expression;

/**
 * Composite
 */
public class DivisionExpression implements Expression {
    private Expression e1;
    private Expression e2;

    public DivisionExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double compute() {
        return this.e1.compute() / this.e2.compute();
    }
}
