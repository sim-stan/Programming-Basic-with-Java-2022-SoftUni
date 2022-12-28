package For_Loop_Exercise;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int maxnum = Integer.MIN_VALUE;

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            int number = Integer.parseInt(scanner.nextLine());
            sum += number;


            if (number > maxnum) {
                maxnum = number;
            }
        }
        int diff = sum - maxnum;
        if (maxnum == diff) {
            System.out.printf("Yes%nSum = %d",maxnum);

        } else {
            System.out.printf("No%nDiff = %d",Math.abs(maxnum-diff));

        }
    }
}