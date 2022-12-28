package ForLoop_Lab;

import java.util.Scanner;

public class Sum_Numbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rols = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i=1; i<=rols; i++ ) {


            int number = Integer.parseInt(scanner.nextLine());

            sum = sum + number;
        }
        System.out.println(sum);
    }
}
