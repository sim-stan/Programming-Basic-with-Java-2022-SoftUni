package Nested_Loops_Lab;

import java.util.Scanner;

public class Multiplication_Table_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <=10; i++) {

            for (int j = 1; j <=10 ; j++) {
                int result = i*j;
                System.out.printf("%d * %d = %d%n",i,j,result);

            }

        }
    }
}
