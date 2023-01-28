package test;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void game() {

        System.out.println("---Schere, Stein oder Papier---");
        System.out.print("Auswahl: ");

        // Spieler
        Scanner pSc = new Scanner(System.in);
        String playerSelection = pSc.nextLine().toUpperCase();

        boolean existing = false;
        /*for (int i = 0; i < SelectionOptions.values().length; i++) {

            SelectionOptions currentValue = SelectionOptions.values()[i];

            existing = currentValue.name().equals(playerSelection);

            if(existing) {
                break;
            }
        }*/

        int i = 0;
        do {
            SelectionOptions currentValue = SelectionOptions.values()[i];

            existing = currentValue.name().equals(playerSelection);

            i++;
            if(existing) {
                break;
            }

        } while (i < SelectionOptions.values().length);

        if(!existing) {
            System.out.println("Ihre Auswahl ist ungültig.");
            Again.again();
        }

        SelectionOptions playerSelected = SelectionOptions.valueOf(playerSelection);

        // Conputer
        // math.random * selectionoptions.values.length 4
        // 0.0000000 - 3.99999999999
        // (int) -> 0 - 3

        int computerSelectionIndex = (int) (Math.random() * SelectionOptions.values().length - 1);

        SelectionOptions computerSelected =  SelectionOptions.values()[computerSelectionIndex];

        System.out.println("Computer: " + computerSelected.getPrettyPrint());

        //Ausschlussverfahren
        // System.out.println(computerSelected.getWeight());
        // System.out.println(SelectionOptions.valueOf(playerSelection).getWeight());

        if (computerSelected.getWeight() == playerSelected.getWeight())  {
            System.out.println("Unentschieden; Keiner Gewinnt");
            Again.again();
        } else if (computerSelected.getWeight() > playerSelected.getWeight())  {
            System.out.println(computerSelected.getPrettyPrint() + " schlägt " + playerSelected.getPrettyPrint() + ". Du hast verloren.");
            Again.again();
        } else {
            System.out.println(playerSelected.getPrettyPrint() + " schlägt " + computerSelected.getPrettyPrint() + ". Du hast gewonnen.");
            Again.again();
        }
    }
}
