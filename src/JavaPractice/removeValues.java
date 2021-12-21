package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeValues {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,11,55,112,222));
        System.out.println("After removed = " + removedNums2(list));


    }
    public static List<Integer> removedNums(List<Integer> nums){
         List<Integer> removed = new ArrayList<>();
        for (int each:nums) {
            if (each>100){
                continue;
            }
            removed.add(each);

        }
        nums.removeIf(num -> num>100);
        return nums;
        }

    public static List<Integer> removedNums2(List<Integer> nums) {
        List<Integer> removed = new ArrayList<>();
        for (int each : nums) {
            if (each > 100) {
                continue;
            }
            removed.add(each);

        }
        return removed;
    }
    }
