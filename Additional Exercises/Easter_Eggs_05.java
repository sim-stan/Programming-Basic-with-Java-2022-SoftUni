package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Easter_Eggs_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsCount = Integer.parseInt(scanner.nextLine());
        int redeggs = 0;
        int orangeeggs = 0;
        int blueeggs = 0;
        int greeneggs = 0;


        for (int i = 0; i < eggsCount; i++) {
            String eggColor = scanner.nextLine();


            switch (eggColor) {

                case "red":
                    redeggs += 1;

                    break;

                case "orange":
                    orangeeggs += 1;

                    break;

                case "blue":
                    blueeggs += 1;

                    break;


                case "green":
                    greeneggs += 1;

                    break;
            }

        }
        String colormaxeggs = "red";
        int maxeggs = redeggs;

        if (orangeeggs >maxeggs) {
            colormaxeggs = "orange";
            maxeggs = orangeeggs;
        }
        if (blueeggs > maxeggs) {
            colormaxeggs = "blue";
            maxeggs = blueeggs;
        }
        if (greeneggs > maxeggs){
            colormaxeggs = "greeen";
            maxeggs = greeneggs;


        }
        System.out.printf("Red eggs: %d%n", redeggs);
        System.out.printf("Orange eggs: %d%n", orangeeggs);
        System.out.printf("Blue eggs: %d%n", blueeggs);
        System.out.printf("Green eggs: %d%n", greeneggs);
        System.out.printf("Max eggs: %d -> %s", maxeggs, colormaxeggs);
    }
}