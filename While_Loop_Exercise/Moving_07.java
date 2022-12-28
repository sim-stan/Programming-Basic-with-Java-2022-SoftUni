package While_Loop_Exercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());


        int volume = width * length * height;

        String command = scanner.nextLine();

        while (!command.equals("Done")) {

            int boxes = Integer.parseInt(command);

            volume = volume - boxes;

            if (volume<0) {
                break;
            }

            command = scanner.nextLine();

        }

        if (volume>0) {
            System.out.printf("%d Cubic meters left.",volume);
        }else {
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(volume));
        }
    }
}
