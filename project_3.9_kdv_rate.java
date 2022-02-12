import java.util.Scanner;


public class main {
    public  static  void  main(String[] args) {
        double price, kdv=0.18, kdv2=0.08, kdvPrice1,kdvPrice2, totalPrice;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the fee amount:");
        price= input.nextDouble();

        kdvPrice1=price*kdv;
        kdvPrice2=price*kdv2;

        System.out.println("Kdv free amount :"+price);
        System.out.println("Kdv :"+(price>1000? kdv2:kdv));
        System.out.println("Kdv price :"+(price>1000? price*kdv2:price*kdv));
        System.out.println("Total price :"+(price>1000?price+(price*kdv2):price+(price*kdv)));
    }
}
