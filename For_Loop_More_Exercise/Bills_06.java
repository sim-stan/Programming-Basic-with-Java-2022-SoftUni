package For_Loop_More_Exercise;

import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

            double totalelectric = 0.0;
            double totalwater = 0.0;
            double totalinternet = 0.0;
            double totalother = 0.0;

            double totalSum = 0.0;

        for (int i = 1; i <=months; i++) {

            double electricity = Double.parseDouble(scanner.nextLine());

            double water = 20.0;
            double internet = 15.0 ;
            double other = (electricity + water + internet) * 1.20;


            totalelectric +=electricity;
            totalwater = 20 * i;
            totalinternet = internet * i;
            totalother += other ;
        }

        totalSum = (totalelectric + totalwater + totalinternet + totalother) / months;
        System.out.printf("Electricity: %.2f lv%n",totalelectric);
        System.out.printf("Water: %.2f lv%n",totalwater);
        System.out.printf("Internet: %.2f lv%n",totalinternet);
        System.out.printf("Other: %.2f lv%n",totalother);
        System.out.printf("Average: %.2f lv",totalSum);
    }
}
