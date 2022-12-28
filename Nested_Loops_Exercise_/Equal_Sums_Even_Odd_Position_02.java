package Nested_Loops_Exercise_;

import java.util.Scanner;

public class Equal_Sums_Even_Odd_Position_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        for (int i = num1; i <=num2; i++) {
            int currentNum =i;

            int evenSum=0;
            int oddSum=0;

            for (int j = 0; j <6; j++) {
                int lastDigit=currentNum%10;
                currentNum=currentNum/10;

                if (j % 2 ==0) {
                    evenSum= evenSum + lastDigit;
                }else {
                    oddSum=oddSum+lastDigit;
                }

            }
            if (evenSum == oddSum){
                System.out.print(i + " ");
            }

        }

    }
}
