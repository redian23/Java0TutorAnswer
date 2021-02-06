package Algorithmization.OneLineMassive;

import java.util.Arrays;
import java.util.Random;

public class Case3 {
    public static void main(String[] args) {
        Random randomPoint = new Random();

        int count = 10;
        int[] array = new int[count];
        int positivePoint = 0;
        int negativePoint = 0;
        int zeroPoint = 0;

        for (int u=0; u<array.length; u++){
            array[u]= randomPoint.nextInt(10);
            array[u]= array[u] + randomPoint.nextInt();
        }

        System.out.println(Arrays.toString(array));

        for (double v : array) {
            if (v > 0) {
                positivePoint++;
            } else if (v == 0) {
                zeroPoint++;
            } else {
                negativePoint++;
            }
        }

        System.out.println("В массиве " + positivePoint + " положительных, " + negativePoint + " отрицательных и " + zeroPoint + " нулевых элементов");
    }
}
