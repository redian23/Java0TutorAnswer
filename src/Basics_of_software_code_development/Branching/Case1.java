package Basics_of_software_code_development.Branching;

public class Case1 {
    public static void main(String[] args) {
        double radian1 = 70;
        double radian2 = 60;
        double radian3;

        radian3 = 180 - (radian1+radian2);

        double summRadian= radian1 + radian2 + radian3;

        if (summRadian>180 || radian3<=0 ){
            System.out.println("Sum radian dont to be most 180` or 3th radian dont must be negative or zero");
            System.exit(1);
        } if (radian3 == 60){
            System.out.println("Rectangular triangle");
        }
    }
}
