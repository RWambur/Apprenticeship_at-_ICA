package test;

import java.util.Scanner;

public class Again {

    public static void again() {
        System.out.println("Nochmal?");

        Scanner pSc = new Scanner(System.in);
        String ans = pSc.nextLine().toUpperCase();

        switch (ans) {
            case "JA":
                Game.game();
                break;
            case "NEIN":
                System.out.println("-----END-----");
                break;
            default:
                System.out.println("Entweder Ja oder Nein.");
                again();
                break;

        }
    }
}
