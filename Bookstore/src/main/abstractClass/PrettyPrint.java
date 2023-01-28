package main.abstractClass;

public class PrettyPrint {
    public void prettyPrint(Object[] listToPrint, int counter, String header, String optionText) {
        if (listToPrint.length != 0) {
            System.out.println(header);
            for (Object obj : listToPrint) {
                counter++;
                System.out.printf("%s. %s %s%s", counter, obj, System.lineSeparator(), optionText);
            }
        }
    }
}
