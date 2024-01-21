import java.util.Scanner;
public class SumOfMultipliesOfFour {
    public static void main(String[] args) {
        int i,sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please enter the number : ");
            i = input.nextInt();
            if(i % 4 == 0){
                sum += i;
            }
        } while (i % 2 == 0);
        System.out.println("Sum : " + sum);
    }
}
