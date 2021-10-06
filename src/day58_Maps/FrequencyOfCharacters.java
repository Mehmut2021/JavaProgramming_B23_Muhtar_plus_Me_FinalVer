package day58_Maps;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str =  "aabbbccccdddddeeee";

        Map<String, Integer> frequencyOfChars = new LinkedHashMap<>();

        for (String each : str.split("")) { // each: a, a, b, b, b, c, c, c, c, d, d, d, d, d
            frequencyOfChars.put( each,  Collections.frequency( Arrays.asList( str.split("") )  , each ) );
        }

        System.out.println(frequencyOfChars);


        System.out.println("------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>( frequencyOfChars.values() );
        Collections.sort(list);
        int second = list.get(list.size()-2);

        System.out.println(second);

        System.out.println("--------------------------------------------");
        // find the character that has the second largest character:
        for (Map.Entry<String, Integer> entry : frequencyOfChars.entrySet()) {
            if(entry.getValue() == second){
                System.out.println(entry.getKey());
            }
        }



    }


}
/*
str = "aabbbccccddddd"

{a=2, b=3, c=4, d=5}



 */
