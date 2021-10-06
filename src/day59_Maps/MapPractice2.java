package day59_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");
        employeeMap.put("Griffy", "M");
        employeeMap.put("Shanon", "F");
        employeeMap.put("Chuck", "M");
        employeeMap.put("Rickard", "M");

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().equals("F")){
                employeeMap.replace(entry.getKey(), "Female" );
            }
            if(entry.getValue().equals("M")){
                employeeMap.replace(entry.getKey(), "Male" );
            }
        }

        System.out.println("employeeMap = " + employeeMap);

        System.out.println("--------------------------------------------");

        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("Female")){
                System.out.println(name);
            }
        }


    }
}

/*
        1. Update the 'M' to Male and 'F' to Female (replace(k, newValue))
        2. Display the names of all female employees
 */