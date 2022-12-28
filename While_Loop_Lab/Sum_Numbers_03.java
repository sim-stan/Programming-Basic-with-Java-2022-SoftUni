package While_Loop_Lab;

import java.util.Scanner;

public class Sum_Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;


        while (totalSum < number) {

           int newnumber = Integer.parseInt(scanner.nextLine());
            totalSum += newnumber;
        }
        System.out.println(totalSum);
    }
}
