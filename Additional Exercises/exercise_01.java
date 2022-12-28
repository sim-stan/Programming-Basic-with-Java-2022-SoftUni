package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();

        boolean bookFound = false;
        String command = scanner.nextLine();
        int booksCount = 0;
        while (!command.equals("No More Books")) {

            String nextbook = command;

            if (command.equals(book)) {
                bookFound=true;
                break;
            }
            booksCount++;

            command= scanner.nextLine();
        }
        if (!bookFound) {

            System.out.printf("The book you search is not here%nYou checked %d books.",booksCount);

        }else {
            System.out.printf("You checked %d books and found it.",booksCount);
        }
    }
}
