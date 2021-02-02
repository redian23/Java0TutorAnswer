package Basics_of_software_code_development.Branching;

public class Case4 {
    public static void main(String[] args) {
        int     A = 10,
                B = 10;

        int     x = 1,
                y = 2,
                z = 3;

        if(     (x>A)|| (x>B)
                ||
                (y>A)|| (y>B)
                ||
                (z>A)|| (z>B) ) {
            System.out.println("Не выходит");
        }else {
            System.out.println("Входит");
        }
    }
}

