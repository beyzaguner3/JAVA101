import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter limit number : ");
        n = input.nextInt();

        double result = 0.0;
        double i = 1;

        while (i <= n){
            result += (1/i);
            i++;
        }
        System.out.println(result);
    }
}
