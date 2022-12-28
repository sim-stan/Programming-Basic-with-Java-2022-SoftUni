package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class InvalidNumber10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        boolean validnumber = (num>=100 && num<=200 || num==0) ;

        if (!validnumber) {

            System.out.println("invalid");
        }

    }
}
