package Algorithmization.Masive_of_Massive;

public class Case2 {
    static int height = 3;
    static int weight = 3;

    static void setArray(int[][] mas){
        for ( int i = 0; i < height; i++ ){
            for ( int j = 0; j < weight; j++){
                mas[i][j] = (int)(1 + Math.random() * 10);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    static void printDiag(int[][] mas){
        for ( int i = 0; i < height; i++){
            System.out.print(mas[i][height-1-i]+" ");
        }
    }

    static void replaceMyArray(int[][] mas){
        int[][] newMas = new int[height][weight];
        for ( int i = 0; i < height; i++ ){
            for ( int j = 0; j < weight; j++){
                newMas[i][j] = mas[j][i];
            }
        }
    }
    public static void main(String[] args){

        int[][] array = new int[height][weight];
        setArray(array);
        System.out.println("Print diag");
        printDiag(array);
        System.out.println("Replace Array");
        replaceMyArray(array);
    }
}
