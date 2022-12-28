package EXAMMarchNINEandTEN;

import java.util.Scanner;

public class Skeleton_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesControl = Integer.parseInt(scanner.nextLine());
        int secondsControl = Integer.parseInt(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        int secondsFor100meters = Integer.parseInt(scanner.nextLine());

        double totalseconds=minutesControl*60 + secondsControl;
        double slowingCount=distance/120;
        double slowingtime= slowingCount*2.5;
        double time=(distance/100)*secondsFor100meters - slowingtime;

        double diff=Math.abs(time-totalseconds);
        if (time<=totalseconds){
            System.out.printf("Marin Bangiev won an Olympic quota!%n");
            System.out.printf("His time is %.3f.",time);
        }else {
            System.out.printf("No, Marin failed! He was %.3f second slower.",diff);
        }



    }
}
