package leetcode.reverse.an.integer;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().reverse(1534236469));
    }

    public int reverse(int x) {
        int newInteger = 0;
        int multiplier = 10;
        while (x != 0) {
            int currNum = x % 10;
            newInteger *= multiplier;
            newInteger += currNum;
            x /= 10;
        }
        return newInteger;
    }

}
