import java.util.Scanner;
import static java.lang.Math.pow;


public class main {
    public  static  void  main(String[] args) {

        int km;
        double perKm=2.20, totalPrice, startPrice=10;

        Scanner input=new Scanner((System.in));
        System.out.print("Enter the distance you want in kilometers: ");
        km=input.nextInt();

        totalPrice=(km*perKm)+startPrice;
        System.out.print("Total Price: "+(totalPrice<=20?20:totalPrice));


    }
}
