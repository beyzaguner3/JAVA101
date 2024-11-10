import java.util.Scanner;
import java.util.Arrays;
public class NearestMaxMin {
    public static void main(String[] args) {
                int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
                int number;
                Scanner input = new Scanner(System.in);

                System.out.println(Arrays.toString(list));
                System.out.print("Enter the target number : ");
                number = input.nextInt();

                Arrays.sort(list);
                System.out.println("Sorted Array: " + Arrays.toString(list));
                int min = list[0];
                int max = list[0];


                for (int i : list) {
                    if ( i < number) {
                        min = i ;
                    }

                    if (i > number) {
                        max = i;
                        break ;
                    }
                }
                System.out.println("Closest number smaller than the entered number : " + min);
                System.out.println("Closest number larger than the entered number : " + max);
            }

        }
