import java.util.Scanner;
public class exponentialNumbers {
    public static void main(String[] args) {
        int base,power,result = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter base : ");
        base = input.nextInt();

        System.out.print("Please enter power : ");
        power = input.nextInt();


        for (int i = 1; i <= power; i++){
            result *= base;
        }
        System.out.println("Result : " + result);
    }
}
