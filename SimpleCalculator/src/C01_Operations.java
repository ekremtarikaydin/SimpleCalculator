import java.util.Scanner;

public class C01_Operations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select;
        boolean control = false; //

        String menu = "Please select the operation you want to perform from the list below\n" +
                "1- Addition\n" +
                "2- Extraction\n" +
                "3- Multiplication\n" +
                "4- Division\n" +
                "5- Exponential Numbers\n" +
                "6- Modulus\n" +
                "7- Rectangular Area\n" +
                "8- Rectangular Perimeter\n" +
                "0- Exit";

        System.out.println(menu);

        while(true){
            control = scanner.hasNextInt();

            if (control){
                select = scanner.nextInt();
            
                if (select==0){

                    System.out.println("Terminated Successfully");

                    break;
                } else if ( select<0 || select>8) {

                    System.out.println("Wrong Entry. Please try again");


                } else {


                    System.out.println("Please enter two numbers for the operation\n" +
                            "First Number: ");

                    double x = scanner.nextDouble();

                    System.out.println("Second Number: ");
                    double y = scanner.nextDouble();

                        switch (select) {
                            case 1:

                                C02_Actions.addition(x, y);
                                System.out.println(menu);

                                break;

                            case 2:

                                C02_Actions.extraction(x, y);
                                System.out.println(menu);

                                break;

                            case 3:

                                C02_Actions.multiplication(x, y);
                                System.out.println(menu);

                                break;

                            case 4:

                                C02_Actions.division(x, y);
                                System.out.println(menu);

                                break;

                            case 5:

                                C02_Actions.exponential(x, y);
                                System.out.println(menu);

                                break;

                            case 6:

                                C02_Actions.modulus(x, y);
                                System.out.println(menu);

                                break;

                            case 7:

                                C02_Actions.area(x, y);
                                System.out.println(menu);

                                break;

                            case 8:

                                C02_Actions.perimeter(x, y);
                                System.out.println(menu);

                                break;
                            }
                        }
                    }else {
                    System.out.println("Please enter a number. Other characters are not compatible.");
                    scanner = new Scanner(System.in);
            }
        }
    }
}
