package day60_Functional_Interface;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        //create a function that can merge two strings

        StringsFunction mergeTwoStrings = (s1, s2)-> {return s1+s2;};

        String word1 = "Wooden";
        String word2 = "Spoon";

        String result1 = mergeTwoStrings.function(word1,word2);

        System.out.println("result1 = " + result1);


        //create a function that can return the longest string

        StringsFunction longestString = (f, s)->{
            if (f.length()>s.length()){
                return f;
            }else {
                return s;
            }
        };
       String result2 = longestString.function("CyberTek","Cydeo");
        System.out.println("result2 = " + result2);

        //Create a fuction that can return the initials of  aperson. ex:Wooden Spoon

        StringsFunction initials = (f, l)-> f.charAt(0)+ "."+l.charAt(1);

        String result3 = initials.function("CyberTek","School");
        System.out.println("result3 = " + result3);


        System.out.println("====================================");

        DataFunction<String> firstThreeCahrs = s-> s.substring(0,3);

        String s4 = firstThreeCahrs.accept("Wooden Spoon");
        System.out.println("s4 = " + s4);

        DataFunction<Integer> cube = (n)->n*n*n;
        int r3 = cube.accept(5);
        System.out.println("r3 = " + r3);
    }
}
