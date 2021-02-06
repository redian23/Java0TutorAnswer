package Algorithmization.OneLineMassive;

import java.util.Arrays;
import java.util.Random;

public class Case6 {

    public static void main(String[] args) {
        Random randomPoint = new Random();
        int[] simpleArray= {0,1,2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
        int[] array = new int[10];

        for (int u=0; u<array.length; u++) {
            array[u] = randomPoint.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        int simpleNumb = 0;
        int sumSimpleNumb = 0;

        for (int i = 0; i < array.length; i++)
        {
            int a = array[i];
            for (int k : simpleArray) {
                if (a == k) {
                    System.out.print(a + " ");
                    simpleNumb++;
                    sumSimpleNumb = simpleNumb + i;
                    break;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Simple numbers on massive " + simpleNumb);
        System.out.println("Sum Simple numbers on massive " + sumSimpleNumb);
    }
}

// Спасибо это задаче.
// Только благодаря ей я 2 раза обрел "провсетление", потратил 4 часа и 3кг нервных клетов.
// Но я ее победил!