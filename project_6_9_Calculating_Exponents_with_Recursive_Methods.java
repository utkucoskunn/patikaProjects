import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int num = scan.nextInt();
        System.out.print("Please enter pow :");
        int pow = scan.nextInt();
        System.out.println("Result:" + power(num, pow));
    }

    static int power(int num, int pow) {

        if (pow == 0) {
            return 1;
        } else {
            return (int) Math.pow(num, pow);
        }
    }
}
