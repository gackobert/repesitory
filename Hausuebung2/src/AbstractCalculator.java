public abstract class AbstractCalculator {

    protected CalculateOperation add;
    protected CalculateOperation substract;
    protected CalculateOperation multiply;
    protected CalculateOperation divide;

    public AbstractCalculator(CalculateOperation add, CalculateOperation substract, CalculateOperation multiply, CalculateOperation divide) {
        this.add = add;
        this.substract = substract;
        this.multiply = multiply;
        this.divide = divide;
    }
}
