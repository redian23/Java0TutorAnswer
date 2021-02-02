package Basics_of_software_code_development.Arifmetic;

public class Case2 {
    static Double a,b,c;
    static Double result;

    public static void main(String[] args) {
        a=1.0;
        b=5.0;
        c=6.0;

        result = (b+ Math.sqrt(Math.pow(b,2) + 4*a*c))/(2*a)-
                (Math.pow(a,3)*c)+ Math.pow(b,-2) ;

        System.out.println(result);
    }
}
