package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimefortheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());



        // calc exam time in minutes => (easier when working only with minutes)
        int timeForExam = (examHour * 60) + examMinutes;
        int timeForArrival = (arrivalHour * 60) + arrivalMinutes;


        int diff = Math.abs(timeForArrival - timeForExam);


        if(timeForArrival > timeForExam) {
            System.out.println("Late");



            if(diff >= 60) {


                int hour = diff / 60;
                int minutes = diff % 60;

                System.out.printf("%d:%02d hours after the start", hour, minutes);
            } else{
                System.out.printf("%d minutes after the start", diff);
            }
        }

        else if(timeForExam == timeForArrival || diff <= 30) {
            System.out.println("On Time");


            if(diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }
        }

        else {
            System.out.println("Early");

            if(diff >= 60) {

                int hour = diff / 60;
                int minutes = diff % 60;

                System.out.printf("%d:%02d hours before the start", hour, minutes);
            } else{
                System.out.printf("%d minutes before the start", diff);
            }
        }

    }
}
