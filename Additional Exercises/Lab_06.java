package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Lab_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int maxnum = Integer.MIN_VALUE;

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            int number = Integer.parseInt(command);

            if (number>=maxnum) {

                maxnum = number;
            }

            command= scanner.nextLine();
        }
        System.out.printf("%d",maxnum);
    }
}
