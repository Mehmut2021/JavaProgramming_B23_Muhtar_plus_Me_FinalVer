package JavaInterviewCodingTasksByMuhtar;

public class Array_FirstUniqueElement {
    public static void main(String[] args) {

        int[] a = {1,1,2,3,3,4,4,5,5};
        System.out.println("unique(a) = " + unique(a));

    }

    public static int unique(int[] arr){
        int unique = 0;


        for (int i = 0; i < arr.length; i++) {
            int frequency = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                   frequency++;

                }
            }
            if (frequency==1){
                unique = arr[i];
            }

        }
        return unique;
    }

}
