package day60_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces {

    public static void main(String[] args) {

        Predicate<Integer> isEven = p-> p%2==0 ? true :false;

        boolean r1  = isEven.test(101);
        System.out.println("r1 = " + r1);


        Predicate<String> isPalindrome = p-> {
            String reverse = new StringBuilder(p).reverse().toString();
            return  reverse.equalsIgnoreCase(p);
        };
        boolean r2 = isPalindrome.test("Cydeo");
        System.out.println("r2 = " + r2);


        System.out.println("========================================");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Predicate<Integer> isOdd = p -> {
            if (p%2!=0){
                return true;
            }else {
                return false;
            }
        };
        list.removeIf(isOdd);

        System.out.println("list = " + list);

        System.out.println("====================");

        list.removeIf(p-> p%2!=0);
        System.out.println("list = " + list);

        System.out.println("==================================");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Kaak","Bala","Dala","Daad"));
        names.removeIf(p->new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));
        System.out.println("names = " + names);


    }
}
