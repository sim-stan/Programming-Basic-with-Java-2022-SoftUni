package ConditionalStatementsLAB;

import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String shape = scanner.nextLine();

        double area = 0;


        if (shape.equals("square")) {
            double sq = Double.parseDouble(scanner.nextLine());
            area = sq * sq;

        } else if (shape.equals("rectangle")) {
            double area1 = Double.parseDouble(scanner.nextLine());
            double area2 = Double.parseDouble(scanner.nextLine());
            area = area1 * area2;

        } else if (shape.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * r * r;

        } else if (shape.equals("triangle")) {

            double area1 = Double.parseDouble(scanner.nextLine());
            double area2 = Double.parseDouble(scanner.nextLine());
            area = area1 * area2 / 2;


        }
        System.out.printf("%.3f", area);
    }
}


