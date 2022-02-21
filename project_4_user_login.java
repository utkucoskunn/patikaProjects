import java.sql.SQLOutput;
import java.util.Scanner;
public class test {
    public  static  void  main(String[] args) {
     String userName,password,password2;
     int select;

        Scanner input=new Scanner(System.in);

        System.out.print("Please Enter Your Username: ");
        userName = input.nextLine();
        System.out.print("Please Enter Your Password:");
        password = input.nextLine();


        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Login successful...");
        }

        else {
            System.out.println("Incorrect password");
            System.out.print("Would you like to reset your password?\nPress 1 if your answer is Yes, or 2 if No: ");
            select=input.nextInt();

            if(select==1) {
                System.out.print("Please Enter Your New Password : ");
                password2 = input.nextLine();
                String result = (password2.equals("java123") ? "Failed to Generate Password! Please Try Another Password" : "New Password Created.");
                System.out.println(result);
            }
            if(select==2){
                System.out.println("Checking out...");
            }
        }
    }
}
