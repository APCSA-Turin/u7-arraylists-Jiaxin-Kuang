import java.util.Arrays;
import java.util.ArrayList;

public class CarRunner2 {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang", 12500);
        Car car2 = new Car("Camry", 8400);
        Car car3 = new Car("Ram", 17200);
        Car car4 = new Car("Accent", 1980);
        Car car5 = new Car("Cruiser", 10500);
        Car[] Cars = {car1, car2, car3, car4, car5};
        ArrayList<Car> CarsList = new ArrayList<Car>(Arrays.asList(Cars));
        System.out.println(CarsList);
    }
}
