package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class luckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=9 ; j++) {
                for (int k = 1; k <=9 ; k++) {
                    for (int l = 1; l <=9 ; l++) {

                        int sumfirsttwo=i + j;
                        int sumsecondtwo=k + l;

                        if (sumfirsttwo==sumsecondtwo) {

                            if (num % sumfirsttwo ==0){
                                System.out.printf("%d%d%d%d ",i,j,k,l);
                            }
                        }

                    }

                }

            }

        }

    }
}
