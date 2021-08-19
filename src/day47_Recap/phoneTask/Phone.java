package day47_Recap.phoneTask;

public class Phone {
    private final String brand;
    private final String model;
    private final String size;
    private String color;
    private double price;

    public final static boolean isTouchScreen  ;
    public final static boolean hasSimCard ;

    static{
        isTouchScreen = true;
        hasSimCard = true;
    }

    public Phone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price){
        if(price < 0){
            return;
        }
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
