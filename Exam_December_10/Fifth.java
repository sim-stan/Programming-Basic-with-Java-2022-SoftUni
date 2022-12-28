package Exam_December_10;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());

        String command= scanner.nextLine();

        double total=0.0;
        double price=0.0;


        while (!command.equals("closed")){

            String kindofservice= command;
            String service= scanner.nextLine();


            if (kindofservice.equals("haircut")){

                if (service.equals("mens")){
                    price=15;
                    
                } else if (service.equals("ladies")) {
                    price=20;
                } else if (service.equals("kids")) {
                    price=10;
                }


            } else if (kindofservice.equals("color")) {
                if (service.equals("touch up")){

                    price=20;
                } else if (service.equals("full color")) {
                    price=30;
                }
            }
            total+=price;
            if (total>=goal){
                break;
            }

            command= scanner.nextLine();


        }
        double diff= Math.abs(total-goal);
        if (total>=goal) {

            System.out.printf("You have reached your target for the day!%n");
            System.out.printf("Earned money: %.0flv.",total);
        }else {
            System.out.printf("Target not reached! You need %.0flv. more.%n",diff);
            System.out.printf("Earned money: %.0flv.",total);
        }

    }
}
