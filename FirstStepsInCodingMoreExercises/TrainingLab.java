package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        int broimestaw = (int) (((w*100)-100) / 70);
        int broimestah = (int) (h*100) / 120;
        int workingspaces = (int) (broimestaw * broimestah) - 3;

        System.out.println(workingspaces);


    }
}
