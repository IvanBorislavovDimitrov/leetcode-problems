package codewars.who_likes_it;

public class Solution {

    public static void main(String[] args) {

        System.out.println(whoLikesIt());
    }

    public static String whoLikesIt(String... names) {
        return String.format("%s %s this", getNamesThatLike(names), getSingularOrPluralFormOfLike(names.length));
    }

    private static String getNamesThatLike(String... names) {
        if (names.length == 0) {
            return "no one";
        }
        if (names.length == 1) {
            return names[0];
        }
        if (names.length == 2) {
            return String.format("%s and %s", names[0], names[1]);
        }
        if (names.length == 3) {
            return String.format("%s, %s and %s", names[0], names[1], names[2]);
        }
        return String.format("%s, %s and %d others", names[0], names[1], names.length - 2);
    }

    private static String getSingularOrPluralFormOfLike(int namesLength) {
        return namesLength <= 1 ? "likes" : "like";
    }
}
