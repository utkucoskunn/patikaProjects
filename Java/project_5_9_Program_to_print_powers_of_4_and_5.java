import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number:");
        int num = scan.nextInt();
        for (int i = 1; i <=num ; i++) {
            if(i%4==0 && i%5==0){
                System.out.println("Average of numbers divisible by 3 and 4: "+i);
            }
        }

    }
}
