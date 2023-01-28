package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n-----Auto Zusammenstellen-----\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Dein Auto Name: ");
        String givenName = sc.nextLine();
        System.out.print("Hersteller: ");
        String manufacturer = sc.nextLine();
        System.out.print("Automodell: ");
        String model = sc.nextLine();

        System.out.println("--Anzahl an Teilen--");
        System.out.print("Teile: ");
        int partCount = sc.nextInt();
        sc.nextLine();

        List<CarPart> partList = new ArrayList<>();

        for (int i = 0; i < partCount; i++) {
            CarPart newCarPart = new CarPart();
            System.out.print("Autoteil: ");
            newCarPart.setName(sc.nextLine());

            System.out.print("Hersteller: ");
            newCarPart.setManufacturer(sc.nextLine());
            partList.add(newCarPart);
        }

        System.out.println("Wie teuer wird das Auto sein?");
        int price = sc.nextInt();

        Car createdCar = Car.Create(givenName, manufacturer, model, price, partList); //

        printCarDetails(createdCar);
    }

    private static void printCarDetails(Car car) {
        System.out.println("\n-----Dein Auto-----\n" +
                "Auto: " + car.getGivenName() +
                "\nHersteller: " + car.getManufacturer() +
                "\nAutomodell: " + car.getModel() +
                "\n---Eingebaut Teile---");
        // Die Schleife schaut sich das Objekt an und due entsroechenden Attribute im vergleich zu dem gegeben werte in einer Liste mit den gleichnamigen "sachen"

        // O

        List<String> stringList = new ArrayList<>();

        // Für jedes Element vom Typ X, nachfolgend benannt als 'item', aus meiner Liste List<X> soll folgendes ausgeführt werden: {}
        for (String item: stringList) {

        }

        for (int i = 0; i < stringList.size(); i++) {
            String item = stringList.get(i);
        }


        for (CarPart part : car.getPartList()) {
            System.out.println("Teil: " + part.getName() +
                    " | Hersteller: " + part.getManufacturer());
        }

        /*for (int i = 0; i < car.getPartList().size(); i++) {
            CarPart partList = car.getPartList().get(i);
            System.out.println("Teil: " + partList.getName() +
                    " | Hersteller: " + partList.getManufacturer());
        }*/

        System.out.println("---Preis: " + car.getPrice() + " EURO---");

    }
}
