package day58_Maps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapsPractice {

    public static void main(String[] args) {

        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Ibrahim",95);
        students.put("Merve",90);
        students.put("John",72);
        students.put("Daniela",70);
        students.put("Akbar",89);
        students.put("Nazli",81);
        students.put("Yasin",850);
        students.put("Halil",95);
        students.put("Nemo",85);
        students.put("Yuliaa",80);
        students.put("Stranger",45);
        students.put("Atila",90);
        students.put("Marina",100);
        students.put("Joe",70);
        students.put("Smith",80);
        students.put("Sabir",95);

        System.out.println(students);

        System.out.println("----------------------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
                   if(entry.getValue() < 80){
                       System.out.println(entry.getKey());
                   }
        }

        System.out.println("------------------------------------------------");
        List<String> earlyBirds = new ArrayList<>(); // >= 85
        List<String> angryBirds = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if(entry.getValue() >= 85){
                earlyBirds.add( entry.getKey() );
            }else{
                angryBirds.add(entry.getKey());
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        System.out.println("------------------------------------------------------------------");

        Map<String, LocalDate> classMates = new LinkedHashMap<>();
        classMates.put("Ahmad",LocalDate.of(1987,10,10));
        classMates.put("Gulistan",LocalDate.of(1986,9,1));
        classMates.put("Kristina",LocalDate.of(1979,4,5));
        classMates.put("Somebody",LocalDate.of(1977,12,16));
        classMates.put("Nazli",LocalDate.of(1990,7,9));
        classMates.put("Aykut",LocalDate.of(1994,5,19));
        classMates.put("Abbos", LocalDate.of(1979,4,10));
        classMates.put("Yuliang", LocalDate.of(1973,2,12));
        classMates.put("Ibrahim", LocalDate.of(1970,3,25));
        classMates.put("Feruza", LocalDate.of(1993,1,28));
        classMates.put("Ahmet", LocalDate.of(1974,4,23));
        classMates.put("Ismail", LocalDate.of(1975,6,14));
        classMates.put("Zorana", LocalDate.of(1992,8,20));
        classMates.put("Mehmet", LocalDate.of(1993,9,13));
        classMates.put("Yuliia", LocalDate.of(1994,3,22));
        classMates.put("Yasin", LocalDate.of(1976,5,15));
        classMates.put("Meltem", LocalDate.of(1996,6,14));
        classMates.put("Dilem", LocalDate.of(1997,2,17));
        classMates.put("Davut", LocalDate.of(1998,4,16));
        classMates.put("Ekaterina", LocalDate.of(1993,7,15));
        classMates.put("Mehmut", LocalDate.of(1979,8,14));
        classMates.put("Merve", LocalDate.of(1995,12,11));
        classMates.put("Tamara", LocalDate.of(1996,6,10));

        for (Map.Entry<String, LocalDate> entry : classMates.entrySet()) {
            if(entry.getValue().isBefore(LocalDate.of(1980,1, 1)) ){
                System.out.println(entry.getKey());
            }
        }


        System.out.println("----------------------------------------------------");

        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Canada", "Ottowa");
        countries.put("Russia", "Moscow");
        countries.put("The Czech Republic", "Prague");
        countries.put("España", "Madrid");
        countries.put("Germany", "Berlin");
        countries.put("Turkey", "Ankara");

        System.out.println(countries);

        for (String capitals : countries.values()) {
            System.out.println(capitals);
        }

        System.out.println("---------------------------------------------");

        for (String country : countries.keySet()) {
            System.out.println(country);
        }



    }

}

/*
Tasks:
    1. create a map that can contain student name and student' score
            put 5 of your friends names and their scores
            print out the names of the students who made less than 80

    2. create a map that can contains name and Date Of Birth.
            put 5 of your classmates' names and their date of birth
            print out the names of the students who were born before 1980 January 1st

    3. create a map that can contain names of countries and their capitals
                use for each loop to print out all the capitals
 */