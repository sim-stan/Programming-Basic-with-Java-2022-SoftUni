package Exam_practice;

import java.util.Scanner;

public class Godzilla_vs_Kong_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double totalTime =Double.parseDouble(scanner.nextLine());
        double sceniAmount = Double.parseDouble(scanner.nextLine());
        double timefor1scena =Double.parseDouble(scanner.nextLine());

        double totaltimesceni=sceniAmount * timefor1scena;
        double prepforshooting= totalTime*0.15;

        double shootingTotaltime= totaltimesceni + prepforshooting;
        double diff= Math.abs(totalTime-shootingTotaltime);

        if (totalTime>shootingTotaltime){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",diff);
        }else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",diff);
        }


    }
}
