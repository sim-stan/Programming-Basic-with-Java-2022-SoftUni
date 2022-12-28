package Exam_20_and_21_April_2019;

import java.util.Scanner;

public class Easter_Guests_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int guestCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());


        double kozunakCount=Math.ceil(1.0*guestCount/3);
        double eggsCount= guestCount*2;

        double kozunakPrice= kozunakCount*4;
        double eggsPrice= eggsCount*0.45;

        double total = kozunakPrice + eggsPrice;

        double diffPlus= (budget-total);
        double diffnegative= (total-budget);

        if (budget>=total){
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n",kozunakCount,eggsCount);
            System.out.printf("He has %.2f lv. left.",diffPlus);
        } else {

            System.out.printf("Lyubo doesn't have enough money.%n");
            System.out.printf("He needs %.2f lv. more.",diffnegative);
        }


    }
}
