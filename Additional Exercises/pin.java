package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class pin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <9; i+=2) {
            for (int j = 2; j <=7; j++) {
                for (int k = 1; k <9; k+=2) {


                    if (i%2==0 && k%2==0) {

                        if (j%j==0 && j%1==0 ) {
                            System.out.printf("%d%d%d ",i,j,k);
                        }
                    }
                }

            }

        }
    }
}
