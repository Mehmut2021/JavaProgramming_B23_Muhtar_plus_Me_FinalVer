package JavaPractice;


public class MaximumNumInArray {
    public static void main(String[] args) {

        int[] arry = {11, 12, 3, 4, 5};
        MaximumNumInArray m = new MaximumNumInArray();
        System.out.println("m.maximum(arry) = " + m.maximum(arry));
        System.out.println("m.min2(arry) = " + m.min2(arry));
    }


    public int maximum(int[] arry) {
        int max = arry[0];


        for (int i = 1; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];
            }
        }
        return max;

    }

    public int maximum2(int[] numbers) {
        int max = Integer.MIN_VALUE;
        //for (int each = 0; each < numbers.length; each++) { }
        for (int each : numbers) {
            if (each > max) {
                max = each;
            }

        }
        return max;
    }


    public static int min(int[] arry) {
        int min = arry[0];

        for (int i = 1; i < arry.length; i++) {
            if (arry[i] < min) {
                min = arry[i];
            }
        }
        return min;
    }

    public int min2(int[] numbers) {
        int min = Integer.MAX_VALUE;
        //for (int each = 0; each < numbers.length; each++) { }
        for (int each : numbers) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }

}