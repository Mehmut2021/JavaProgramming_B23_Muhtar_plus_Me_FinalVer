package JavaInterviewCodingTasksByMuhtar;

import java.util.Arrays;

public class Array_FindMax {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        //System.out.println("Array_FindMax.Max(arr) = " + Array_FindMax.Max(arr));
        System.out.println("Max(arr) = " + Max(arr));

    }

    public static int Max(int[] arr){

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];

            }

        }
        return max;
    }
}
