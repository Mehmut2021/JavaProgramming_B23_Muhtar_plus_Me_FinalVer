package JavaPractice;

public class PrimeNumber {
    //A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
    public static void main(String[] args) {
        System.out.println("isPrimeNum = " + isPrimeNum(3));


    }

    public static boolean isPrimeNum(int num){

        int a=0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                a++;

            }

        }
        if (a==2){
            return true;
        }
        else {
            return false;
        }
    }
}
