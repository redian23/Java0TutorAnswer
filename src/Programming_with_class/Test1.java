package Programming_with_class;

public class Test1 {
    static int firstVariable = 5;
    static int secondVariable = 4;


    static void editVariable(int v1, int v2){
        firstVariable = v1;
        secondVariable = v2;
    }
    static Integer getSum(){
        return firstVariable + secondVariable;
    }

    static void printVariables(){
        System.out.println("FIRST VARIABLE -> " + firstVariable);
        System.out.println("SECOND VARIABLE -> " + secondVariable);
    }
    static int biggestVariable(){
       return Math.max(firstVariable,secondVariable);
    }
    public static void main(String[] args) {
        printVariables();
        System.out.println("Biggest variable = "+ biggestVariable());
        editVariable(5,8);
        System.out.println("Sum = " + getSum());

    }
}
