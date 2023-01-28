import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Uhr {
    public static void uhr() {

        for (int firstDigits = 0; firstDigits < 12 ; firstDigits++) {
                for (int secondDigits = 0; secondDigits < 60 ; secondDigits++) {
                    System.out.println(String.format("%02d:%02d", firstDigits, secondDigits ));
                   /*
                    if (firstDigits < 10) {
                        System.out.println("0" + firstDigits + ":" + secondDigits);
                    } else if (secondDigits < 10) {
                        System.out.println(firstDigits + ":0" + secondDigits);
                    } else if (firstDigits < 10 && secondDigits < 10){
                        System.out.println("0" + firstDigits + ":0" + secondDigits);
                    } else {
                        System.out.println(firstDigits + ":" + secondDigits);
                    }*/
                }
        }

        //int[] intArrayFirstDigits = IntStream.of(firstDigits).toArray();
        //int[] intArraySecondDigits = IntStream.of(secondDigits).toArray();

    }
}
