import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100); //100 -> Üst sinir
        //int number = (int) (Math.random() * 100); // Math sinifi kullanilarak da yapilabilir.

        Scanner scan = new Scanner(System.in);
        int chance = 0;
        int selected;
        int[] wrongGuess = new int[5];
        boolean isWin = false;
        boolean isMistake = false;
        System.out.println(number);

        while(chance < 5){
            System.out.print("Enter your guessed number : ");
            selected = scan.nextInt();

            if(selected < 0 || selected > 99){
                System.out.println("Please enter a number between 0 and 99!");
                if(isMistake){
                    chance++;
                    System.out.println("Your remaining chances : " + (5 - chance));
                }else{
                    isMistake = true;
                    System.out.println("If you enter a number outside the range of 0 to 100 one more time, one of your chances will be reduced.");
                }
                continue;
            }
            if(selected == number){
                System.out.println("congratulations you guessed the number correctly!!");
                isWin = true;
                break;
            }else{
                wrongGuess[chance] = selected;
                chance++;
                System.out.println("You guessed the number incorrectly:((");
                if(selected > number){
                    System.out.println(selected + " is greater than the hidden number");
                }else{
                    System.out.println(selected + " is less than the hidden number");
                }
                System.out.println("your remaining guess right : " + (5 - chance));

            }
        }
        if(!isWin){
            System.out.println("You lost !");
            System.out.println("Your guessed numbers : " + Arrays.toString(wrongGuess));
        }

    }
}
