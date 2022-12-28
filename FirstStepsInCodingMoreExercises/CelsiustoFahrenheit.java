package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {

        //F = C × (9/5) + 32


        Scanner scanner = new Scanner(System.in);

            double c = Double.parseDouble(scanner.nextLine());
             double  f = (c * 1.8) + 32;
             System.out.printf("%.2f", f);




    }
}
