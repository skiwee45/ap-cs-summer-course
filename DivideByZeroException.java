public class DivideByZeroException extends Exception{
    private int denominator;

    public DivideByZeroException(){}
    public DivideByZeroException(String s) {
        super(s);
    }
    public DivideByZeroException(int d) {
        denominator = d;
    }

    public int getDenominator() {
        return denominator;
    }
}
