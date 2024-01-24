import java.util.Scanner;
public class GCDandLCM {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number : ");
        num1 = input.nextInt();

        System.out.print("Please enter second number : ");
        num2 = input.nextInt();

        //Greatest common divisor
        int gcd = 1;

        if (num1 >= num2){
            int i = num2;
            while (i >= 1){
                if(num2 % i == 0 && num1 % i == 0){
                    gcd = i;
                    break;
                }
                i--;

            }
        }else{
            int k = 1;
            while (k <= num1){
                if(num1 % k == 0 && num2 % k == 0){
                    gcd = k;
                }
                k++;
            }
        }
        System.out.println("Greatest common divisor : "+ gcd);

        //Least common multiple
        int m = 1;
        int lcm = 1;
        while (m <= num1*num2){
            if(m % num1 == 0 && m % num2 == 0){
                lcm = m;
                break;
            }
            m++;
        }
        System.out.println("Least common multiple : " + lcm);
    }
}
