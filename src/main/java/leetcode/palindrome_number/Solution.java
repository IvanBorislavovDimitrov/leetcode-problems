package leetcode.palindrome_number;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(-121));
    }

    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        return number.equals(reverseMe(number));
    }

    private String reverseMe(String str) {
        StringBuilder result = new StringBuilder(str.length());
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            result.append(chars[i]);
        }
        return result.toString();
    }
}
