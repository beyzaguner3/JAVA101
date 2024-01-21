import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        //C(n,k) = n! / (k! * (n-k)!)
        int n,k;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of elements : ");
        n = input.nextInt();

        System.out.print("Please enter number of combinations : ");
        k = input.nextInt();

        int nFactorial = 1;
        int kFactorial = 1;
        int nMinuskFactorial = 1;

        // n!
        for(int i = 1; i <= n; i++){
            nFactorial *= i;
        }
        System.out.println(n + "! = " + nFactorial);

        //k!
        for (int m = 1; m <= k; m++){
            kFactorial *= m;
        }
        System.out.println(k + "! = " + kFactorial);

        int minus = n - k;

        //(n-k)!
        for (int a = 1; a <= minus; a++){
            nMinuskFactorial *= a;
        }
        System.out.println(minus + "! = " + nMinuskFactorial);

        int combination = nFactorial / (kFactorial * nMinuskFactorial);

        System.out.println("C(" + n + "," + k + ") =" + combination);
    }
}
