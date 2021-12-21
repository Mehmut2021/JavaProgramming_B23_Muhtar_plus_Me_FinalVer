package JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class permunation {
    public static void main(String[] args) {
        char [] chars = {'a','b','c'};

        //System.out.println("permutation(chars) = " + permutation(chars));

        for (String eachline : permutation(chars)) {
            System.out.println(eachline);
        }

    }

    public static List<String> permutation(char[] array){
        List <String> allCombos = new ArrayList<>();

        for (char firstCharacter : array) {
            for (char secondCharacter : array) {
                if (firstCharacter == secondCharacter){
                    continue;
                }else {
                    for (char thirdCharacter : array) {
                        if (firstCharacter == thirdCharacter || secondCharacter == thirdCharacter){
                            continue;
                        }
                        allCombos.add(firstCharacter+", " + secondCharacter+", " + thirdCharacter);
                    }
                }
            }
        }


        return  allCombos;
    }
}
