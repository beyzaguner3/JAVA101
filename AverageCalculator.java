import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        int mathematics, physics, chemistry, biology, history, music;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your math grade: ");
        mathematics = inp.nextInt();

        System.out.print("Enter your physics grade: ");
        physics = inp.nextInt();

        System.out.print("Enter your chemistry grade: ");
        chemistry = inp.nextInt();

        System.out.print("Enter your biology grade: ");
        biology = inp.nextInt();

        System.out.print("Enter your history grade: ");
        history = inp.nextInt();

        System.out.print("Enter your music grade: ");
        music = inp.nextInt();

        int Sumofgrades = mathematics + physics + chemistry + biology + history + music;
        double avarage = Sumofgrades/6;

        System.out.println("YOUR AVARAGE:" + avarage);

        String status = avarage >= 60 ? " YOU PASSED THE ClASS" : "YOU FAILED IN CLASS";

        System.out.println(status);
    }
}