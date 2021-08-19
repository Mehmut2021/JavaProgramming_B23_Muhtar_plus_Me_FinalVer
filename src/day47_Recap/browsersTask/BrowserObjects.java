package day47_Recap.browsersTask;

public class BrowserObjects {

    public static void main(String[] args) {
        Chrome chrome = new Chrome(); // opens chrome browser
        chrome.open();
        chrome.close();

        System.out.println("-------------------------------------");

        FireFox firefox = new FireFox(); // opens firefox browser
        firefox.open();
        firefox.close();

        System.out.println("-------------------------------------");

        Opera opera = new Opera(); // opens the opera browser
        opera.open();
        opera.close();


    }

}
