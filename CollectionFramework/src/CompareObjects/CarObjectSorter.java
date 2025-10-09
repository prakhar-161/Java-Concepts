package CompareObjects;

import java.util.Arrays;

public class CarObjectSorter {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];
        carArray[0] = new Car("SUV", "petrol");
        carArray[1] = new Car("Sedan", "diesel");
        carArray[2] = new Car("Hatchback", "cng");

        Arrays.sort(carArray, (Car obj1, Car obj2) -> obj2.carType.compareTo(obj1.carType)); // obj2 - obj1

        for(Car car : carArray) {
            System.out.println(car.carName + "..." + car.carType);
        }
    }
}
