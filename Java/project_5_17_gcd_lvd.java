import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        int gcd = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int s1= scanner.nextInt();
        System.out.print("Please enter second number: ");
        int s2= scanner.nextInt();
        System.out.println("-------------------------------------------");

        //Greatest common divisor
        if (s1<s2) {
            int i=1;
            while (i<=s1) {
                if (s1%i==0 && s2%i==0) {
                    gcd=i;
                }
                i++;
            }
            System.out.println("Greatest common divisor: "+gcd);
        }
        else
        {
            int i=1;
            while (i<=s2) {
                if (s1%i==0 && s2%i==0) {
                    gcd=i;
                }
                i++;
            }
            System.out.println("Greatest common divisor: "+gcd);
        }

        //Lowest common floor

        int lcd=1;
        while (lcd<=(s1*s2)) {
            if (lcd%s1==0 && lcd%s2==0) {
                System.out.println("Lowest common floor: "+lcd);
                break;
            }
            lcd++;
        }
    }
}
