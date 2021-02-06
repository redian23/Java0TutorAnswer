package Algorithmization.OneLineMassive;
import java.util.Random;

public class Case5 {
    public static void main(String[] args) {

        Random randomPoint = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = randomPoint.nextInt(10);
            if (array[i] > i) {
                    System.out.println("array[" + i + "] = " + array[i]);
            }
        }
    }
}
