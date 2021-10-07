package day60_Functional_Interface;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterface3 {

    public static void main(String[] args) {
        // create a function for anagram strings
        BiPredicate<String, String> anagram = (a, b) -> {
            char[] ch1 =a.toCharArray();
            char[] ch2 =b.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1, ch2);
        };

        boolean r1 = anagram.test("abc", "cab");
        System.out.println("r1 = " + r1);

        System.out.println("-----------------------------------------");
                                            //{1,2,3}, 4
        BiPredicate<int[], Integer> contains = (arr, n) -> {
            for (int each : arr) {
                if(each == n)
                    return true;
            }

            return false;
        };

        int[] arr ={100,200, 300, 400};
        boolean r2 = contains.test(arr, 100);
        System.out.println("r2 = " + r2);

        System.out.println("-------------------------------------");
        // create a function that can merge two integer arrays into a List
        BiFunction<int[], int[], List<Integer>>  mergeArraysIntoList = (a, b) -> {

            List<Integer> list = new ArrayList<>();

            for (int each : a)
                list.add(each);

            for (int each : b)
                list.add(each);

            return list;
        };

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9};

        List<Integer> l =mergeArraysIntoList.apply(arr1,arr2);

        System.out.println("l = " + l);

        System.out.println("------------------------------------------------------------");

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> addListsToMap = (a, b) ->{
            Map<String, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < a.size(); i++) {
                map.put(a.get(i), b.get(i));
            }
            return map;
        };

        List<String> names = new ArrayList<>(Arrays.asList("John", "Daniel", "James"));
        List<Integer> salaries = new ArrayList<>(Arrays.asList(100000,120000, 115000));

        Map<String, Integer> employees = addListsToMap.apply(names, salaries);

        System.out.println(employees);

        System.out.println("---------------------------------------");

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        nums.forEach( p -> System.out.println(p));
       // nums.forEach( System.out::println );



    }

}
