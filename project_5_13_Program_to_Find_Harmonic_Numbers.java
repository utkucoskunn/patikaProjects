import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        double result=0.0;

        Scanner input=new Scanner(System.in);
        System.out.print("Please enter number:");
        int num=input.nextInt();

        for(double i=1; i<=num; i++) {
            result+=(1/i);
        }
        System.out.println("Result: "+ result);
    }
}
