package interview.preparation.kit.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LeftRotationTest {

    @Test
    public void test0() {
        int a[] = new int[]{1, 2, 3, 4, 5};
        a = LeftRotation.rotLeft(a, 2);

        assertEquals(a, new int[]{3, 4, 5, 1, 2});
    }

    @Test
    public void test1() {
        int a[] = new int[]{
                41, 73, 89, 7, 10,
                1, 59, 58, 84, 77,
                77, 97, 58, 1, 86,
                58, 26, 10, 86, 51};
        a = LeftRotation.rotLeft(a, 10);

        assertEquals(a, new int[]{
                77, 97, 58, 1, 86,
                58, 26, 10, 86, 51,
                41, 73, 89, 7, 10,
                1, 59, 58, 84, 77});
    }

    @Test
    public void test2() {
        int a[] = new int[]{1, 2, 3, 4};
        a = LeftRotation.rotLeft(a, 2);

        assertEquals(a, new int[]{3, 4, 1, 2});
    }

    @Test
    public void test3() {
        int a[] = new int[]{1, 2, 3, 4};
        a = LeftRotation.rotLeft(a, 1);

        assertEquals(a, new int[]{2, 3, 4, 1});
    }

    @Test
    public void test4() {
        int a[] = new int[]{1, 2, 3, 4};
        a = LeftRotation.rotLeft(a, 4);

        assertEquals(a, new int[]{1, 2, 3, 4});
    }

    @Test
    public void test5() {
        int a[] = new int[]{98, 67, 35, 1, 74, 79, 7, 26, 54, 63, 24, 17, 32, 81};
        a = LeftRotation.rotLeft(a, 7);

        assertEquals(a, new int[]{26, 54, 63, 24, 17, 32, 81, 98, 67, 35, 1, 74, 79, 7});
    }
}