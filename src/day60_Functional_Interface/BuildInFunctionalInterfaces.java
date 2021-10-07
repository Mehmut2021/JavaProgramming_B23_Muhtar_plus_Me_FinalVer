package day60_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces {

    public static void main(String[] args) {

        // create a function that can check if the number is even
        Predicate<Integer>  isEven = p -> p%2==0 ? true : false;

        boolean r1 = isEven.test(101);
        System.out.println("r1 = " + r1);

        // create a function that can check if a string is palindrome

     /*
        DataFunction<String> reverseString = (s) ->  new StringBuilder(s).reverse().toString();
        Predicate<String> isPalindrome = p ->  reverseString.accept(p).equalsIgnoreCase(p);
      */

        Predicate<String> isPalindrome = p -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        boolean r2=isPalindrome.test("Cydeo");
        System.out.println("r2 = " + r2);

        System.out.println("---------------------------------------------------");
        // removeIf(Predicate)

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       /*
        Predicate<Integer> isOdd = p -> {
            if (p%2!= 0){
             return true;
            }else{
                return false;
            }
        };

        list.removeIf(isOdd);

        */

        list.removeIf( p -> p%2!=0  ) ;
        System.out.println("list = " + list);

        System.out.println("-----------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Level", "Josh", "Breanna", "Shay", "Racecar"));

        names.removeIf( isPalindrome );
        System.out.println("names = " + names);


        System.out.println("--------------------------------------------------------------");

       // create a function that can print the string 3 times
        Consumer<String> printThreeTimes = s -> System.out.println(s+s+s);

        printThreeTimes.accept("Cybeo");

        // create a function that cna print each characters of a list of string
        Consumer<List<String>> printEach = l -> {
            for (String each : l) {
                System.out.println(each);
            }
        };

        printEach.accept(names);

        System.out.println("----------------------------------");
        // forEach()
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        numbers.forEach( n -> System.out.println(n*2) );

        /*
        for (Integer each : numbers) {
            System.out.println(each*2);
        }
    */

        System.out.println("-------------------------------------");
        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Cydeo", "Wooden Spoon", "Wooden Spoon"));

        // print each unique elements
        Predicate<String> isUnique = p -> Collections.frequency(words, p) == 1;

        words.forEach( p -> { if(isUnique.test(p)) System.out.println(p); });


        System.out.println("---------------------------------------------------");
        // create function that can print array of integers in descending order

        Consumer<int[]> printInDescendingOrder = n -> {
            Arrays.sort(n);
            for (int i = n.length - 1; i >= 0; i--) {
                System.out.print(n[i]+" ");
            }
            System.out.println();
        };

        int[] arr = {10, 11, 9, 8, 7, 12, 3,4,5,6,1,100};
        printInDescendingOrder.accept(arr);

        System.out.println("----------------------------------------------------");

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        nums.forEach( (e)->{ if(e%2!=0) System.out.println(e); } );

        /*
        List<WebElements> elements = driver.findElements();
        elements.forEach(p -> p.click() );

         */






    }


}
