package Dopulnitelni_Zadachi___;

import java.util.Scanner;

public class barCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int f = Integer.parseInt(scanner.nextLine());;
        int s = Integer.parseInt(scanner.nextLine());;

        int f1 = f / 1000;
        int f2 = f/100 % 10;
        int f3 = f / 10 % 10;
        int f4 = f % 10;

        int s1 = s / 1000;
        int s2 = s / 100 % 10;
        int s3 = s / 10 % 10;
        int s4 = s % 10;

        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= 9; j++)
            {
                for (int k = 1; k <= 9; k++)
                {
                    for (int l = 1; l <= 9; l++)
                    {

                        if((i%2!=0 || i==1) && i>=f1 && i<=s1)
                        {
                            if ((j % 2 != 0 || j == 1) && j >= f2 && j <= s2)

                            {
                                if ((k % 2 != 0 || k == 1) && k >= f3 && k <= s3)

                                {
                                    if ((l % 2 != 0 || l == 1) && l >= f4 && l <= s4)

                                        System.out.printf("%d%d%d%d ",i,j,k,l);

                                }

                            }

                        }

                    }
                }

            }
        }


    }
}
