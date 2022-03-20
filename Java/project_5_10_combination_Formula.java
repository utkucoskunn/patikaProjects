import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        System.out.println("Program that calculates C(n,r):");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter n:  ");
        int n = input.nextInt();

        System.out.print("Please enter r: ");
        int r = input.nextInt();


        int facn = 1;
        int facr = 1;
        int facx=1;
        int temp=n-r;


        for(int i = n ; i >= 2 ;i-- ){
            facn=facn*i;
        }
        for(int i = r ; i >= 2 ;i-- ){
            facr=facr*i;
        }
        for(int i = temp ; i >= 2 ;i-- ){
            facx=facx*i;
        }

        System.out.println("C(n,r): " + facn/(facr*facx));
    }
}
