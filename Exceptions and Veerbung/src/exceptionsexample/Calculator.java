package exceptionsexample;

public class Calculator {

    public int sum(int a, int b) {
     if(!paramsValid(a, b)) {
         throw new ParameterException(a, b);
     }

        return a + b;
    }

    public int multiply(int a, int b) throws ParameterExceptionChecked {
        if(!paramsValid(a, b)) {
            throw new ParameterExceptionChecked(a, b);
        }

        return a * b;
    }

    private boolean paramsValid(int a, int b) {
        return (a > 0 && b > 0);
    }


}
