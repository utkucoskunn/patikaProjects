import java.util.Scanner;


public class main {
    public  static  void  main(String[] args) {
        int num1, num2, num3;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Enter third number: ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println(num1+">"+num2+">"+num3);
            } else {
                System.out.println(num1+">"+num3+">"+num2);
            }
        }
        if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println(num2+">"+num1+">"+num3);
            } else {
                System.out.println(num2+">"+num3+">"+num1);
            }
        }
        if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                System.out.println(num3+">"+num1+">"+num2);
            } else {
                System.out.println(num3+">"+num2+">"+num1);
            }
        }
        else {
            System.out.println("You entered the wrong value");
        }
    }
}
