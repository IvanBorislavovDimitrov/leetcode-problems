package leetcode.string_to_integer;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().myAtoi("  +  413"));
    }

    public int myAtoi(String s) {
        StringBuilder result = new StringBuilder();
        char[] str = s.toCharArray();
        char sign = '+';
        boolean isSignChanged = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ' && result.length() == 0) {
                if (isSignChanged) {
                    return 0;
                }
                continue;
            }
            if (isCharacterDigit(str[i])) {
                result.append(str[i]);
                if (Long.parseLong(result.toString()) > Integer.MAX_VALUE || Long.parseLong(result.toString()) * -1 < Integer.MIN_VALUE) {
                    return parse(result, sign);
                }
                continue;
            }
            if (result.length() == 0 && (str[i] == '+' || str[i] == '-') && !isSignChanged) {
                isSignChanged = true;
                sign = str[i];
                continue;
            }
            break;
        }
        return parse(result, sign);
    }

    private int parse(StringBuilder result, char sign) {
        if (result.length() == 0) {
            return 0;
        }
        long number = Long.parseLong(result.toString());
        if (sign == '-') {
            number *= -1;
        }
        if (number > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (number < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) number;
    }

    private boolean isCharacterDigit(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }
}
