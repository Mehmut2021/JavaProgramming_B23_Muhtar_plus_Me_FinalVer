package day58_Maps;

public class TestEnum {

    public static void main(String[] args) {

     //   String browser = "Cydeo";

        Browser browser = Browser.chrome;

        switch (browser){

            case firefox:
                System.out.println("Firefox driver is selected");
                break;

            case edge:
                System.out.println("Edge driver is selected");
                break;

            case  safari:
                System.out.println("Safari driver is selected");
                break;

            case  opera:
                System.out.println("Opera driver is selected");
                break;

            default:
                System.out.println("Chrome driver is selected");
        }

        System.out.println("-------------------------------");

   //     String level = "Java";

        Level level = Level.Akbar;

        System.out.println("-------------------------------------");

     //   String month = "Python";
     //   byte a = 129;
        Month month = Month.December;

        System.out.println("----------------------------------------");

        String color1 = "Pink";
        Color color2 = Color.red;



    }

}
