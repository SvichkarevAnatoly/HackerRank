package interview.preparation.kit.arrays;

// https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays
public class TwoDArrayDS {

    private static final int N = 6;

    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < N - 2; j++) {
                int hourglassSum = 0;
                hourglassSum += arr[i][j];
                hourglassSum += arr[i][j + 1];
                hourglassSum += arr[i][j + 2];
                hourglassSum += arr[i + 1][j + 1];
                hourglassSum += arr[i + 2][j];
                hourglassSum += arr[i + 2][j + 1];
                hourglassSum += arr[i + 2][j + 2];

                if (hourglassSum > max) {
                    max = hourglassSum;
                }
            }
        }

        return max;
    }
}
