import java.util.Scanner;


public class main {
    public  static  void  main(String[] args) {
        int temp;

        Scanner input= new Scanner(System.in);
        System.out.print("Enter temperature: " );
        temp= input.nextInt();

        if(temp<5){
            System.out.println("I suggest you ski");
        }
        if(5<=temp&&temp<15){
            System.out.println("I suggest you cinema");
        }
        if(15<=temp&&temp<25){
            System.out.println("I suggest you picnic");
        }
        if(temp>=25){
            System.out.println("I suggest you swim");
        }

    }
}
