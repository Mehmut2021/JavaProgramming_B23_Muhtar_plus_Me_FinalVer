package day60_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list = list.stream().map( p -> (p%2!=0)?  p*2: p*3  ).collect(Collectors.toList());

        System.out.println("list = " + list);


        System.out.println("------------------------------------------");

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        days = days.stream().map( p ->  p.substring(0,3)  ).collect(Collectors.toList());

        System.out.println(days);

        System.out.println("----------------------------------------");

        List<String> names = new ArrayList<>(Arrays.asList("java", "python", "ruby", "c#", "c++"));
        names = names.stream().map( p -> p.toUpperCase() ).collect(Collectors.toList());

        System.out.println(names);

        System.out.println("-----------------------------------------");

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,4,5,6,7,8,9,10));
        nums = nums.stream().distinct().collect(Collectors.toList());

        System.out.println(nums);

        System.out.println("-------------------------------------");
        Integer[] arr = {1,2,3,4,5,6,1,2,3,4,5,1,2,3,4,5,6};
        arr = Arrays.asList(arr).stream().distinct().collect(Collectors.toList()).toArray(new Integer[0]);

        System.out.println(Arrays.toString(arr) );


        System.out.println("------------------------------------------");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,4,5,6,7,8,9,10));
        numbers= numbers.stream().distinct().filter( p -> p > 5).collect(Collectors.toList());

        System.out.println(numbers);

        System.out.println("--------------------------------------");
        List<String> students = new ArrayList<>();
        students.addAll( Arrays.asList("John Daniel", "Jimmy Jon", "James Bond", "Breanna King", "Shay King", "Josh Bryan", "John Daniel", "John Daniel", "John Daniel", "John Daniel") );

        students = students.stream().distinct().map( p -> p.charAt(0)+"." +p.charAt(p.indexOf(" ")+1) ).collect(Collectors.toList());

        System.out.println(students);





    }


}
