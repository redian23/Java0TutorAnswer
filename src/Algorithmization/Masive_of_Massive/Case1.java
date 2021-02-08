package Algorithmization.Masive_of_Massive;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Case1 {
    public static void main(String[] args) {
        Random randomPoint = new Random();

        int n = 10;
        int m = 10;

        int[][]array = new int[n][m];
        for (int i=0;i < 10;i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = randomPoint.nextInt(100);
            }
        }

        IntStream.range(0, n).forEach(i -> {
            array[i][i] = 1;
            array[i][9 - i] = 1;
        });

        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
    }
}
