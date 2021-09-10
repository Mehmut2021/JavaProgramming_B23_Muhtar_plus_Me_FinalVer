package day54_Recap;


import day45_Inheritance.employeeTask.Developer;
import day45_Inheritance.employeeTask.Employee;
import day45_Inheritance.employeeTask.Tester;
import java.util.ArrayList;
import java.util.List;

public class WarmUpTask {
    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("John", 'M', 32, 11, "QA", 110000),
                new Developer("Selda", 'F', 27, 12, "Java Developer", 128000),
                new Tester("Robinson", 'M', 28, 10, "SDET", 120000),
                new Developer("Aysu", 'F', 23, 13, "Software Developer", 135000),
                new Tester("Jimmy", 'M', 30, 14, "SDET", 105000),
                new Developer("Gulistan", 'F', 26, 17, "Web Developer", 130000),
                new Tester("Breanna", 'F', 28, 15, "QE", 120000),
                new Developer("Ivana", 'F', 29, 18, "Front-end Developer", 140000),
                new Tester("Shay", 'F', 25, 16, "SDET", 130000),
                new Developer("Sophie", 'F', 26, 10, "Back-end Developer", 150000),
                new Tester("Aaron", 'M', 34, 19, "SDET", 115000),
                new Developer("Ibrahim", 'F', 26, 10, "Full Stack Developer", 142000),
                new Tester("Feruza", 'F', 24, 21, "QE", 125000)
        };

        // store all the developers & testers into the following List of employees
        List<Employee> scrumMembers = new ArrayList<>();


        // store all the testers into the following List of testers:
        List<Tester> testers = new ArrayList<>();


        // store all the developers into the following List of developers
        List<Developer> developers = new ArrayList<>();


        // which tester has the maximum salary?

        // which developer has the maximum salary?




    }
}
