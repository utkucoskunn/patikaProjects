import java.util.Scanner;



public class main {
    public  static  void  main(String[] args) {

      double pi=3.14;
      int r;
      int alfa;

      System.out.print("Enter the radius of the circle: ");
      Scanner input=new Scanner(System.in);
      r=input.nextInt();

      System.out.print("Enter the pain of the circle: ");
      Scanner input2=new Scanner(System.in);
      alfa=input2.nextInt();


      double area=(pi*(r*r)*alfa)/360;
        System.out.print("Area of the circle segment: "+area);
    }
}
