package Exam_march_28_29_2020;

import java.util.Scanner;

public class Suitcases_Load_05_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double capacity = Double.parseDouble(scanner.nextLine());
        String command= scanner.nextLine();
        int suitcaseCount=0;
        double totalWeight=0.0;

        while (!command.equals("End")) {

            double suitcaseWeigh = Double.parseDouble(command);

            suitcaseCount++;


            if (suitcaseCount%3==0){
                suitcaseWeigh=suitcaseWeigh * 1.1;
            }

            totalWeight=totalWeight + suitcaseWeigh;

            if (totalWeight>capacity){
                totalWeight=totalWeight;
                suitcaseCount--;
                break;
            }

            command= scanner.nextLine();
        }
        if (command.equals("End")) {
            System.out.printf("Congratulations! All suitcases are loaded!%n");
            System.out.printf("Statistic: %d suitcases loaded.",suitcaseCount);
        }else {
            System.out.printf("No more space!%n");
            System.out.printf("Statistic: %d suitcases loaded.",suitcaseCount);
        }
    }
}
