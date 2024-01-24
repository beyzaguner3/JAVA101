import java.util.Scanner;
public class SumOfDigitNumbers {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        number = input.nextInt();

        int temporaryNumber = number;
        temporaryNumber = number;
        int sumOfDigitNumbers = 0;
        int digitsOfNumber;
        while (temporaryNumber != 0){
            digitsOfNumber = temporaryNumber % 10;
            temporaryNumber /= 10;
            sumOfDigitNumbers += digitsOfNumber;
            System.out.println(digitsOfNumber);
        }
        System.out.println("Sum of digit numbers : " + sumOfDigitNumbers);
    }
}
