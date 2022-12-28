package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double frontside = ((x * x)*2) - (1.2 * 2);
        double leftside = ((x * y)*2) - ((1.5 * 1.5)*2);
        double greentotalsqm = frontside + leftside;
        double totalgreen = greentotalsqm / 3.4;

        double rooflongside = (x * y) *2 ;
        double roofangle =2 *  (x * h/2);
        double totalroofsqm = rooflongside + roofangle;
        double totalred = totalroofsqm / 4.3;

        System.out.printf("%.02f", totalgreen);
        System.out.println();

        System.out.printf("%.02f", totalred);




    }
}
