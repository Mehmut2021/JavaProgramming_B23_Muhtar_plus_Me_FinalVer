package JavaPractice;

public class Reverse {
    public static void main(String[] args) {

       resersing("ABCD");



    }


    public static void resersing(String st){
        String reverse="";
        for (int i = st.length()-1; i >=0 ; i--) {
            reverse+=st.charAt(i);

        }
        System.out.println("reverse = " + reverse);


    }
}
