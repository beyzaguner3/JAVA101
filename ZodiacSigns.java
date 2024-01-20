import java.util.Scanner;
public class ZodiacSigns {
    public static void main(String[] args) {
        String month;
        int day;
        Scanner input = new Scanner (System.in);

        System.out.println("Please enter the month of your birth : ");
        month = input.nextLine();

        System.out.print("Please enter the day of the month you were born : ");
        day = input.nextInt();

        if (month.equals("January")){
            if (day <= 21){
                System.out.println("Your zodiac sign is Capricorn");
            }else {
                System.out.println("Your zodiac sign is Aquarius");
            }
        }else if (month.equals("February")){
            if (day <= 19){
                System.out.println("Your zodiac sign is Aquarius");
            }else {
                System.out.println("Your zodiac sign is Pisces");
            }
        }else if (month.equals("March")){
            if (day <= 20){
                System.out.println("Your zodiac sign is Pisces");
            }else {
                System.out.println("Your zodiac sign is Aries");
            }
        }else if(month.equals("April")){
            if (day <= 20){
                System.out.println("Your zodiac sign is Aries");
            }else {
                System.out.println("Your zodiac sign is Taurus");
            }
        }else if (month.equals("May")){
            if (day <= 21){
                System.out.println("Your zodiac sign is Taurus");
            }else{
                System.out.println("Your zodiac sign is Gemini");
            }
        }else if (month.equals("June")){
            if (day <= 22){
                System.out.println("Your zodiac sign is Gemini");
            }else{
                System.out.println("Your zodiac sign is Cancer");
            }
        }else if (month.equals("July)")){
            if (day <= 22) {
                System.out.println("Your zodiac sign is Cancer");
            }else{
                System.out.println("Your zodiac sign is Leo");
            }
        }else if (month.equals("August")){
            if (day <= 22){
                System.out.println("Your zodiac sign is Leo");
            }else {
                System.out.println("Your zodiac sign is Virgo");
            }
        }else if (month.equals("September")){
            if(day <= 22){
                System.out.println("Your zodiac sign is Virgo");
            }else{
                System.out.println("Your zodiac sign is Libra");
            }
        }else if (month.equals("October")){
            if(day <= 22 ){
                System.out.println("Your zodiac sign is Libra");
            }else{
                System.out.println("Your zodiac sign is Scorpio");
            }
        }else if (month.equals("November")){
            if(day <= 21){
                System.out.println("Your zodiac sign is Scorpio");
            }else {
                System.out.println("Your zodiac sign is Sagittarius");
            }
        }else if (month.equals("December")){
            if(day <= 21){
                System.out.println("Your zodiac sign is Sagittarius");
            }else{
                System.out.println("Your zodiac sign is Capricorn");
            }
        }
    }
}
