package DataStructuresPart3;

import java.util.List;
import java.util.Map;

public class Car {
    private String brand;
    public Car(String brand) {
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }


    public static int yearWithMostCars(Map<Integer, List<Car>> carMap) {
        int maxCount = Integer.MIN_VALUE;
        int yearWithMostCars = -1;

        for (Map.Entry<Integer, List<Car>> entry : carMap.entrySet()) {
            int year = entry.getKey();
            List<Car> cars = entry.getValue();
            int carCount = cars.size();
            if (carCount > maxCount) {
                maxCount = carCount;
                yearWithMostCars = year;
            }
        }

        return yearWithMostCars;
    }


}

