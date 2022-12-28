package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class sumofTWOnum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int finish = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int combinationCount=0;
        int currentNUm1=0;
        int currentNUm2=0;
        int result=0;
        for (int i = 1; i <= start ; i++) {
            for (int j=1; j <=finish ; j++) {
                combinationCount++;
                     result = i+j;
                     currentNUm1=i;
                     currentNUm2=j;
                if (result==magicNum) {

                    break;
                }

            }

        }if (result==magicNum) {
            System.out.printf("Combination N:%d (%d + %d = %d)",combinationCount,currentNUm1,currentNUm2,magicNum);
        }else {
            System.out.printf("%d combinations - neither equals %d",combinationCount,magicNum);
        }
    }
}
