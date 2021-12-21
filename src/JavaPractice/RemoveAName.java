package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAName {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Akbas","Kokbas","Ahmed"));
        System.out.println(remove2(names));


    }

    public static List<String> remove2(List<String> names) {
        names.remove("Ahmed");
        return names;
    }
}
