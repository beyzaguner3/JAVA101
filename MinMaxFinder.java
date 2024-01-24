import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numbercount, number, max = 0, min = 0;

        System.out.print("How many numbers will you enter? : ");
        numbercount = input.nextInt();

        for (int i = 1; i <= numbercount; i++) {
            System.out.print( "Please enter" + i + ". number");
            number = input.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("largest number : " + max);
        System.out.println("Smallest number : " + min);
    }
}