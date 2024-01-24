import java.util.Scanner;
public class InvertedTriangleWithStars {
    public static void main(String[] args) {
        int numberOfLines;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of lines : ");
        numberOfLines = input.nextInt();

        for (int i = numberOfLines; i >= 1; i--) {
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
