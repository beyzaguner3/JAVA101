import java.util.Scanner;
import java.util.Arrays;
public class MatrisTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the row number : ");
        int row = input.nextInt();

        System.out.print("Enter the column number : ");
        int col = input.nextInt();

        int[][] list = new int[row][col];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print("Enter the " + (i + 1) + ". row, " + (j + 1) + ". column of the matrix : ");
                int element = input.nextInt();
                list[i][j] = element;
            }
        }
        System.out.println("Matrix : ");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix : ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(list[j][i] + "\t");
            }
            System.out.println();
        }

    }
}
