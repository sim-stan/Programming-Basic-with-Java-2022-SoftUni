package Exam_march_28_29_2020;

import java.util.Scanner;

public class Cat_Walking_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minwalking = Integer.parseInt(scanner.nextLine());
        int amountofWalks = Integer.parseInt(scanner.nextLine());
        int caloriesaDAY = Integer.parseInt(scanner.nextLine());


        int totalmin=minwalking * amountofWalks;
        int totalburnCal=totalmin *5;
        int halfofcal=caloriesaDAY/2;

        if (totalburnCal>=halfofcal){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",totalburnCal);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",totalburnCal);
        }

    }
}
