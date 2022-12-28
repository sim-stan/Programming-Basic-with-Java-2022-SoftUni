package Nested_Loops_Lab;

import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        boolean floor1 = false;


        for (int floor = floors; floor >= 1; floor--) {

            for (int room = 0; room < rooms; room++) {


                if (floor == floors) {
                    System.out.printf("L%d%d ", floor, room);
                    continue;
                }

                if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor, room);

                } else {
                    System.out.printf("A%d%d ", floor, room);

                }


            }
            System.out.println();
        }

    }
}
