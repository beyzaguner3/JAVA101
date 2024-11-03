import java.util.Scanner;

public class RecursiveExponent {

    static  int exponent(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return base;
        } else {
            return base * exponent(base, exp - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exp;
        System.out.print("Enter base: ");
        base = sc.nextInt();
        System.out.print("Enter exponent: ");
        exp = sc.nextInt();
        System.out.println(exponent(base,exp));
    }
}


