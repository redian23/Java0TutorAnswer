package Basics_of_software_code_development.Series;

public class Case3 {
    public static void main(String[] args) {

        double sum = 0;
        for (int i=1; i<= 100; i++){
            sum = sum + Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
