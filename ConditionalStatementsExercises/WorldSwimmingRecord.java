package ConditionalStatementsExercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distanceMeter = Double.parseDouble(scanner.nextLine());
        double timesecondsMeter = Double.parseDouble(scanner.nextLine());

        double totalTimeSeconds = distanceMeter * timesecondsMeter;
        double slowingDown =Math.floor( distanceMeter / 15);

        double timeslowingdown = slowingDown * 12.5;
        double finalTime = totalTimeSeconds + timeslowingdown ;


        if (finalTime < record) {

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);

        } else {
            double diff = finalTime - record;

            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);

        }

    }




}
