package Basics_of_software_code_development.Branching;

public class Case3 {
    public static void main(String[] args) {
        int pointX1 =1;
        int pointY1 =2;
        int pointX2 =2;
        int pointY2 =2;
        int pointX3 =3;
        int pointY3 =2;

        if (pointX1==pointX2 && pointX2 ==pointX3 && pointX1 == pointX3){
            System.out.println("Points Xx Equalise");
        }if(pointY1==pointY2 && pointY2 ==pointY3 && pointY1 == pointY3){
            System.out.println("Points Yx Equalise");
        }if (   pointX1==pointX2 && pointX2 ==pointX3 && pointX1 == pointX3 &&
                pointY1==pointY2 && pointY2 ==pointY3 && pointY1 == pointY3 ){
            System.out.println("Used ONE BLEAT POINT ");
        }
    }
}
