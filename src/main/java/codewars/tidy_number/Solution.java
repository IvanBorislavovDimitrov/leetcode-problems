package codewars.tidy_number;

public class Solution {

    public static void main(String[] args) {
        System.out.println(tidyNumber(1230));
    }

    public static boolean tidyNumber(int number) {
        long reversedNumber = reverseNumber(number);
        while (!isOneDigitNumber(reversedNumber)) {
            long prev = reversedNumber % 10;
            reversedNumber /= 10;
            long curr = reversedNumber % 10;
            if (prev > curr) {
                return false;
            }
        }
        return true;
    }

    private static boolean isOneDigitNumber(long number) {
        return number / 10 == 0;
    }

    private static long reverseNumber(long number) {
        long result = 0;
        while (number != 0) {
            result *= 10;
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}
