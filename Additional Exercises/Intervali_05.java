package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Intervali_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double points=0;
        int zero =0;
        int ten =0;
        int twenty9 =0;
        int thurthy =0;
        int fourthy =0;
        int invalidnumber =0;

        for (int i = 0; i <number; i++) {

            int chekedNumbers = Integer.parseInt(scanner.nextLine());

            if (chekedNumbers>=0 && chekedNumbers<=9) {
                    zero ++;
                points += chekedNumbers * 0.2;
            } else if (chekedNumbers>=10 && chekedNumbers<=19) {
                    ten ++;
                points += chekedNumbers * 0.3;
            } else if (chekedNumbers>=20 && chekedNumbers<=29) {
                    twenty9 ++;
                points += chekedNumbers * 0.4;
            } else if (chekedNumbers>=30 && chekedNumbers<=39) {
                    thurthy ++;
                points +=50;
            } else if (chekedNumbers>=40 && chekedNumbers<=50) {
                        fourthy ++;
                points += 100;
            } else {
                invalidnumber++;
                points=points/2;
            }

        }

        double percent1= 1.0*zero/number *100.00;
        double percent2= 1.0*ten/number *100.00;
        double percent3= 1.0*twenty9/number *100.00;
        double percent4= 1.0*thurthy/number *100.00;
        double percent5= 1.0*fourthy/number *100.00;
        double percent6= 1.0*invalidnumber/number *100.00;


        System.out.printf("%.2f%n",points);
        System.out.printf("From 0 to 9: %.2f%%%n",percent1);
        System.out.printf("From 10 to 19: %.2f%%%n",percent2);
        System.out.printf("From 20 to 29: %.2f%%%n",percent3);
        System.out.printf("From 30 to 39: %.2f%%%n",percent4);
        System.out.printf("From 40 to 50: %.2f%%%n",percent5);
        System.out.printf("Invalid numbers: %.2f%%%n",percent6);


    }
}
