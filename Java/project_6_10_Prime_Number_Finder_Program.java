import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number :");
        int num= scan.nextInt();
        System.out.println(isPrime(num,2)?num+" "+"is prime number":num+" "+"is not prime number.");
    }
    static boolean isPrime(int number,int i){
        if(i>=number){
            return true;
        }
        if(number%i==0){
            return false;
        }
        else return isPrime(number,i+1);
    }
}
