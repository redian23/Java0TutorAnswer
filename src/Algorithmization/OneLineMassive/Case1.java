package Algorithmization.OneLineMassive;

import java.util.Arrays;
import java.util.Random;

public class Case1 {

    public static void main(String[] args) {
        Random randomPoint = new Random();

        int K = 5; //кратность
        int N = 10;
        int sum = 0;

        int[] arrayInt = new int[N];

        if(N <= 0 | K <= 0){
            System.out.println("Zero pont input");
            System.exit(1);
        }

        for (int u=0; u<arrayInt.length; u++){
            arrayInt[u]= randomPoint.nextInt(100);
        }

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % K == 0) {
                sum += arrayInt[i];
            }
        }

        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Сумма элементов, которые кратны " + K + ", равна " + sum);
        System.out.println();

    }
}
