package Algorithmization.OneLineMassive;

import java.util.Arrays;
import java.util.Random;

public class Case2 {
    public static void main(String[] args) {

        Random randomPoint = new Random();
        double[] array = new double[10];
        double number = 4.3;
        int count = 0;

        for (int u=0; u<array.length; u++){
            array[u]= randomPoint.nextDouble()*10;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                array[i] = number;
                count++;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Количество замен: " + count);
    }
}
