package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class Torta_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengt = Integer.parseInt(scanner.nextLine());
        int whide = Integer.parseInt(scanner.nextLine());



        int sizeCake = lengt * whide;
        String command = scanner.nextLine();

        while (!command.equals("STOP")) {

            int pieces = Integer.parseInt(command);


            sizeCake =sizeCake - pieces;
            if (sizeCake<0) {
                break;
            }


            command= scanner.nextLine();
        }


        if (sizeCake>0) {
            System.out.printf("%d pieces are left",Math.abs(sizeCake));
        }else {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(sizeCake));
        }
    }
}
