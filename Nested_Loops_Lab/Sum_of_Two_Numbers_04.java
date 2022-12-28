package Nested_Loops_Lab;

import java.util.Scanner;

public class Sum_of_Two_Numbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int combinationCount=0;

        int result = num1 + num2;

        boolean combination=false;

        for (int i = num1; i <=num2; i++) {

            for (int j = num1; j <= num2; j++) {
                combinationCount++;
                result = i + j;


                if (result == magicNum) {
                    combination = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)",combinationCount,i,j,result);
                    break;
                }
            }
            if (combination){
                break;
            }

        }

        if (!combination){
            System.out.printf("%d combinations - neither equals %d",combinationCount,magicNum);
        }


    }
}
