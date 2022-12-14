public class ComplexCalculator extends AbstractCalculator{

    public ComplexCalculator(CalculateOperation add, CalculateOperation substract, CalculateOperation multiply, CalculateOperation divide) {
        super(add, substract, multiply, divide);
    }


    @Override
    public Number add(Number a, Number b) {
        return this.add.calc(a,b);
    }

    @Override
    public Number substract(Number a, Number b) {
        return null;
    }

    @Override
    public Number multiply(Number a, Number b) {
        return this.multiply.calc(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return this.divide.calc(a,b);
    }
}
