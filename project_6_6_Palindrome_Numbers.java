import java.util.Scanner;

public class main {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0;
        boolean flag = false;

        while (temp != 0) {
            int lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number: ");
        number = scanner.nextInt();

        if (isPalindrom(number)) {
            System.out.println(number + " " + "is Palindrome");
        } else {
            System.out.println(number + " " + "is not Palindrome");
        }
    }
}
