import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String userName, password, resetPassword, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your username : ");
        userName = input.nextLine();

        System.out.print("Please enter your password : ");
        password = input.nextLine();


        if (userName.equals("Beyza") && password.equals("123")) {
            System.out.println("You are logged in");
        } else if (!userName.equals("Beyza") && password.equals("123")) {
            System.out.println("You entered an incorrect username!");
        } else if (userName.equals("Beyza") && !password.equals("123")) {
            System.out.println("You entered an incorrect password!");
            System.out.print("Would you like to reset your password ? : ");
            resetPassword = input.nextLine();
            if (resetPassword.equals("yes")) {
                System.out.print("Please enter your new password : ");
                newPassword = input.nextLine();
                if (newPassword.equals("123")){
                    System.out.println("Your new password cannot be the same as your old password!");
                    System.out.print("Please enter another password : ");
                } else {
                    System.out.println("Password created");
                }
            }
        }
    }
}