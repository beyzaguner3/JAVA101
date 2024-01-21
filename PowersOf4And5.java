import java.util.Scanner;
public class PowersOf4And5 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the upper limit number : ");
        n = input.nextInt();

        int i = 1;
        System.out.println("Numbers that are powers of 4 up to " + n);
        while ( i <= n ){
            System.out.println(i);
            i *= 4;
        }

        int k = 1;
        System.out.println("Numbers that are powers of 5 up to " + n);
        while ( k <= n ){
            System.out.println(k);
            k *= 5;
        }
    }
}
