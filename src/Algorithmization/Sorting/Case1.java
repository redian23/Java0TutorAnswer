package Algorithmization.Sorting;

public class Case1 {
    public static void main(String[] args) {
        int k=3;
        int count = 0;
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] b = new int[]{7, 8, 9, 0};

        int[] sum = new int[(a.length+b.length)];
        for (int i = 0; i < sum.length; i++) {
            if ((k) > i){
                sum[i] = a[i];
            }else if (count < k) {
                sum[i] = b[count];
                count++;
            }else
                sum[i] = a[i - k - 1];
        }
        for (int x : sum){
            System.out.print(x+"|");
        }
    }
}
