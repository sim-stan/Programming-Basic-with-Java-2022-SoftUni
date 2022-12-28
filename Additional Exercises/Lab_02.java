package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Lab_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pass = scanner.nextLine();
        String command = scanner.nextLine();
        while (command.equals(pass)) {

            command=scanner.nextLine();
        }

        System.out.printf("Welcome %s!",name);
    }
}
