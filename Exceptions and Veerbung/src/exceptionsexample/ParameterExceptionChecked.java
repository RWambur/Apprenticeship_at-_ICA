package exceptionsexample;

public class ParameterExceptionChecked extends Exception {
    private final int a;
    private final int b;


    public ParameterExceptionChecked(int a, int b) {
        super(String.format("Illegal values provided: %s %s", a, b));
        this.a = a;
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }
}
