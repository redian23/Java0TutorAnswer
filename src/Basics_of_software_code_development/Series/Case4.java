package Basics_of_software_code_development.Series;

import java.math.BigDecimal;

public class Case4 {

    public static void main(String[] args) {
        int[] array = new int[200];

        for (int i = 1, k = 0; i <= 200; i++, k++) {
            array[k] = i * i;
        }
        BigDecimal product = BigDecimal.ONE;
        for (int i = 0; i < 200; i++) {
            product = product.multiply(BigDecimal.valueOf(array[i]));
        }
        System.out.println(product);
    }
}
