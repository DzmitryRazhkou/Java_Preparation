package temp.car_design;

import java.util.ArrayList;

public class TestDrive {
    public static void main(String[] args) {

        CarDesign tesla_y = new CarDesign("Tesla", "Blue");
        System.out.println(tesla_y.name+ ": " + tesla_y.price+ "$. " +tesla_y.isElectric);

        ArrayList<String> cadi_Features = new ArrayList<>();
        cadi_Features.add("Auto Parking");
        cadi_Features.add("Sun Roof");
        cadi_Features.add("Line Assist");
        cadi_Features.add("Rear Camera");

        CarDesign cadi = new CarDesign("Cadillac","Black", 65000, 12.237, false, 'Y', cadi_Features);
        System.out.println(cadi_Features.get(0));

    }
}
