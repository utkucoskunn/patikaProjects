import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        int num,sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter number:");
        num=scanner.nextInt();

        while(num!=0) {
            int temp=num%10;
            sum+=temp;
            num=num/10;
        }
        System.out.println("Sum:"+sum);
        
    }
}
