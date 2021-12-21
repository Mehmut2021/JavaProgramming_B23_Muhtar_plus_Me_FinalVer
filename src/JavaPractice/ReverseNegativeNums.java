package JavaPractice;

//Write a return method that can reverse negative number and return it as int
public class ReverseNegativeNums {
    public static void main(String[] args) {
        System.out.println("reverse = " + reverse(-122));

    }

    public static int reverse(int num) {

        int reversed = 0;
        while(num !=0) {

            reversed = reversed *10 + num % 10;
            num = num/10;

        }
        return reversed;
    }


}
