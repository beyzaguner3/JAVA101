public class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int originalNumber = i;
            int digitNumber = 0;
            int result = 0;

            while (i != 0) {
                i /= 10;
                digitNumber++;
            }

            i = originalNumber; //

            while (originalNumber != 0) {
                int number = originalNumber % 10;
                int m = 1;

                for (int k = 1; k <= digitNumber; k++) {
                    m *= number;
                }
                originalNumber /= 10;
                result += m;
            }

            originalNumber = i;

            if (result == originalNumber) {
                System.out.println(originalNumber);
            }
        }
    }
}