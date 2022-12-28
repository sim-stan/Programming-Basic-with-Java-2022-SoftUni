package Exam_march_28_29_2020;

import java.util.Scanner;

public class Care_of_Puppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int amountofFood = Integer.parseInt(scanner.nextLine());

        int totalEaten=0;
        String command = scanner.nextLine();
        int totalfoodGR=amountofFood*1000;

        while (!command.equals("Adopted")){

            int eachAmoun = Integer.parseInt(command);

            totalEaten +=eachAmoun;

            command= scanner.nextLine();
        }
        int diff=Math.abs(totalEaten-totalfoodGR);

        if (totalfoodGR<totalEaten){
            System.out.printf("Food is not enough. You need %d grams more.",diff);
        }else {
            System.out.printf("Food is enough! Leftovers: %d grams.",diff);
        }
    }
}
