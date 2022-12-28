package While_Loop_Lab;

import java.util.Scanner;

public class Max_Number_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int maxnumber = Integer.MIN_VALUE;

        while (!text.equals("Stop")) {

            int number = Integer.parseInt(text);

            if (number>maxnumber) {

                maxnumber=number;
            }

            text = scanner.nextLine();
        }

        System.out.println(maxnumber);

    }
}
