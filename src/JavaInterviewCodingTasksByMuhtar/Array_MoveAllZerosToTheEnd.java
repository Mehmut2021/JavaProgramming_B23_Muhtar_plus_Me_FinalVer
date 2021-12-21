package JavaInterviewCodingTasksByMuhtar;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {
    public static void main(String[] args) {
        int[] a = {1,2,0,3,0,4,0,5};
        moveZeroToEnd(a);
    }

    public static void moveZeroToEnd(int[] a){
        int[] result = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] !=0){
                result[count++]=a[i];
            }

        }
        System.out.println(Arrays.toString(result));
    }
}
