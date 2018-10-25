package interview.preparation.kit.arrays;

// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays
public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        while (d != 0) {
            for (int i = d; i > 0; i--) {
                if (isCoprime(a.length, i)) {
                    rotLeftStep(a, i);
                    d -= i;
                    break;
                }
            }
        }

        return a;
    }

    // algorithm eratosthenes
    static boolean isCoprime(int a, int b) {
        for (int gcd = a; ; gcd = b, b = a % b, a = gcd) {
            if (b == 0) {
                return gcd == 1;
            }
        }
    }

    private static int[] rotLeftStep(int[] a, int d) {
        int tmpIntex = 0;
        int tmp = a[tmpIntex];
        int tmp2;

        for (int i = 0; i < a.length; i++) {
            tmpIntex = (tmpIntex + a.length - d) % a.length;
            tmp2 = a[tmpIntex];
            a[tmpIntex] = tmp;
            tmp = tmp2;
        }

        return a;
    }
}
