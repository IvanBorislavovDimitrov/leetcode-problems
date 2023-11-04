package leetcode.roman.to.integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
    }

    private Map<Character, Integer> symbolsToNumbers = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        char[] romanSymbols = s.toCharArray();
        int result = symbolsToNumbers.get(romanSymbols[romanSymbols.length - 1]);
        if (romanSymbols.length == 1) {
            return result;
        }
        char prev = romanSymbols[romanSymbols.length - 1];
        for (int i = romanSymbols.length - 2; i >= 0; i--) {
            if (symbolsToNumbers.get(romanSymbols[i]) < symbolsToNumbers.get(prev)) {
                result -= symbolsToNumbers.get(romanSymbols[i]);
            } else {
                result += symbolsToNumbers.get(romanSymbols[i]);
            }
            prev = romanSymbols[i];
        }

        return result;
    }

}