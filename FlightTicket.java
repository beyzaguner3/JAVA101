import java.util.Scanner;
public class FlightTicket {
    public static void main(String[] args) {
        double km,price,preisPerKm = 0.10;
        int age,typeOfTrip;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the distance of your trip in km : ");
        km = input.nextDouble();

        if (km < 0){
            System.out.println("You entered incorrectly!");
        }

        System.out.print("Please enter your age : ");
        age = input.nextInt();

        if (age < 0){
            System.out.println("You entered incorrectly!");
        }

        System.out.print("Please enter the trip type (1 if one way and 2 if round trip) : ");
        typeOfTrip = input.nextInt();

        if ((typeOfTrip != 1) && (typeOfTrip != 2)){
            System.out.println("You entered incorrectly!");
        }

        price = km * preisPerKm;
        System.out.println("Total price without discount " + price);


        if (age < 12){
            price *= 0.50;
        } else if ((age >= 12) && (age <= 24)){
            price *= 0.90;
        } else if (age > 65){
            price *= 0.70;
        }

        if (typeOfTrip == 2){
            price *= 1.6;
        }
        System.out.println("Total price with discount : " + price);
    }
}
