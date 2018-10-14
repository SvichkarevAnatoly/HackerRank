package interview.preparation.kit.warm.up.challenges;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CountingValleysTest {

    @Test
    public void testExample() {
        String s = "DDDUUUUDD";

        int valleysNumber = CountingValleys.countingValleys(s.length(), s);

        assertEquals(valleysNumber, 1);
    }

    @Test
    public void test0() {
        String s = "UDDDUDUU";

        int valleysNumber = CountingValleys.countingValleys(s.length(), s);

        assertEquals(valleysNumber, 1);
    }
}