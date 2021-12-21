package JavaPractice;

import java.util.Arrays;

public class ArrayMove0ToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4};
        zerosToEnd(arr);
    }


    public static void zerosToEnd(int[] arry) {

        int count = 0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] != 0) {
                arry[count++] = arry[i];

            }

        }
        for (int i = count; i < arry.length; i++) {
            arry[i] = 0;
        }
        System.out.println("Arrays.toString(arry) = " + Arrays.toString(arry));
    }


}


/*

Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]



 */