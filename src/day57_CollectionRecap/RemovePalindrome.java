package day57_CollectionRecap;

//import utilities.StringUtility;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemovePalindrome {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch23"));

        Iterator<String> it= list.iterator(); //in order to remove from collection, We MUST apply Iterator

        while(it.hasNext()){

            String each = it.next(); // getting access to each objects
            String reverse = "";
            for (int i = each.length()-1; i >= 0; i--) {
               reverse += each.charAt(i);
            }
            if(each.equalsIgnoreCase(reverse)){ // if the string object is palindrome
                it.remove();
            }

        }

        System.out.println(list);


        System.out.println("---------------------------------------------------------------");

        List<String> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList("Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch23"));

       // list2.removeIf( p -> StringUtility.isPalindrome(p));

        System.out.println(list2);

    }

}

/*
1. write a program that can remove the palindrome string from a list of String
			DO NOT use Lambda expressions
 */