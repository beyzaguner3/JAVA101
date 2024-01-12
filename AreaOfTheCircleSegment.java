import java.util.Scanner;
public class AreaOfTheCircleSegment {
    public static void main(String[] args) {
        double r,a,pi;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Radius Value : ");
        r = input.nextDouble();

        System.out.print("Enter Central Angle : ");
        a = input.nextDouble();
        pi = 3.14;

        double areaOfTheCircleSegment = (pi * (r*r) * a) /360;
        System.out.println("Area Of The Circle Segment : " +  areaOfTheCircleSegment );
    }
}
