package interview.preparation.kit.warm.up.challenges;

public class RepeatedString {

    public static long repeatedString(String s, long n) {
        int countInS = 0;
        int partCount = 0;

        long remainInS = n % s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countInS++;
            }
            if (i == remainInS) {
                partCount = countInS;
            }
        }

        return countInS * (n / s.length()) + partCount;
    }
}
