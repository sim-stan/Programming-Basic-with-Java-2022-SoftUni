package For_Loop_More_Exercise;

import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int cargoCounts = Integer.parseInt(scanner.nextLine());

        double midprice = 0;

        double totalcountweight = 0;
        double countcargovan = 0;
        double countcargotruck = 0;
        double countcargotrain = 0;


        for (int i = 0; i < cargoCounts; i++) {

            int weightSinglecargo = Integer.parseInt(scanner.nextLine());



             totalcountweight += weightSinglecargo;




            if (weightSinglecargo <=3) {
                    countcargovan +=weightSinglecargo;



            } else if (weightSinglecargo <=11) {
                countcargotruck +=weightSinglecargo;

            }else {
                countcargotrain +=weightSinglecargo;

            }
        }
        midprice = (countcargovan *200 + countcargotruck*175 + countcargotrain*120)/totalcountweight;
        double vanpercent = countcargovan/totalcountweight *100;
        double truckpercent = countcargotruck/totalcountweight *100;
        double trainpercent = countcargotrain/totalcountweight *100;

        System.out.printf("%.2f%n%.2f%%%n%.2f%%%n%.2f%%",midprice,vanpercent,truckpercent,trainpercent);
    }
}
