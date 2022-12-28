package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Banknoti_i_moneti_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int oneLEV = Integer.parseInt(scanner.nextLine());
        int twoLEVA = Integer.parseInt(scanner.nextLine());
        int fiveLEva = Integer.parseInt(scanner.nextLine());
        int amount = Integer.parseInt(scanner.nextLine());

        int monetiotEDIN=0;
        int monetiotDVA=0;
        int monetiotPET=0;

        int result =0;

        for (int i = 0; i <=oneLEV; i++) {
            for (int j = 0; j <=twoLEVA; j++) {
                for (int k = 0; k <=fiveLEva; k++) {
                    result=i*1 +j*2+k*5;


                    if (amount==result) {


                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",i,j,k,amount);
                    }

                }
            }
        }
    }
}
