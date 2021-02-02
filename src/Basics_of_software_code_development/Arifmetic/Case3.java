package Basics_of_software_code_development.Arifmetic;

public class Case3 {
    static double x,y;
    static double result;

    public static void main(String[] args) {

        x = 30;
        y = 60;

    result= (Math.sin(x)+ Math.cos(y)) /
            ( Math.cos(x) - Math.sin(y)) * Math.tan(x*y);

        System.out.println(result);
    }
}
