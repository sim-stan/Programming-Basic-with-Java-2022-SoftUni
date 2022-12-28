package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Challenge_the_Wedding_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mens = Integer.parseInt(scanner.nextLine());
        int womens = Integer.parseInt(scanner.nextLine());
        int maxtables = Integer.parseInt(scanner.nextLine());

        int totalppl = 0;

        for (int i = 1; i <= mens; i++) {
            for (int j = 1; j <= womens; j++) {


                        if (totalppl >= maxtables) {
                            break;
                        }
                        totalppl++;
                        System.out.printf("(%d <-> %d) ", i, j);
                    }

                }


            }
        }
