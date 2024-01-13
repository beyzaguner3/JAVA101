import java.util.Scanner;
public class CalculateAverage2 {
    public static void main(String[] args) {
        int mathematics, physics, chemistry, english, biology;
        double sumOfGrades = 0, average;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your mathematics grade : ");
        mathematics = input.nextInt();

        System.out.print("Please enter your physics grade : ");
        physics = input.nextInt();

        System.out.print("Please enter your chemistry grade : ");
        chemistry = input.nextInt();

        System.out.print("Please enter your english grade : ");
        english = input.nextInt();

        System.out.print("Please enter your biology grade : ");
        biology = input.nextInt();

        if (mathematics < 0 || mathematics > 100) {
        } else {
            sumOfGrades += mathematics;
        }
        if (physics < 0 || physics > 100 ){
        } else {
            sumOfGrades += physics;
        }
        if (chemistry < 0 || chemistry > 100 ){
        } else {
            sumOfGrades += chemistry;
        }
        if (english < 0 || english > 100 ) {
        } else {
            sumOfGrades += english;
        }
        if (biology < 0 || biology > 100){
        } else {
            sumOfGrades += biology;
        }
        average = sumOfGrades / 5;

        System.out.println("Sum of grades : " + sumOfGrades);
        System.out.println("Your average : " + average);

        if (average >= 55){
            System.out.println("Congratulations you passed the class!");
        } else {
            System.out.println("Unfortunately you did not pass the class!");
        }
    }
}
