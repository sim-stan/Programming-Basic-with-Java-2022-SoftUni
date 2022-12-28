package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Easter_Decoration_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberofClients = Integer.parseInt(scanner.nextLine());

        double total=0.0;

        for (int i = 1; i <=numberofClients ; i++) {

            String command = scanner.nextLine();

            int productCurrentclient=0;
            double totalSum = 0;

            while (!command.equals("Finish")) {

                productCurrentclient++;

                switch (command) {

                    case "basket":

                    totalSum +=1.5;
                        break;

                    case "wreath":
                    totalSum +=3.8;
                        break;

                    case "chocolate bunny":
                    totalSum +=7;
                        break;
                }
                    command = scanner.nextLine();
             }

            if (productCurrentclient %2==0) {

                totalSum = totalSum * 0.8;
                System.out.printf("You purchased %d items for %.2f leva.%n",productCurrentclient,totalSum);
            }else {
                System.out.printf("You purchased %d items for %.2f leva.%n",productCurrentclient,totalSum);
            }
            total=total+totalSum;

        }
        double avg=total/numberofClients;
        System.out.printf("Average bill per client is: %.2f leva.",avg);

    }
}
