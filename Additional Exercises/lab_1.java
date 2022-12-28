package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class lab_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        while (!name.equals("Stop")) {
            System.out.printf("%s%n",name);
            name= scanner.nextLine();


        }

    }
}
