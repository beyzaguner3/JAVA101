import java.util.Scanner;
public class CalculateTheAreaAndPerimeterOfATriangle {
    public static void main(String[] args) {
        double firstSide, secondSide, thirdSide, u, perimeterOfTheTriangle, areaOfTheTriangle;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter 1. Side of the Triangle : ");
        firstSide = inp.nextDouble();

        System.out.print("Enter 2. Side of the Triangle : ");
        secondSide = inp.nextDouble();

        System.out.print("Enter 3.. Side of the Triangle : ");
        thirdSide = inp.nextDouble();

        u = (firstSide + secondSide + thirdSide) /2;

        perimeterOfTheTriangle = 2 * u;
        System.out.println("Perimeter of the Triangle : " + perimeterOfTheTriangle);

        areaOfTheTriangle = Math.sqrt(u * (u-firstSide) * (u-secondSide) * (u-thirdSide));
        System.out.println("Area of the Triangle : " + areaOfTheTriangle);
    }

}