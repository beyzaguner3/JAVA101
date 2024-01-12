import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        double price, taxRate, taxAmount, totalPrice;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Price : ");
        price = inp.nextDouble();
        System.out.println("Price without Taxes : " + price);

        taxRate = (0 <= price && price <= 1000 ) ? 18 : 8;
        System.out.println("Tax Rate : " + "%" + taxRate);

        taxAmount = price * taxRate / 100;
        System.out.println("Tax Amount : " + taxAmount);

        totalPrice = price + taxAmount;
        System.out.println("Price Including Taxes : " + totalPrice);
    }
}
