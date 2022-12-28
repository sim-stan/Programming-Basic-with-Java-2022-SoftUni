package Exam_20_and_21_April_2019;

import java.util.Scanner;

public class Easter_Competition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int pointwinner=Integer.MIN_VALUE;
        String namewinner="";

        for (int i = 1; i <=n; i++) {

            String name= scanner.nextLine();
            String command= scanner.nextLine();
            int result=0;

            while (!command.equals("Stop")){

                int grade = Integer.parseInt(command);

                result+=grade;

                command= scanner.nextLine();
            }

            if (result>pointwinner){
                pointwinner=result;
                namewinner=name;

                System.out.printf("%s has %d points.%n",name,result);
                System.out.printf("%s is the new number 1!%n",namewinner);
            }else {
                System.out.printf("%s has %d points.%n",name,result);
            }

        }

        System.out.printf("%s won competition with %d points!",namewinner,pointwinner);
    }
}
