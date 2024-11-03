public class isPalindrome {
    static boolean isPalindrome(int number){
        int temp = number;
        int reversedNumber = 0;
        int lastDigit;
        while(temp != 0){
            lastDigit = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            temp /= 10;
        }
        return (number == reversedNumber);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(345676543));
        System.out.println(isPalindrome(456));

    }
}