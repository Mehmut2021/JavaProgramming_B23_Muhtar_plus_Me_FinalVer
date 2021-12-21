package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Alala","Bala","Kalala","Dal"));
        System.out.println(sortList(list));
    }



    public static ArrayList<String> sortList(ArrayList<String> list){

        Collections.sort(list);
        return list;
    }
}
