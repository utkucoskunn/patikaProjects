import java.util.Scanner;


public class main {
    public  static  void  main(String[] args) {

       // Kilo (kg) / Boy(m) * Boy(m)

     double result,size,weight;

        System.out.print("Your weight: ");
        Scanner inp=new Scanner(System.in);
        weight = inp.nextDouble();

        System.out.print("Your size: ");
        Scanner inp2=new Scanner(System.in);
        size=inp2.nextDouble();

        result=weight/(size*size);
        System.out.print("Result: "+result);
    }
}
