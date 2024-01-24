import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int number, sumOfMultipliers = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        number = input.nextInt();

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sumOfMultipliers += i;
            }
        }
        if(number == sumOfMultipliers){
            System.out.println(number + " is a perfect number.");
        }else{
            System.out.println(number + " is not a perfect number. ");
        }
    }
}
