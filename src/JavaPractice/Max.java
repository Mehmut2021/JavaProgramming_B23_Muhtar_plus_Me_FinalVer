package JavaPractice;

public class Max {
    public static int main(String[] args) {

        int[] arry= {1,2,3,4,5};

        int max = arry[0];


        for (int i = 1; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];
            }
        }
        return max;




    }
}
