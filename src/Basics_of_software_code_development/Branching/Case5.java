package Basics_of_software_code_development.Branching;

public class Case5 {

    static double result;

    public static void main(String[] args) {

        for (int x=0;x<10;x++){
            if (x<=3){
                result= Math.pow(x,2)-3*x + 9;
                System.out.println(result);
            }else {
                result = 1/(Math.pow(x,3)+6);
                System.out.println(result);
            }
        }
    }
}
