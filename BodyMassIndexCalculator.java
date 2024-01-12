import java.util.Scanner;
public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        double weight, height, bodyMassIndex;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Weight in Kilogram: ");
        weight = input.nextDouble();

        System.out.print("Enter Your Height in Meter : ");
        height = input.nextDouble();

        bodyMassIndex = weight / (height * height);
        System.out.println("Your Body Mass Index : " + bodyMassIndex);
    }
}
