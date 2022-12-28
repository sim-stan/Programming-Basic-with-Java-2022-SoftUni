package ConditionalStatementsExercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int movieDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());


        double lunchTime = breakDuration /8.0;

        double relaxTime = breakDuration/4.0;

        double lefttime = breakDuration- lunchTime - relaxTime;

        double diff = Math.abs(movieDuration - lefttime);
        double diffformatted = Math.ceil(diff);
        if (lefttime >= movieDuration) {


            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",name ,diffformatted );
        }
        else {
            double moretime = Math.ceil((breakDuration) - movieDuration+lunchTime + relaxTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, diffformatted);



    }
}}
