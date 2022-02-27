import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws Exception {

        int temp;

        Scanner input = new Scanner(System.in);
        System.out.print(" Please number of digits: ");
        temp = input.nextInt();
        System.out.println("");

        for (int i = temp; i > 0; i--) {
            for (int j = temp; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("******.......The program is closing.......******");
    }
}
