package leetcode.longest.common.prefix;

public class Solution {

    public static void main(String[] args) {
        String[] arr = {"dog","racecar","car"};
        System.out.println(new Solution().longestCommonPrefix(arr));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder(strs[0]);
        boolean allMatch;
        do {
            allMatch = true;
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].startsWith(prefix.toString())) {
                    allMatch = false;
                    prefix.deleteCharAt(prefix.length() - 1);
                    break;
                }
            }
        } while (!allMatch);
        return prefix.toString();
    }
}
