package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Kolelata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int controlNumber = Integer.parseInt(scanner.nextLine());
        int result = 0;
        int count = 0;

        int pass=0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        result = a * b + c * d;
                        if (controlNumber == result && a < b && c > d) {
                            count++;
                            System.out.printf("%d%d%d%d ", a, b, c, d);

                        }
                        if (count == 4 &&controlNumber == result && a < b && c > d) {
                            pass=result;

                        }

                    }

                }

            }
        }
            System.out.println();
            if (count < 4) {
                System.out.println("No!");


            } else if (pass==result) {
                System.out.printf("Password: %d",result);
            }


    }
    }

