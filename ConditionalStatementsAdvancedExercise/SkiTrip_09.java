package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String feedback = scanner.nextLine();

        int nights = days-1;

        double totalprice = 0.0;

        switch (typeRoom) {
            case "room for one person":
                totalprice = 18.0 * nights;
                break;
            case "apartment":
                totalprice = 25.0 * nights;
                if (days<10) {
                    totalprice = totalprice * 0.70;

                } else if (days>=10 && days<16) {
                    totalprice=totalprice * 0.65;

                } else if (days>15) {
                    totalprice = totalprice * 0.50;
                }
                break;
            case "president apartment":
                    totalprice = 35.0 * nights;
                    if (days<10) {
                        totalprice = totalprice * 0.90;

                    } else if (days>=10 && days<16) {
                        totalprice=totalprice * 0.85;

                    } else if (days>15) {
                        totalprice = totalprice * 0.80;
                    }
                    break;
        }
            if (feedback.equals("negative")) {
                totalprice = totalprice * 0.90;
            } else if (feedback.equals("positive")) {
                totalprice = totalprice * 1.25;
                
            }
        System.out.printf("%.2f", totalprice);
    }
}
