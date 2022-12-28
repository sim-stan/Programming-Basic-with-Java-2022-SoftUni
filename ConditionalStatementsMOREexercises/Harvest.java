package ConditionalStatementsMOREexercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int areaX = Integer.parseInt(scanner.nextLine());
        double grapePersqm = Double.parseDouble(scanner.nextLine());
        int needItlitersWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());


        double totalkilosgrape = (areaX * grapePersqm) ;
        double grapeforwine = Math.floor(totalkilosgrape * 0.40 );
        double totalwine =( grapeforwine / 2.50);

        double diffwine =(totalwine - needItlitersWine);
        double litterPerworker =Math.abs(Math.ceil( diffwine/ workers));


        if (totalwine< needItlitersWine) {


            diffwine =Math.abs(Math.ceil(diffwine));


            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", diffwine);

        } else   {

            diffwine = Math.ceil(diffwine);

            System.out.printf("Good harvest this year! Total wine: %.0f liters.", totalwine);
            System.out.println("");
            System.out.printf("%.0f liters left -> %.0f liters per person.",diffwine,litterPerworker);

        }




        }



}

