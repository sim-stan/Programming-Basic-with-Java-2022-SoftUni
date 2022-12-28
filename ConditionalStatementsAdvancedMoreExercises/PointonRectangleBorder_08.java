package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class PointonRectangleBorder_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

         var onLeftSide = (x == x1) && (y >= y1) && (y<=y2);
        var onRightside = (x ==x2)  && (y >=y1) && ( y<=y2);
        var onUpside = (y==y1) && (x >=x1) && (x<=x2);
        var onDownSide = (y==y2) && (x>=x1) && (x<=x2);

        if (onLeftSide || onRightside || onUpside || onDownSide) {
            System.out.println("Border");
        } else if ( x >= x1 && x <=x2 && y >=y1 && y<= y2) {
            System.out.println("Inside / Outside");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
