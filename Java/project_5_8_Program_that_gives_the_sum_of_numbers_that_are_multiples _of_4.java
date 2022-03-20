import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean flag = true;
        int sum = 0;

        while (flag) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter number:");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                if (num % 4 == 0) {
                    sum += num;
                }
            }
            if (num % 2 != 0) {
                flag = false;
            }
        }
        System.out.println("The sum of the numbers you enter that are even and divisible by 4: "+ sum);
    }
}
