import java.util.Scanner;
public class RecursivePattern {

    static void pattern(int x) {
        System.out.print(x + " ");

        if (x > 0) {
            pattern(x - 5);
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int n = inp.nextInt();
        pattern(n);
    }
}
