package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Food_for_Pets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());
        int eatenDogfood =0;
        int eatenCatfood =0;
        double biscuits = 0;
        double totalEatenfood = 0;
        double dayseaten =0;
        double grBiscuits=0.0;

        for (int i = 1; i <= days; i++) {

            int dogfood =  Integer.parseInt(scanner.nextLine());
            int catfood =  Integer.parseInt(scanner.nextLine());


            eatenDogfood = eatenDogfood + dogfood;
            eatenCatfood = eatenCatfood + catfood;



            if (i % 3==0) {
                grBiscuits = (dogfood + catfood) *0.10;
                biscuits+=grBiscuits;
            }

        }
        totalEatenfood = eatenCatfood + eatenDogfood;
        double diff = totalEatenfood/totalFood *100;
        double catpercent = eatenCatfood/totalEatenfood * 100;
        double dogpercent = eatenDogfood/totalEatenfood* 100;

        System.out.printf("Total eaten biscuits: %dgr.%n",Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n",diff);
        System.out.printf("%.2f%% eaten from the dog.%n",dogpercent);
        System.out.printf("%.2f%% eaten from the cat.",catpercent);


    }
}
