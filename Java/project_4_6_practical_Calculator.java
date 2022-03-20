import java.util.Scanner;
public class test {
    public  static  void  main(String[] args) {
     int num1,num2,select,result;

     Scanner input=new Scanner(System.in);

     System.out.println("Enter the first number: ");
     num1=input.nextInt();

     System.out.println("Enter the second number: ");
     num2=input.nextInt();

     System.out.println("What action do you want to take? : (1-Sum, 2-Subtraction, 3-Multiplication, 4-Division ");
     select=input.nextInt();

     switch(select) {
         case 1:
             result = num1 + num2;
             System.out.println("a+b:" + result);
             break;
         case 2:
             result = num1-num2;
             System.out.println("a-b:" + result);
             break;
         case 3:
             result = num1* num2;
             System.out.println("a*b:" + result);
             break;
         case 4:
             result = num1/ num2;
             System.out.println("a/b:" + result);
             break;
         default:
             System.out.println("Incorrect information entry");
     }
    }

}