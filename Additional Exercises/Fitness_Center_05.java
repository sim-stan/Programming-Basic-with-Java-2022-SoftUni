package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Fitness_Center_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPeopel = Integer.parseInt(scanner.nextLine());

        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;


        for (int i = 1; i <= totalPeopel; i++) {

            String activity = scanner.nextLine();


            switch (activity) {


                case "Back":


                    back ++;
                    break;

                case "Chest":

                    chest ++;
                    break;

                case "Legs":

                    legs ++;
                    break;

                case "Abs":

                    abs ++;
                    break;


                case "Protein shake":

                    proteinShake ++;
                    break;

                case "Protein bar":

                    proteinBar ++;
                    break;

            }


        }

        double percentWorkout = (back + chest + legs + abs * 1.00)/totalPeopel * 100.00;
        double percentProtein = (1.00* proteinShake + proteinBar)/totalPeopel * 100.00;

        System.out.printf("%d - back%n",back);
        System.out.printf("%d - chest%n",chest);
        System.out.printf("%d - legs%n",legs);
        System.out.printf("%d - abs%n",abs);
        System.out.printf("%d - protein shake%n",proteinShake);
        System.out.printf("%d - protein bar%n",proteinBar);
        System.out.printf("%.2f%% - work out%n",percentWorkout);
        System.out.printf("%.2f%% - protein",percentProtein);




    }
}
