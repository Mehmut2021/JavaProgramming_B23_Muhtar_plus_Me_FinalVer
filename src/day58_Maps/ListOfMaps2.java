package day58_Maps;

import java.time.LocalDate;
import java.util.*;

public class ListOfMaps2 {

    public static void main(String[] args) {

        String[] familyMember = {"John","Kevin","Luke"};
        LocalDate[] DOBFamilyMember = {LocalDate.of(1992,01,02),LocalDate.of(1993,01,03),LocalDate.of(1994,01,04)};

        String[] classMates = {"Jerry","Karim","Merk","Clark"};
        LocalDate[] DOBClassMates = {LocalDate.of(1995,01,05),LocalDate.of(1995,01,06),LocalDate.of(1996,01,07),LocalDate.of(1997,01,8)};

        String[] friends = {"Erik","Kahri","Morh","Jonny"};
        LocalDate[] DOBFriends = {LocalDate.of(1997,01,05),LocalDate.of(1995,01,06),LocalDate.of(1996,01,07),LocalDate.of(1997,01,8)};


        List<Map<String, LocalDate>> listOfMap = new ArrayList<>();
        listOfMap.addAll(Arrays.asList(
                new HashMap<>(), // add family members & their DoB
                new HashMap<>(), // add class mates & their DoB
                new HashMap<>() // add friends & their DoB
        ));

        System.out.println("------------------------------------------");
        // add family members & their DoB into the first Map of listOfMap
        for (int i = 0; i < familyMember.length; i++) {
            listOfMap.get(0).put( familyMember[i], DOBFamilyMember[i]   );
        }

        System.out.println("------------------------------------------");
        // add class mates & their DoB into the second map of listOfMap
        for (int i = 0; i < classMates.length; i++) {
            listOfMap.get(1).put(classMates[i] , DOBClassMates[i]);
        }

        System.out.println("------------------------------------------");
        // add friends & their DoB into the third map of listOfMap
        for (int i = 0; i < friends.length; i++) {
            listOfMap.get(2).put(friends[i], DOBFriends[i]);
        }

        System.out.println("------------------------------------------");

        System.out.println("listOfMap = " + listOfMap);

        System.out.println("------------------------------------------");
        // print the names of the people who were born between 1995 ~ 1997

        for (Map<String, LocalDate> map : listOfMap) {
            for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
                    int birthYear = entry.getValue().getYear();
                    if(birthYear >= 1995 && birthYear <= 1997){
                        System.out.println(entry.getKey());
                    }
            }
        }





    }
}
