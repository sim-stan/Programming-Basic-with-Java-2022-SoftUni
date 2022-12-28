package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class primeandNonprimenum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int primeSum=0;
        int nonprimeSum=0;

        while (!command.equals("stop")) {

            int currentnumber=Integer.parseInt(command);
                
            if (currentnumber<0) {
                System.out.printf("Number is negative.%n");
                command = scanner.nextLine();
                continue;
            }
            int dividerscount=0;
                for (int i = 1; i <=currentnumber ; i++) {

                    if (currentnumber % i==0) {
                        dividerscount++;
                    }


                }
                if (dividerscount>2) {

                    nonprimeSum+=currentnumber;
            }else {
                    primeSum+=currentnumber;
            }
            command= scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d",nonprimeSum);
    }

}

