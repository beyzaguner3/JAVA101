import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements of the Fibonacci series : ");
        int n = input.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("Fibonacci Series");
        System.out.print(firstNumber + " " + secondNumber + " ");

        if(n < 2){
            System.out.println("You entered incorrectly");
        } else {
            for(int i = 3; i <= n; i++){
                int sum = firstNumber + secondNumber;
                System.out.print(sum + " ");
                firstNumber = secondNumber;
                secondNumber = sum;

            }
        }
    }
}
