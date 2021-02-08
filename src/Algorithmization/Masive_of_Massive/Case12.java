package Algorithmization.Masive_of_Massive;

import java.util.Arrays;
import java.util.Comparator;

public class Case12 {
    public static void main(String[] args) {

        Integer[][] arr = new Integer[][]{
                {88, 41, 59},
                {42, 94, 71},
                {47, 95, 19} };

        for (Integer[] i : arr) Arrays.sort(i);// по возрастанию
        for (Integer[] j : arr) // по убыванию

            Arrays.sort(j, Comparator.reverseOrder());

        for (Integer[] integers : arr) System.out.println(Arrays.toString(integers));
    }
}

