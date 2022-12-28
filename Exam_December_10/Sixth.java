package Exam_December_10;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m= Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

            int count=0;
        for (int i = k; i <=8 ; i++) {
            for (int j = 9; j >=l ; j--) {
                for (int o = m; o <=8 ; o++) {
                    for (int p = 9; p >=n ; p--) {

                        if (count==6){
                            break;
                        }

                        if (i%2==0 && o%2==0){
                            if (j%2!=0 && p%2!=0){
                                if (i!=o || j!=p){
                                    System.out.printf("%d%d - %d%d%n",i,j,o,p);
                                    count++;

                                }else {
                                    System.out.printf("Cannot change the same player.%n");
                                }
                            }
                        }

                    }

                }

            }
            
        }


    }
}
