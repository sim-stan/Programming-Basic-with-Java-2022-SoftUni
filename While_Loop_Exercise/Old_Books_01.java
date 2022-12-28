package While_Loop_Exercise;

import java.util.Scanner;

public class Old_Books_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favoriteBook = scanner.nextLine();

        int bookcount = 0;
        boolean foundBook = false;
        String bookfromLibrary = scanner.nextLine();

        while (!bookfromLibrary.equals("No More Books")) {



            if (bookfromLibrary.equals(favoriteBook)) {
                foundBook = true;
                break;

            }

                bookcount ++;
            bookfromLibrary= scanner.nextLine();

        }
        if (foundBook) {
            System.out.printf("You checked %d books and found it.",bookcount);
        }else {

            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %s books.", bookcount);
        }
    }
}
