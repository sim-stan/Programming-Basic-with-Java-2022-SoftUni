package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class CircleAreaandPerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();

        double calculatedarea  = 3.14 * (r * r);
        double calculatedparameter = (2 * Math.PI) * r;


        System.out.printf("%.02f %n", calculatedarea);
        System.out.printf("%.02f ", calculatedparameter);


    }
}
