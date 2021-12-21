package JavaInterviewCodingTasksByMuhtar;

public class Array_FindMinimum {

    public static void main(String[] args) {

        int[] a  = {1,2,3,4,5,6};
        System.out.println("Min(a) = " + Min(a));

    }
    public static int Min(int[] arr){

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];

            }

        }
        return min;
    }
}
