package JavaPractice;

public class UniqueIntegerSumsUpToZero {

    public static void main(String[] args) {
        SumUpToZero(9);


    }


    public static int[] SumUpToZero(int N){
        int[] result = new int[N];
        int Sum = 0;
        for (int i=0; i<N-1; i++){
            result[i]=i;
            Sum += i;
        }
        result[N-1]=-Sum;
        return result;

    }
}
