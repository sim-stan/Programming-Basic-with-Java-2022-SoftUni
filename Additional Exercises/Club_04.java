package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Club_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double targetBudget = Double.parseDouble(scanner.nextLine());

        String coctailname = scanner.nextLine();
        int coctailcount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <coctailcount ; i++) {

            char coctail = coctailname.charAt(i);
            double firscoctal = coctail * coctailcount;

        }

    }
}
