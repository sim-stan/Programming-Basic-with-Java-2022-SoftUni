package While_Loop_Exercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size1 = Integer.parseInt(scanner.nextLine());
        int size2 = Integer.parseInt(scanner.nextLine());

        int totalPieces = size1 * size2;

        String command = scanner.nextLine();

        while (!command.equals("STOP")) {

            int piecestoRemove = Integer.parseInt(command);

            totalPieces = totalPieces - piecestoRemove;

            if (totalPieces<0) {
                break;

            }

            command = scanner.nextLine();
        }


        if (totalPieces>0) {
            System.out.printf("%d pieces are left.",totalPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(totalPieces));
        }
    }
}
