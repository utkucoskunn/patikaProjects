import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number one :  ");
        int n = input.nextInt();
        System.out.print("Please enter number two :  ");
        int r = input.nextInt();

        System.out.println(n+" pow "+r +": "+ Math.pow(n,r));
    }
}
