package interview.preparation.kit.warm.up.challenges;

public class JumpingOnTheClouds {

    public static int jumpingOnClouds(int[] c) {
        int jumps = 0;

        int i = 0;
        while (i < c.length - 2) {
            if (c[i + 2] == 0) {
                i += 2;
            } else {
                i++;
            }
            jumps++;
        }

        if (i != c.length - 1) {
            jumps++;
        }

        return jumps;
    }
}
