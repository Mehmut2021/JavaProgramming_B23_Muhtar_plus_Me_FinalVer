package day59_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new LinkedHashMap<>(); // employeeId & jobTitle
        map1.put(11, "SDET");
        map1.put(12, "SM");
        map1.put(13, "BA");
        map1.put(14, "Developer");
        map1.put(15, "PO");

        Map<String, LocalDate> map2 = new LinkedHashMap<>(); // employeeName & HireDate
        map2.put("Mehmet", LocalDate.of(2019,4,19));
        map2.put("Tugba", LocalDate.of(2020,6,25));
        map2.put("Ismail", LocalDate.of(2018,7,5));
        map2.put("Alexandru", LocalDate.of(2017,9,13));
        map2.put("Kadir", LocalDate.of(2016,9,10));


        Map< Map<Integer, String> , Map<String, LocalDate> > mapMap = new LinkedHashMap<>();
        mapMap.put(map1, map2);

        System.out.println(mapMap);
        System.out.println("----------------------------------------------");

        for (Map.Entry<Map<Integer, String>, Map<String, LocalDate>> mapMapEntry : mapMap.entrySet()) {

            for (Map.Entry<Integer, String> entry1 : mapMapEntry.getKey().entrySet()) {
                System.out.println(entry1.getValue());
            }

            System.out.println("----------------------------------------------");
            for (String name : mapMapEntry.getValue().keySet()) {
                System.out.println(name);
            }

        }

        System.out.println("-------------------------------------------------");

       // Map< Map<Map<Integer, String>, Map<Integer, String>> , Map<Map<String, LocalDate>, Map<String, LocalDate>> > mapMapMap = new LinkedHashMap<>();



    }
}
