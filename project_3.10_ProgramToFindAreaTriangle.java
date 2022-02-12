import java.util.Scanner;
import static java.lang.Math.pow;


public class main {
    public  static  void  main(String[] args) {

        double a,b,c,u,area;

        Scanner input= new Scanner(System.in);
        System.out.print("First edge :");
        a= input.nextInt();
        System.out.print("Second edge: " );
        b= input.nextInt();
        System.out.print("Third edge: " );
        c= input.nextInt();

        //c=Math.sqrt(a*a+ b*b);
        u=(a+b+c)/2;
        area=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Area : "+area);

    }
}
