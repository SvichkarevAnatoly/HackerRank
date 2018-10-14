package interview.preparation.kit.warm.up.challenges;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RepeatedStringTest {

    @Test
    public void test0() {
        assertEquals(RepeatedString.repeatedString("aba", 10), 7);
    }

    @Test
    public void test1() {
        assertEquals(RepeatedString.repeatedString("a", 1000000000000L), 1000000000000L);
    }
}