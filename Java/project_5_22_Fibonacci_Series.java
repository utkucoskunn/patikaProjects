import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws Exception {

        int num1 = 0, num2 = 1, num3;

        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers? :");
        int n = scan.nextInt();

        System.out.print(num1 + " " + num2 + " ");
        for (int i = 2; i <= n; i++) {
            num3 = num2 + num1;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
        System.out.println("");
        System.out.println("******....The program is terminating....******");

    }
}
