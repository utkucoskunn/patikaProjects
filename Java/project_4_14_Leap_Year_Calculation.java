import java.util.Scanner;
public class main {

    static public void main (String[] args) {

        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter year : ");
        year = scanner.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is leap year!");
        } else {
            System.out.println(year + " isn't leap year!");
        }
    }
}
