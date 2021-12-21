package JavaPractice;

import java.util.Arrays;

public class practiceWeek2 {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        int[] c ={1,0,2,0,3,0,4,0};
        //arrayConcatination([1,2,3,4,5],[6,7,8,9,10]);
        arrayConcatination(a,b);
        moveZerosTOeND(c);

    }

    public static void arrayConcatination(int[] a, int[] b){
        int[] newArry = new int[a.length+b.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            newArry[i]=a[i];
        }
        for (int j = 0; j <b.length ; j++) {
            newArry[a.length+j] = b[j];
        }
        System.out.println("newArry.toString() = " + Arrays.toString(newArry));
    }

    public static void moveZerosTOeND(int[] a){

        int count = 0;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] !=0) {
                b[count++] = a[i];
            }
        }
        for (int i = count; i < a.length; i++) {
            a[count]=0;
        }
        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
    }
}
