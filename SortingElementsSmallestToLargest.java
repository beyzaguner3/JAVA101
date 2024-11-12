import java.util.Scanner;
import java.util.Arrays;
public class SortingElementsSmallestToLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Length : ");
        int length = sc.nextInt();
        int[] list = new int[length];


        for (int i = 0; i < length; i++) {
            System.out.print("Enter " + (i + 1) + ". Element : ");
            list[i] = sc.nextInt();
        }
        //BubbleSort Algorithm
        System.out.println("List : " + Arrays.toString(list));
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorting from smallest to largest : ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
//Arrays.sort(list);
//System.out.println("Sorted List : " + Arrays.toString(list));
//We can also use Arrays.sort() method but in this example it is not permitted, becuase output shouldn't be in form of list.
