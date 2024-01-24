import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        String userName, password,logOut;
        int transaction;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 6780;
        int deposit;
        int withdraw;

        while(right != 0){
            System.out.print("Please enter your username : ");
            userName = input.nextLine();
            System.out.print("Please enter your password : ");
            password = input.nextLine();
            if (userName.equals("beyzaguner") && password.equals("123beyza")){
                System.out.println("Welcome to mobile banking!");
                do{
                    System.out.println("1-DEPOSIT MONEY\n" + "2-WITHDRAW MONEY\n" + "3-BALANCE INQUIRY\n"  + "4-LOG OUT");
                    System.out.println("Please select which transaction you want to make");
                    transaction = input.nextInt();
                    switch (transaction) {
                        case 1:
                            System.out.print("Enter how much money you want to deposit : ");
                            deposit = input.nextInt();
                            balance += deposit;
                            System.out.println("Your balance : " + balance);
                            break;
                        case 2:
                            System.out.print("Enter how much money you want to withdraw");
                            withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Insufficient balance!!");
                            } else {
                                balance -= withdraw;
                                System.out.println("Your balance : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Your balance : " + balance);
                            break;
                    }
                    if(transaction > 4){
                        System.out.println("There is no such transaction please try again");
                    }

                }while(transaction != 4);
                System.out.println("See you again:)");
                break;

            }else{
                right--;
                System.out.println("Username or password is incorrect. Please try again.");
                System.out.println("Your remaining rights : " + right);
            }
            if (right == 0){
                System.out.println("Your account has been blocked please contact with your bank");
            }
            break;
        }
    }
}
