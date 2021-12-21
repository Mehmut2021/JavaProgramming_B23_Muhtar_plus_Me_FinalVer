package JavaPractice;

import java.util.Arrays;

public class moveZeroToEnd {
    public static void main(String[] args) {

        int[] a = {1,0,2,0,3,0,4,0};
        movetZerosToend(a);

    }

    public static void movetZerosToend(int[] a){

        int count= 0;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] !=0){
                b[count++]=a[i];
            }
        }


        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
    }


}


/*
Array -- Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]

 */