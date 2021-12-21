package JavaPractice;

import java.util.Arrays;

public class ArrayConcat {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        int[] b={6,7,8,9,10};
        concatArrays(a,b);
        conArray(a,b);
    }

    public static void concatArrays(int[] a, int[] b){
        int[] newArry = new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            newArry[i]=a[i];
        }
        for (int i = 0; i <b.length ; i++) {
            newArry[a.length+i]=b[i];
        }
        System.out.println("Arrays.toString(newArry) = " + Arrays.toString(newArry));

    }

    public static int[] conArray(int[] a, int[] b){

        int[] c = new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i]=b[i];
        }

        return c;
    }
}



//Array -- Concat two arrays
//Write a return method that can concatenate two arrays