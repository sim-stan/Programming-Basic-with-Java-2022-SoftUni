package ForLoop_Lab;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int eventotal = 0;
        int oddtotal = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {

                eventotal += number;

            } else {
                oddtotal += number;
            }
        }
        int diff =Math.abs(eventotal - oddtotal);

        if (eventotal == oddtotal) {
            System.out.printf("Yes%n");
            System.out.printf("Sum = %d", eventotal);

        } else {
            System.out.printf("No%n");
            System.out.printf("Diff = %d",diff);
        }
    }
}
