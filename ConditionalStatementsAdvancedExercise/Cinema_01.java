package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int redove = Integer.parseInt(scanner.nextLine());
        int koloni = Integer.parseInt(scanner.nextLine());


        int totalseats = redove * koloni;


        double totalprice = 0.0;

        switch (movie) {
            case "Premiere":
            totalprice = totalseats *12.0;
            break;
            case "Normal":
            totalprice = totalseats * 7.5;
            break;
            case "Discount" :
            totalprice = totalseats * 5.0;
            break;
        }
        System.out.printf("%.2f leva", totalprice);
    }


}



