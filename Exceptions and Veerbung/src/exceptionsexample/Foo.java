package exceptionsexample;

public class Foo {

    private static final Calculator calculator = new Calculator();

    public static void foo()  {

        calculator.sum(1, 2);

        calculator.sum(-1000, -111);

        try {
            calculator.sum(-1, -1);
        }
        catch (Exception ex) {
            System.out.println("Unerwartet");
            throw ex;
        }
        catch (ParameterException pem) {
            System.out.println("bla");
        }



        try {
            calculator.multiply(1, 2);

        }


    }

    private static void throwUnechecked() {
        throw new UncheckedException();
    }

//    private static void throwChecked() {
//        throw new CheckedException();
//    }


}
