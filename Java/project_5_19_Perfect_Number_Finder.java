import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws Exception {

        int total = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number:");
        int number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + " is the perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        System.out.println("******.......The program is closing.......******");
    }
}
