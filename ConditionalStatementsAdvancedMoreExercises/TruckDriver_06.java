package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmpermonth = Double.parseDouble(scanner.nextLine());

        double salary = 0.0;

        if (season.equals("Spring") || season.equals("Autumn")) {

                if (kmpermonth < 5000) {
                    salary = kmpermonth * 0.75 * 4;
                } else if (kmpermonth > 5000 && kmpermonth <=10000) {
                    salary = kmpermonth * 0.95 * 4;
                } else if (kmpermonth > 10000 && kmpermonth <= 20000) {
                    salary = kmpermonth * 1.45 * 4;

                }


        } else if (season.equals("Summer")) {

                if (kmpermonth < 5000) {
                    salary = kmpermonth * 0.90 * 4;

                } else if (kmpermonth > 5000 && kmpermonth <=10000) {
                    salary = kmpermonth * 1.10 * 4;

                } else if (kmpermonth > 10000 && kmpermonth <= 20000) {
                    salary = kmpermonth * 1.45 * 4;

                }

        } else if (season.equals("Winter")) {

                if (kmpermonth < 5000) {
                    salary = kmpermonth * 1.05 * 4;
                } else if (kmpermonth > 5000 && kmpermonth <=10000) {
                    salary = kmpermonth * 1.25 * 4;
                } else if (kmpermonth > 10000 && kmpermonth <= 20000) {
                    salary = kmpermonth * 1.45 * 4;

                }


        }
        salary = salary * 0.90;
        System.out.printf("%.2f", salary);
    }
}
