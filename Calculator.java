import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double number1, number2;
        int operation;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 1.number : ");
        number1 = input.nextDouble();
        System.out.print("Please enter 2.number : ");
        number2 = input.nextDouble();
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division ");
        System.out.print("Please select which operation you want to make : ");
        operation = input.nextInt();

        switch(operation){
            case 1:
                System.out.println("Result = " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result = " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result = " + (number1 * number2));
                break;
            case 4:
                if (number2 == 0){
                    System.out.println("Division of a number by 0 is undefined!");
                } else {
                    System.out.println("Result = " + (number1/number2));
                }
                break;
            default:
                System.out.println("You have entered incorrectly");
        }
    }
}
