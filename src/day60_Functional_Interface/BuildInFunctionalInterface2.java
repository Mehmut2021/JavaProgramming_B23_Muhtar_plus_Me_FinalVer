package day60_Functional_Interface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class BuildInFunctionalInterface2 {

    public static void main(String[] args) {
      // create a function that can reverse a string
        Function<String, String> reverse = (s) ->  new StringBuilder(s).reverse().toString() ;

        String r1 = reverse.apply("Wooden Spoon");


     // create a function that can check if the string is palindrome
        Function<String, Boolean> isPalindrome = s -> {
            String r = reverse.apply(s);
            return s.equalsIgnoreCase(r);
        };

        boolean r2 = isPalindrome.apply("Anna");


    // create a function that can return the maximum number from array of integers
        Function<Integer[], Integer> maxNumFromArray = arr -> {
            Arrays.sort(arr);
        return arr[arr.length-1];
        };
       Integer[] arr = {1,2,3,4,5};
        maxNumFromArray.apply(arr);


    // create a function that can return the maximum number from arraylist of integers
    Function<ArrayList<Integer>, Integer> maxNumFromArrayList = list -> {
        Collections.sort(list);
        return list.get( list.size()-1 );
    };

    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        maxNumFromArrayList.apply(list);


    System.out.println("---------------------------------------------------------");
        // forEach
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 95000);
        map.put("Jimmy", 100000);
        map.put("Josh", 105000);
        map.put("Daniel", 120000);
        map.put("Aaron", 115000);

        map.forEach( (k,v) ->  System.out.println(k+" : "+v) );

        System.out.println("--------------------------------------------------");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("-----------------------------------------------");
        // create a function that can repeat the given string for the given number of times
        BiConsumer<String, Integer> printMultipleTimes = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };

        printMultipleTimes.accept("Java", 10);


    }

}
