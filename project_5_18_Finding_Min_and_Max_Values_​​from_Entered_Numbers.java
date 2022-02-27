import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws Exception {

        System.out.print("How many numbers will you enter: ");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int[] values = new int[value];

        for (int i = 0; i < value; i++) {
            System.out.print("Enter "+(i+1)+".number:");
            values[i] = scan.nextInt();
        }
        Arrays.sort(values);

        System.out.println("Max Value : " + values[value - 1]);
        System.out.println("Min Value : " + values[0]);
    }
}
