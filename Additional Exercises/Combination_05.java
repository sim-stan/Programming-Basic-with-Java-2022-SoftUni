package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Combination_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;
        int totalcount = 0;
        for (int i = 0; i <= n; i++) {


            for (int j = 0; j <= n; j++) {


                for (int k = 0; k <= n; k++) {

                    result = i + j + k;
                    if (result == n) {
                        totalcount++;
                    }

                }

            }

        }
        System.out.printf("%d", totalcount);
    }
}