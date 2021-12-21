package JavaInterviewCodingTasksByMuhtar;

import java.util.Arrays;

public class Array_MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        mergeArray(a,b);

    }
    public static void mergeArray (int[] a, int[] b){

        int[] c = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i]= b[i];
        }
        System.out.println(Arrays.toString(c));


    }
}
