package Algorithmization.OneLineMassive;

import java.util.Arrays;
import java.util.Random;

public class Case4 {
    public static void main(String[] args) {
        Random randomPoint = new Random();

        int[] array = new int[10];
        int minIndex = 0;
        int maxIndex = 0;
        int min,max;

        min = array[0];
        max = array[9];

        for (int u=0; u<array.length; u++){
            array[u]= randomPoint.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.println(Arrays.toString(array));
    }
}
