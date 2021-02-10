package Programming_with_class;

import java.util.Scanner;

public class Test3 {
    String s = ". Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение\n" +
            "на единицу в заданном диапазоне. " +
            "Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. " +
            "Счетчик имеет методы увеличения и уменьшения состояния, и метод\n" +
            "позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.";
    static Scanner in = new Scanner(System.in);

    static int actualPoint = 0;

    static int startPoint = 1;
    static int endPoint = 10;

    static void getDiapozonPoint(int n, int m){
        for (int i=n; i<=m;i++ ){
            if(n>startPoint || m<endPoint){
                System.out.print(i+ " ");
          }
        }
    }
    static void checker (){
        for (int i=startPoint; i<=endPoint;i++ ){
            if (i == actualPoint){
                System.out.println("Actual point -> " + i);
            }
            System.out.println("Iteration № - " + i);
            System.out.println(i+ " ");
        }
    }

    static void inpupMethod(){
        System.out.print("Input start point -> ");
        startPoint = in.nextInt();

        System.out.print("Input end point -> ");
        endPoint = in.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("1.Default point\n" +
                "2.Set new points\n"+
                "What are you choice: " );
        int choice = in.nextInt();

        switch (choice){
            case(1):
                System.out.println("Choiced default values");
                break;
            case(2):
                System.out.println("Input new points:");
                inpupMethod();
                break;
        }
        System.out.println("Start point of check = " + startPoint);
        System.out.println("End point of check = " + endPoint);

        getDiapozonPoint(2,8);
    }
}
