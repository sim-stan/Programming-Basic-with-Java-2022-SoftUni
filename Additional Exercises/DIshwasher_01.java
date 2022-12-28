package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class DIshwasher_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottleDetergent = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int totalML= 750 * bottleDetergent;

        int cleanPlates =0;

        int cleanPans =0;

        int loadsCount=0;

        int totalused= 0;

        while (!command.equals("End")) {

            int dishesCount= Integer.parseInt(command);

            int usedFORplates = 0;
            int usedFORpans = 0;

            loadsCount++;

            if (loadsCount==3 || loadsCount==6) {
                usedFORpans = dishesCount * 15;
                cleanPans+=dishesCount;
            } else {
                cleanPlates +=dishesCount;
                usedFORplates = dishesCount * 5;
            }

            totalused += usedFORplates + usedFORpans;

            if (totalused>totalML) {
                break;
            }


            command = scanner.nextLine();
        }
        int diff=Math.abs(totalused-totalML);
        if (totalused>totalML){
            System.out.printf("Not enough detergent, %d ml. more necessary!",diff);
        } else {
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%d dishes and %d pots were washed.%n",cleanPlates,cleanPans);
            System.out.printf("Leftover detergent %d ml.",diff);
        }
    }
}
