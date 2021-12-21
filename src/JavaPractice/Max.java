package JavaPractice;

public class Max {
    public static void main(String[] args) {
        int[] arry= {1,20,3,4,5};

        int max = arry[0];


        for (int i = 1; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];
            }
        }
        System.out.println("max = " + max);


    }
}
