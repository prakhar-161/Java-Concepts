package CompareObjects;
// uses CarNameComparator class to sort

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarObjectListSorter {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("suv", "petrol"));
        cars.add(new Car("sedan", "diesel"));
        cars.add(new Car("hatchback", "cng"));

        Collections.sort(cars, new CarNameComparator());

        cars.forEach((Car carObj) -> System.out.println(carObj.carName + "..." + carObj.carType));
    }
}
