package JavaPractice;

import java.util.Arrays;

public class passwordVarify {

    public static void main(String[] args) {
       boolean aaa= varifyPassword("Abc1@23");
        System.out.println("aaa = " + aaa);
       // maxNumArr();
    }

    public static boolean varifyPassword(String password){

    boolean isLengthAndSpace = false;
    boolean oneUpperCase = false;
    boolean oneLowerCase = false;
    boolean oneSpecialCase = false;
    boolean oneDigit = false;


        if (password.length()>=6 && !password.contains(" ")){
        isLengthAndSpace = true;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i))){
                oneUpperCase = true;
            }else if (Character.isLowerCase(password.charAt(i))){
                oneLowerCase = true;
            }else if (!Character.isLetterOrDigit(password.charAt(i))){
                oneSpecialCase = true;
            }else if(Character.isDigit(password.charAt(i))){
                oneDigit = true;
            }

        }
    }

        return isLengthAndSpace && oneUpperCase && oneLowerCase && oneSpecialCase && oneDigit;
}
    /* Q2. Array -- Find Maximum
     * Write a method that can find the maximum number from an int Array.
     */
    public static void maxNumArr(int[] arr){
        Arrays.sort(arr);
        System.out.println("The maximum number in the given array: " +arr[arr.length-1]);
    }


    /* Q3. Array -- Find Minimum
     *  Write a method that can find the maximum number from an int Array.
     */
    public static void minNumArr(int[] arr){
        Arrays.sort(arr);
        System.out.println("The minimum number in the given array: "+arr[0]);
    }
}
