package Nested_Loops_Exercise_;

import java.util.Scanner;

public class Sum_Prime_Non_Prime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int primeSum=0;
        int nonprimeSum=0;

        while (!command.equals("stop")) {

            int currentNum = Integer.parseInt(command);
                if (currentNum<0){
                  System.out.printf("Number is negative.%n");
                  command= scanner.nextLine();
                     continue;
                }

            int dividersCount = 0;
            for (int i = 1; i <=currentNum; i++) {

                if (currentNum % i ==0) {

                    dividersCount++;

                }
                
            }

            if (dividersCount>2) {

                nonprimeSum +=currentNum;
            }else {
                primeSum+=currentNum;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d",nonprimeSum);
    }
}