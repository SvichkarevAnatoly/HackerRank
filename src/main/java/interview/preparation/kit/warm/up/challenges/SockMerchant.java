package interview.preparation.kit.warm.up.challenges;

public class SockMerchant {

    public static int sockMerchant(int n, int[] ar) {
        final int valueRange = 101;

        int[] counters = new int[valueRange];
        for (int element : ar) {
            counters[element]++;
        }

        int pairNumber = 0;
        for (int counter : counters) {
            pairNumber += counter / 2;
        }
        return pairNumber;
    }
}
