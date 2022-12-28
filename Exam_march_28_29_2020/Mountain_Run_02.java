package Exam_march_28_29_2020;

import java.util.Scanner;

public class Mountain_Run_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double recordinSecs = Double.parseDouble(scanner.nextLine());
        double distanceinMeters = Double.parseDouble(scanner.nextLine());
        double distanceinSecsfor1Meter = Double.parseDouble(scanner.nextLine());


        double distanceinSec=distanceinMeters * distanceinSecsfor1Meter;
        double slowing=Math.floor(distanceinMeters/50);
               slowing=slowing*30;
        double totaltime=slowing + distanceinSec;

        double diff=Math.abs(totaltime-recordinSecs);


        if (recordinSecs<=totaltime){
            System.out.printf("No! He was %.2f seconds slower.",diff);

        }else {
            System.out.printf("Yes! The new record is %.2f seconds.",totaltime);
        }

    }
}
