package Exam_20_and_21_April_2019;

import java.util.Scanner;

public class Easter_Shop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsCount = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int soldEggs=0;

        while (!command.equals("Close")){

            String buyORfill=command;
            int amounteggs = Integer.parseInt(scanner.nextLine());

            if (buyORfill.equals("Buy")) {
                if (eggsCount<amounteggs){
                    break;
                }
                eggsCount-=amounteggs;
                soldEggs+=amounteggs;

            } else if (buyORfill.equals("Fill")) {
                eggsCount+=amounteggs;

            }


            command= scanner.nextLine();
        }
        if (command.equals("Close")) {
            System.out.printf("Store is closed!%n");
            System.out.printf("%d eggs sold.", soldEggs);
        } else {
            System.out.printf("Not enough eggs in store!%n");
            System.out.printf("You can buy only %d.",eggsCount);
        }

    }
}
