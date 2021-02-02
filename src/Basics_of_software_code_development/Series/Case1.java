package Basics_of_software_code_development.Series;

import java.util.Scanner;

public class Case1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");

        int number = sc.nextInt();

        if (number<0){
            System.out.println("Negative number");
            System.exit(1);
        }

        int sum = 0;
        for (int i=1; i<= number; i++){
            sum = sum + i;
        }

        // int sum = IntStream.rangeClosed(1, number).sum();
        System.out.println (sum);
    }
}
