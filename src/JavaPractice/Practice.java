package JavaPractice;

import java.util.*;

public class Practice {

    public static void main(String[] args) {
        boolean isEqual = sameElementCheck("ABCD","ABCCD");
        System.out.println("isEqual = " + isEqual);

        removeDuplicates("AABCD");
        sumOfDigits("a1b2c3");
        FrequencyOfCharacter("AABCD");
        reverse("ABCD");

    }

    //1.
    public static boolean sameElementCheck(String arg1, String arg2) {

        char[] ch1 = arg1.toCharArray();
        char[] ch2 = arg2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    //2.Unique
    public static void removeDuplicates(String st){
        String unique = "";
        String result = "";
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (unique.contains("" + ch)) {
                continue;
            } else {
                unique += "" + ch; //st.charAt(i);  // step1: find the unique
            }
        }
        System.out.println("unique = " + unique);
    }

//3.
    public static void sumOfDigits(String arg1) {
        int sum = 0;

        for (int i = 0; i < arg1.length(); i++) {
            if ('0' <= arg1.charAt(i) && arg1.charAt(i) <= '9') {
                sum += arg1.charAt(i) - 48;
            }
        }
        System.out.println("sum = " + sum);
        //return sum;
    }

    //4.
    public static void reverse(String st){
        String reverse = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            reverse += "" + st.charAt(i);
        }
        System.out.println("reverse = " + reverse);
        
    }



    //5.
    public static void FrequencyOfCharacter(String st) {
        String unique = "";
        String result = "";
       

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (unique.contains("" + ch)) {
                continue;
            } else {
                unique += "" + ch; //st.charAt(i);  // step1: find the unique
            }
        }
        System.out.println("unique = " + unique);

        System.out.println("-----------------------------");

        ////step2: iterate unqiue //frequency of each character
        for (int j = 0; j < unique.length(); j++) {
            char each = unique.charAt(j);
            int count = 0;
            for (int k = 0; k < st.length(); k++) {

                char ch = st.charAt(k);
                if (ch == each) {  // step 3, iterate string and compare it with unique, if equal then frequency increae by 1
                    count++;

                }


            }
            result += each + "" + count;

        }
        System.out.println("Frequency of each characters = " + result);
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


/*
Q1: String -- Frequency of Characters
Write a return method that can find the frequency of characters Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

Q2: String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true 
same("abc",  "abb"); -> false:


 */



/*

       String st = "KAKAWAP";

        String reverse = "";
        String unique = "";
        String result = "";


        System.out.println("-----------------------------");


        //step1:unique character
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (unique.contains("" + ch)) {
                continue;
            } else {
                unique += "" + ch; //st.charAt(i);  // step1: find the unique
            }
        }
        System.out.println("unique = " + unique);

        System.out.println("-----------------------------");

        ////step2: iterate unqiue //frequency of each character
        for (int j = 0; j < unique.length(); j++) {
            char each = unique.charAt(j);
            int count = 0;
            for (int k = 0; k < st.length(); k++) {

                char ch = st.charAt(k);
                if (ch == each) {  // step 3, iterate string and compare it with unique, if equal then frequency increae by 1
                    count++;

                }


            }
            result += each + "" + count;


        }
        System.out.println("Letter frequency = " + result);
        System.out.println("-------------------------------------------");


        String result2 = "";
        String unique2 = "";
        // Collections.frequency();
        for (String ch : new LinkedHashSet<>(Arrays.asList(st.split("")))) { // ch: non-duplicated characters ==> a b c d e
            result2 += ch + Collections.frequency(Arrays.asList(st.split("")), ch);
            unique2 += "" + ch;
        }
 */