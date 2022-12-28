package ExamSIXandSEVENofJuly;

import java.util.Scanner;

public class Travel_Agency_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String city= scanner.nextLine();
        String pacageType= scanner.nextLine();
        String yesorno= scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        boolean isValid=false;
        double price=0.0;

        if (city.equals("Bansko")) {

            switch (yesorno) {

                case "yes":

                     if (pacageType.equals("noEquipment")) {
                        price = (nights * 80)*0.95;
                         if (nights>7) {
                             price = ((nights - 1) * 80)*0.95;
                         }
                    } else if (pacageType.equals("withEquipment")) {
                         price = (nights * 100) * 0.90;
                         if (nights>7) {
                             price = ((nights - 1) * 100) * 0.90;
                             }


                         }

                          break;


                case "no":
                    if (pacageType.equals("noEquipment")) {
                        price = (nights * 80);
                        if (nights>7) {
                            price = ((nights - 1) * 80);
                        }
                    } else if (pacageType.equals("withEquipment")) {
                        price = (nights * 100);
                        if (nights>7) {
                            price = ((nights - 1) * 100);
                        }


                    }

                    break;
            }

        } else if (city.equals("Borovets")) {

            switch (yesorno) {

                case "yes":

                    if (pacageType.equals("noEquipment")) {
                        price = (nights * 80)*0.95;
                        if (nights>7) {
                            price = ((nights - 1) * 80)*0.95;
                        }
                    } else if (pacageType.equals("withEquipment")) {
                        price = (nights * 100) * 0.90;
                        if (nights>7) {
                            price = ((nights - 1) * 100) * 0.90;
                        }


                    }

                    break;


                case "no":
                    if (pacageType.equals("noEquipment")) {
                        price = (nights * 80);
                        if (nights>7) {
                            price = ((nights - 1) * 80);
                        }
                    } else if (pacageType.equals("withEquipment")) {
                        price = (nights * 100);
                        if (nights>7) {
                            price = ((nights - 1) * 100);
                        }


                    }

                    break;
            }

        }
        else if (city.equals("Varna")) {

            switch (yesorno) {

                case "yes":

                    if (pacageType.equals("noBreakfast")) {
                        price = (nights * 100)*0.93;
                        if (nights>7) {
                            price = ((nights - 1) * 100)*0.93;
                        }
                    } else if (pacageType.equals("withBreakfast")) {
                        price = (nights * 130) * 0.88;
                        if (nights>7) {
                            price = ((nights - 1) * 130) * 0.88;
                        }


                    }

                    break;


                case "no":
                    if (pacageType.equals("noBreakfast")) {
                        price = (nights * 100);
                        if (nights>7) {
                            price = ((nights - 1) * 100);
                        }
                    } else if (pacageType.equals("withBreakfast")) {
                        price = (nights * 130);
                        if (nights>7) {
                            price = ((nights - 1) * 130);
                        }


                    }

                    break;
            }




        } else if (city.equals("Burgas")) {

            switch (yesorno) {

                case "yes":

                    if (pacageType.equals("noBreakfast")) {
                        price = (nights * 100)*0.93;
                        if (nights>7) {
                            price = ((nights - 1) * 100)*0.93;
                        }
                    } else if (pacageType.equals("withBreakfast")) {
                        price = (nights * 130) * 0.88;
                        if (nights>7) {
                            price = ((nights - 1) * 130) * 0.88;
                        }


                    }

                    break;


                case "no":
                    if (pacageType.equals("noBreakfast")) {
                        price = (nights * 100);
                        if (nights>7) {
                            price = ((nights - 1) * 100);
                        }
                    } else if (pacageType.equals("withBreakfast")) {
                        price = (nights * 130);
                        if (nights>7) {
                            price = ((nights - 1) * 130);
                        }


                    }

                    break;
            }



        }
        else {
            isValid=true;
        }

        if (nights<1) {
            System.out.printf("Days must be positive number!");
        } else if (isValid) {
            System.out.printf("Invalid input!");
        }else {
            System.out.printf("The price is %.2flv! Have a nice time!",price);
        }


    }
}
