public class PrimeNumbersFrom1To100 {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;
        System.out.println("Numbers between from 1 to 100");
        for (int i = begin; i <= end; i++){

            if (isPrime(i)){

                System.out.println(i + " ");
            }

        }
    }
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}


