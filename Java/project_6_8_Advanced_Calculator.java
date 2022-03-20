import java.util.Scanner;

public class main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result -= number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        int number, result = 1;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result *= number;
                continue;
            }
            result *=number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter the divisor 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base value :");
        int base = scan.nextInt();
        System.out.print("Enter exponent :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number :");
        int num = scan.nextInt();
        System.out.print("Please enter mod :");
        int mod = scan.nextInt();
        System.out.println("Result:" + num % mod);
    }

    static void rectangleArea() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Long side: ");
        int longSide = scan.nextInt();
        System.out.print("Short edge: ");
        int shortSide = scan.nextInt();
        System.out.println("Area of rectangle: " + longSide * shortSide);
        System.out.println("Perimeter of rectangle: "+(longSide*shortSide)*2);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu =
                        "1- Collection Operation\n"
                        + "2- Subtraction\n"
                        + "3- Multiplication\n"
                        + "4- Division operation\n"
                        + "5- Exponential Calculation\n"
                        + "6- Factorial Calculation\n"
                        + "7- Get Mod\n"
                        + "8- Rectangular Area and Perimeter Calculation\n"
                        + "0- Sign Out";

        do {
            System.out.println("**********MENU**********");
            System.out.println(menu);
            System.out.print("Please select an action : ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleArea();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered an incorrect value, try again.");
            }
        } while (select != 0);


    }
}
