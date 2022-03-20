import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int right = 3;
        int balance = 1000000;
        int temp;
        while (right > 0) {
            System.out.print("Your User Name :");
            userName = scanner.nextLine();
            System.out.print("Your password: ");
            password = scanner.nextLine();

            if (userName.equals("Utku") && password.equals("1234")) {
                System.out.println("Hello, Welcome to COSKUN Bank!");

                do {
                    System.out.println("1-Deposit process\n" + "2-Withdrawal\n" + "3-Balance Inquiry\n" + "4-Log Out");
                    System.out.print("Please temp the action you want to do:");
                    temp = scanner.nextInt();

                    switch (temp) {
                        case 1:
                            System.out.print("Amount of Money You Want to Deposit:");
                            int price = scanner.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Amount of Money You Want to Withdraw:");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Your Current Balance: " + balance);
                            break;
                    }

                } while (temp != 4);
                System.out.println("See you again.");
                break;
            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your Account Has Been Blocked. Please Contact the Bank.");
                } else {
                    System.out.println("Your Remaining Rights: " + right);
                }
            }
        }
    }
}
