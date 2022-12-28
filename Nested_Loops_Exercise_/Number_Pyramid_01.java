package Nested_Loops_Exercise_;

import java.util.Scanner;

public class Number_Pyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int currentNum=1;

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(currentNum + " ");
                currentNum++;

                if (currentNum > n) {
                    break;
                }
            }

            if (currentNum>n) {
                break;
            }
            System.out.println();

        }
    }
}
