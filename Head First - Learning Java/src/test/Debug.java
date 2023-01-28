package test;

import java.util.Random;

public class Debug {
    public static void debug() {
        int i = 0;
        while(i < 10) {
            int cRdm = 0;

            Random cInt = new Random();
            cRdm = cInt.nextInt(3);
            System.out.println(cRdm);

            i++;
        }
    }
}
