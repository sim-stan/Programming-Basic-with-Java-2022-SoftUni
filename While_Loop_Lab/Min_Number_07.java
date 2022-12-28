package While_Loop_Lab;

import java.util.Scanner;

public class Min_Number_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int minnumber = Integer.MAX_VALUE;

        while (!text.equals("Stop")) {

            int number = Integer.parseInt(text);

            if (number<minnumber) {

                minnumber=number;
            }

            text = scanner.nextLine();
        }

        System.out.println(minnumber);

    }
}
