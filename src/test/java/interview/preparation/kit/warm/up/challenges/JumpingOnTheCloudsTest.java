package interview.preparation.kit.warm.up.challenges;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JumpingOnTheCloudsTest {

    @Test
    public void test0() {
        int[] c = new int[]{0, 0, 1, 0, 0, 1, 0};

        int jumps = JumpingOnTheClouds.jumpingOnClouds(c);

        assertEquals(jumps, 4);
    }

    @Test
    public void test1() {
        int[] c = new int[]{0, 0, 0, 0, 1, 0};

        int jumps = JumpingOnTheClouds.jumpingOnClouds(c);

        assertEquals(jumps, 3);
    }
}