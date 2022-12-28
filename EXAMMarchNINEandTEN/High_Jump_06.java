package EXAMMarchNINEandTEN;

import java.util.Scanner;

public class High_Jump_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desireHigh = Integer.parseInt(scanner.nextLine());

        int linehigh = 0;
        int loosCount = 0;
        int jumpCount = 0;

        linehigh = desireHigh - 30;

        while (linehigh <= desireHigh) {

            jumpCount++;

            int jumphighs =  Integer.parseInt(scanner.nextLine());;


            if (linehigh < jumphighs) {
                linehigh += 5;
                loosCount = 0;
            } else {
                loosCount++;
            }

            if (loosCount == 3) {
                break;
            }
        }


        if (loosCount==3){
            System.out.printf("Tihomir failed at %dcm after %d jumps.",linehigh,jumpCount);
        }else {

            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",desireHigh,jumpCount);
        }
    }
}
