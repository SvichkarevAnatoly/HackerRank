package interview.preparation.kit.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TwoDArrayDSTest {

    @Test
    public void test0() {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0},
        };

        int max = TwoDArrayDS.hourglassSum(arr);

        assertEquals(max, 19);
    }
}