package Algorithmization.OneLineMassive;

import java.util.Arrays;
import java.util.Random;

public class Case8 {
    public static int[] deleteMinValue(int[] array) {

        if (array.length == 0) {
            throw new IllegalArgumentException("Zero Massive");
        }

        int minCount = 0;
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];

            }
        }

        for (int value : array) {
            if (value == min) {
                minCount++;
            }
        }

        int[] result = new int[array.length - minCount];

        int indexResult = 0;
        for (int j : array) {
            if (j != min) {
                result[indexResult] = j;
                indexResult++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Random randomPoint = new Random();
        int[] array = new int[10];

        for (int u = 0; u < array.length; u++) {
            array[u] = randomPoint.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(deleteMinValue(array)));
    }
}
