import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        int yearOfBirth;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your birth year : ");
        yearOfBirth = input.nextInt();

        if(yearOfBirth % 12 == 0){
            System.out.println("Your Chinese zodiac is `Monkey`");
        }else if(yearOfBirth % 12 == 1){
            System.out.println("Your Chinese zodiac is `Rooster`");
        }else if(yearOfBirth % 12 == 2){
            System.out.println("Your Chinese zodiac is `Dog`");
        }else if(yearOfBirth % 12 == 3){
            System.out.println("Your Chinese zodiac is `Pig`");
        }else if(yearOfBirth % 12 == 4){
            System.out.println("Your Chinese zodiac is `Rat`");
        }else if(yearOfBirth % 12 == 5){
            System.out.println("Your Chinese zodiac is `Ox`");
        }else if(yearOfBirth % 12 == 6){
            System.out.println("Your Chinese zodiac is `Tiger`");
        }else if(yearOfBirth % 12 == 7){
            System.out.println("Your Chinese zodiac is `Rabbit`");
        }else if(yearOfBirth % 12 == 8){
            System.out.println("Your Chinese zodiac is `Dragon`");
        }else if(yearOfBirth % 12 == 9){
            System.out.println("Your Chinese zodiac is `Snake`");
        }else if(yearOfBirth % 12 == 10){
            System.out.println("Your Chinese zodiac is `Horse`");
        }else if(yearOfBirth % 12 == 11){
            System.out.println("Your Chinese zodiac is `Goat`");
        }


    }
}
