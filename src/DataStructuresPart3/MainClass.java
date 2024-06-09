package DataStructuresPart3;

import java.util.*;

import static DataStructuresPart3.Car.yearWithMostCars;
import static DataStructuresPart3.GetElements.findCommonElements;

public class MainClass {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(3);
        set2.add(6);

        Set<Integer> commonElements = findCommonElements(set1, set2);

        System.out.println("Common Elements: " + commonElements);


        // Year with most cars

        Map<Integer, List<Car>> carMap = new HashMap<>();
        List<Car> cars2020 = new ArrayList<>();
        cars2020.add(new Car("BMW"));
        cars2020.add(new Car("Mercedes"));
        cars2020.add(new Car("Honda"));
        carMap.put(2019, cars2020);

        List<Car> cars2022 = new ArrayList<>();
        cars2022.add(new Car("Toyota"));
        cars2022.add(new Car("Honda"));
        cars2022.add(new Car("BMW"));
        cars2022.add(new Car("Audi"));
        carMap.put(2022, cars2022);

        int yearWithMostCars = yearWithMostCars(carMap);
        System.out.println("Year with most cars is " + yearWithMostCars);


    }
}
