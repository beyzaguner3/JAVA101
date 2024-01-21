import java.util.Scanner;
public class AverageOfNumbersDivisibleBy3And4 {
    public static void main(String[] args) {
        int k,sum = 0;
        double average,loop = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number : ");
        k = input.nextInt();

        for (int i = 0; i<=k; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                System.out.println(i);
                sum += i;
                loop++;
            }
        }
        average = sum/loop;
        System.out.println(average);
    }
}
