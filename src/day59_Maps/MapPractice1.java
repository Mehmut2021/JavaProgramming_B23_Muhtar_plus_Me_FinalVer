package day59_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {
        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));

        System.out.println("-----------------------------------------------------");
        //Display the names of the employees who were hired before 2015

        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
             if(entry.getValue().isBefore(LocalDate.of(2015,1,1))){
                 System.out.println( entry.getKey());
             }
        }

        System.out.println("----------------------------------------------------");

        // display the name of the employee who were hired on 5/15/2020

        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
            if(entry.getValue().isEqual(LocalDate.of(2020,5,15))){
                System.out.println(entry.getKey());
            }
        }

        System.out.println("------------------------------------------------");
        //How many people were hired after 2014?
        int count = 0;

        for (LocalDate hireDate : map.values()) {
           // if(hireDate.isAfter(LocalDate.of(2014,12,31))){ }
            if(hireDate.getYear() > 2014){
                count++;
            }
        }

        System.out.println("count = " + count);

        System.out.println("------------------------------------------------");
        // display the name and hire date of the employee (keySet() & get())

        for (String k : map.keySet()) {
            System.out.println(k +" : "+map.get(k));
        }



    }

}
/*
        1. Display the names of the employees who were hired before 2015 (entrySet())
        2. display the name of the employee who were hired on 5/15/2020 (entrySet())
        3. How many people were hired after 2014? (values())
        4. display the name and hire date of the employee (keySet() & get())

 */
