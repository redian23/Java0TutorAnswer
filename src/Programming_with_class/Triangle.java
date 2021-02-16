package Programming_with_class;

public class Triangle {
    String task = " Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления\n" +
            "площади, периметра и точки пересечения медиан.";
    static double saidA;
    static double saidB;
    static double saidC;
    static double P,S;


    Triangle(int A,int B, int C){
        saidA = A;
        saidB = B;
        saidC = C;
        System.out.println("Triangle with said ->"
                + " Said A: " + saidA + ";"
                +  " Said B: " + saidB+ ";"
                + " Said A: " + saidC+ ";");
    }

    static void getArea(){
       P = (saidA+saidB+saidC) / 2;
        System.out.println(P);
    }

    static void getS(){
        S = Math.sqrt(P*(P-saidA)*(P-saidB)*(P-saidC));
        System.out.println(S);
    }

    static void getMedians(){
        double med =  (saidA + saidB + saidC) / 3;
        System.out.println(med);
    }

    public static void main(String[] args) {
        new Triangle(20,10,20);
        System.out.print("Area -> ");
        getArea();
        System.out.print("S -> ");
        getS();
        System.out.print("MEd -> ");
        getMedians();
    }
}
