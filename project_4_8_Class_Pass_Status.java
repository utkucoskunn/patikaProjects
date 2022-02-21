import java.util.Scanner;


public class main {
    public  static  void  main(String[] args) {
        int math,phys,chem,turk,mus;
        double sum=0;
        int num=0;
        double result;
        Scanner input= new Scanner(System.in);

        System.out.print("Maths Grade:" );
        math= input.nextInt();
        System.out.print("Physics Grade:" );
        phys= input.nextInt();
        System.out.print("Chemical Grade:" );
        chem= input.nextInt();
        System.out.print("Turkish Grade:" );
        turk= input.nextInt();
        System.out.print("Music Grade:" );
        mus= input.nextInt();

        if(0<=math && math<=100){
            sum+=math;
            num++;
        }
        if(0<=phys && phys<=100){
            sum+=phys;
            num++;
        }
        if(0<=chem && chem<=100){
            sum+=chem;
            num++;
        }
        if(0<=turk && turk<=100){
            sum+=turk;
            num++;
        }
        if(0<=mus && mus<=100){
            sum+=mus;
            num++;
        }

        result=sum/num;

        System.out.println("Your result:"+" "+result+"1"+" "+(result>=55? "Passed the Class":"Failed the class"));
    }
}
