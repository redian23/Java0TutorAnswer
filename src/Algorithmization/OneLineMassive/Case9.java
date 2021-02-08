package Algorithmization.OneLineMassive;

import java.util.Arrays;
import java.util.Random;

public class Case9 {
    public static int getMostPopularNumber(int[] data) {
        int[] popular = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            for (int datum : data) {
                if (data[i] == datum) {
                    popular[i]++;
                }
            }
        }

        int valResult = data[0];
        int popResult = popular[0];
        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popResult) {
                popResult = popular[i];
                valResult = data[i];
            }
            if ((popResult == popular[i]) && (data[i] < valResult)) {
                valResult = data[i];
            }
        }
        return valResult;
    }

    public static void main(String[] args) {
        Random randomPoint = new Random();
        int[] array = new int[10];

        for (int u = 0; u < array.length; u++) {
            array[u] = randomPoint.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Popular number-> " + getMostPopularNumber(array));
    }
}