package Algorithmization.OneLineMassive;

import java.util.Arrays;
import java.util.Random;

public class Case7 {

    public static double max(double[] arr) {
        double max = Double.MIN_VALUE;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            max = Double.max(max, arr[i] + arr[j]);
        }
        return max;
    }

    public static void main(String[] args) {
        Random randomPoint = new Random();
        double[] array = new double[10];

        for (int u = 0; u < array.length; u++) {
            array[u] = randomPoint.nextInt(100);
        }

        System.out.println(max(array));
        System.out.println(Arrays.toString(array));
    }
}
