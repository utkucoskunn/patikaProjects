import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number:");
        int num = scan.nextInt();
        double sum=0,count=0;
        for (int i = 1; i <=num ; i++) {
            if(i%3==0 && i%4==0){
                sum = sum+i;
                count++;
            }
        }
        double average = sum/count;
        if(count>1){
            System.out.println("Average of numbers divisible by 3 and 4: " +average);
        }
        else {
            System.out.println("No numbers in the given range!");
        }

    }
}
