package interview.preparation.kit.warm.up.challenges;

public class CountingValleys {

    public static int countingValleys(int n, String s) {
        int seaLevel = 0;
        int valleyCounter = 0;

        for (char move : s.toCharArray()) {
            if (move == 'U') {
                if (seaLevel == -1) {
                    valleyCounter++;
                }
                seaLevel++;
            } else {
                seaLevel--;
            }
        }

        return valleyCounter;
    }
}
