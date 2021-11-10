package day60_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {

        //not a nata structure, its sort of method with all characters of data structures

List<String> names = new ArrayList<>(Arrays.asList("java","python","ruby","c#","c++"));

names = names.stream().map(e-> e.toUpperCase()).collect(Collectors.toList());
        System.out.println("names = " + names);

        System.out.println("================================");
        Integer[]arr = {1,2,3,4,3,2,5,6,7,8,9,5,2,1};
        arr=Arrays.asList(arr).stream().distinct().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("=========================================");
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,4,5,6,7,8,9,10));
        nums = nums.stream().distinct().filter(e->e>5).collect(Collectors.toList());
        System.out.println("nums = " + nums);

        System.out.println("===============================");
        List<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("John Daniel","Jimmy Jon","James Bond","Breanna King","Shay King","Josh Bryan"));
students = students.stream().map(e->e.charAt(0)+"."+e.charAt(e.indexOf(" ")+1)).collect(Collectors.toList());
        System.out.println("students = " + students);
    }

}
