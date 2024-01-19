import java.util.Scanner;
public class ActivityRecommendationAccordingToTemperature {
    public static void main(String[] args) {
        double heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a temperature value : ");
        heat = input.nextDouble();

        if( heat < 5 ){
            System.out.println("You can go skiing!");
        }else if ((heat >= 5) && (heat < 10 )){
            System.out.println("You can go to the cinema!");
        }else if ((heat >= 10) && (heat <= 15)){
            System.out.println("You can go to the cinema!");
            System.out.println("You can go on a picnic");
        }else if ((heat > 15) && (heat <= 25)){
            System.out.println("You can go on a picnic");
        }else if (heat > 25){
            System.out.println("You can go swimming");
        }
    }
}
