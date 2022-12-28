package For_Loop_More_Exercise;

import java.util.Scanner;

public class Game_Of_Intervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());


           double less9 = 0.0;
           double less19 = 0.0;
           double less29 = 0.0;
           double less39 = 0.0;
           double less50 = 0.0;



           double count9 = 0.0;
           double count19 = 0.0;
           double count29 = 0.0;
           double count39 = 0.0;
           double count50 = 0.0;
           double countmorethen50 = 0.0;



           double totalcount =0.0;


           double finalresult=0.0;

        for (int i = 0; i < moves; i++) {

            int numbers = Integer.parseInt(scanner.nextLine());





            if (numbers<0) {
                finalresult = finalresult/2;
                countmorethen50 +=1;
            } else if (numbers<=9) {
            less9 = numbers * 0.20;
            finalresult += less9;
                count9 +=1;


            }else if ( numbers<=19) {
            less19 = numbers * 0.30;
            finalresult +=less19;
            count19 +=1;

            } else if (numbers<=29) {
                less29 = numbers * 0.40;
                finalresult +=less29;
                count29 +=1;

            } else if (numbers<=39) {
                less39 = 50;
                finalresult +=less39;
                count39 +=1;


            } else if (numbers<=50) {
                less50 = 100;
                finalresult +=less50;
                count50 +=1;


            } else {
                finalresult = finalresult/2;
                countmorethen50 +=1;

            }

        }
        totalcount = count9 + count19 + count29 + count39 +count50 + countmorethen50;

        double percent9 =(count9/totalcount)*100;
        double percent19 = (count19/totalcount) *100;
        double percent29 = (count29/totalcount) *100;
        double percent39 =(count39/totalcount) *100;
        double percent50 =(count50/totalcount) *100;
        double invalidNumber =(countmorethen50/totalcount) *100;

        System.out.printf("%.2f%n",finalresult);
        System.out.printf("From 0 to 9: %.2f%%%n",percent9);
        System.out.printf("From 10 to 19: %.2f%%%n",percent19);
        System.out.printf("From 20 to 29: %.2f%%%n",percent29);
        System.out.printf("From 30 to 39: %.2f%%%n",percent39);
        System.out.printf("From 40 to 50: %.2f%%%n",percent50);
        System.out.printf("Invalid numbers: %.2f%%",invalidNumber );

    }
}
