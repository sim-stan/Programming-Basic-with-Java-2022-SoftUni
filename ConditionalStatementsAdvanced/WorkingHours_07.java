package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String dayWeek = scanner.nextLine();

        switch (hour) {
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                if (dayWeek.equals("Monday") || dayWeek.equals("Tuesday") || dayWeek.equals("Wednesday") || dayWeek.equals("Thursday") || dayWeek.equals("Friday") || dayWeek.equals("Saturday")) {
                    System.out.println("open");
                    break;
                } default:
                System.out.println("closed");
        }
    }
}