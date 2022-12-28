package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightsAmount = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.0 ;
        double apartmentPrice = 0.0 ;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50.0 * nightsAmount;
            apartmentPrice = 65.0 * nightsAmount;
            if (nightsAmount > 7 && nightsAmount <=14) {
                 studioPrice = studioPrice *0.95;
            } else if  (nightsAmount > 14) {
                apartmentPrice = apartmentPrice* 0.90;
                studioPrice = studioPrice *0.70;
            }
        }
        else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20 * nightsAmount;
            apartmentPrice = 68.70 * nightsAmount;
            if (nightsAmount > 14) {
                apartmentPrice = apartmentPrice* 0.90;
                studioPrice = studioPrice * 0.80;
            }

        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = 76.0 * nightsAmount;
            apartmentPrice = 77.0 * nightsAmount;
             if (nightsAmount>14) {
                apartmentPrice = apartmentPrice * 0.90;
             }
        }

        System.out.printf("Apartment: %.2f lv. %n",apartmentPrice);
        System.out.printf("Studio: %.2f lv.",studioPrice);
    }
}

