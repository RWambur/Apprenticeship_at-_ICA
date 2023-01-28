package main;

import foo.Articles;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.function.Function;
import java.util.stream.Stream;

public class OptionSelection {
    public static void option01() {
        for (int i = 0; i < Articles.values().length ; i++) {
            Articles enumIndex = Articles.values()[i];
            System.out.println(enumIndex.getPrettyLine());
        }
        Again.again();
    }
    public static void option02() {
        for (int i = 0; i < Articles.values().length ; i++) {
            Articles enumIndex = Articles.values()[i];
            if (enumIndex.isSeasonal()) {
                System.out.println(enumIndex.getPrettyLine());
            }
        }
        Again.again();
    }
    public static void option03() {
        for (int i = 0; i < Articles.values().length ; i++) {
            Articles enumIndex = Articles.values()[i];
            if (!enumIndex.isSeasonal()) {
                System.out.println(enumIndex.getPrettyLine());
            }
        }
        Again.again();
    }
    public static void option04() {

        double total= 0;
        for (int i = 0; i < Articles.values().length ; i++) {
            Articles article = Articles.values()[i];
            //total = total + article.getPrice();
            total += article.getPrice();
            System.out.println(article.getPrettyLine());
        }

        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(2);
        format.setMinimumFractionDigits(2);

        int i = 0;
        Articles enumIndex = Articles.values()[i];
        System.out.print("Gesamtpreis: " + format.format(total) + "€");

        Again.again();



        /* var sum = Stream.of(Articles.values())
                .map(Articles::getPrice)
                .reduce(Double::sum)
                .get();

        for (Articles article: Articles.values()) {
            total += article.getPrice();
        }*/




    }

}

