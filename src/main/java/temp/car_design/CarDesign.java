package temp.car_design;

import java.util.ArrayList;

public class CarDesign {

    String name;
    String color;
    int price;
    double mileage;
    boolean isElectric;
    char isAvailable;
    ArrayList<String> features;

    public CarDesign(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public CarDesign(String name, String color, int price, char isAvailable) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public CarDesign(String name, String color, int price, double mileage, boolean isElectric, char isAvailable, ArrayList<String> features) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        this.isElectric = isElectric;
        this.isAvailable = isAvailable;
        this.features = features;
    }
}
