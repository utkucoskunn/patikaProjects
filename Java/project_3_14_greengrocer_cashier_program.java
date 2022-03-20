import java.util.Scanner;


public class main {
    public  static  void  main(String[] args) {

       //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL

     double pear,apple,tomato,banana,eggplant,result;

        System.out.print("How many kilograms of pears: ");
        Scanner inp=new Scanner(System.in);
        pear = inp.nextDouble()*2.14;

        System.out.print("How many kilograms of apples: ");
        Scanner inp1=new Scanner(System.in);
        apple = inp1.nextDouble()*3.67;

        System.out.print("How many kilograms of tomatoes: ");
        Scanner inp2=new Scanner(System.in);
        tomato = inp2.nextDouble()*1.11;

        System.out.print("How many kilograms of bananas: ");
        Scanner inp3=new Scanner(System.in);
        banana = inp3.nextDouble()*0.95;

        System.out.print("How many kilograms of eggplants: ");
        Scanner inp4=new Scanner(System.in);
        eggplant = inp4.nextDouble()*5;


        result=pear+apple+tomato+banana+eggplant;
        System.out.println("Total price: "+result);
    }
}
