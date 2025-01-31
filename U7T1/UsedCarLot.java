package U7T1;

import java.util.ArrayList;

public class UsedCarLot {
    ArrayList<Car> inventory = new ArrayList();
    public UsedCarLot(){
    }
    public ArrayList getInventory(){
        return inventory;
    }
    public void addCar(Car car){
        inventory.add(car);
    }
    public boolean swap(int number1, int number2){
        if(number1 < inventory.size() && number2 < inventory.size()){
            Car value1 = inventory.get(number1);
            Car value2 = inventory.get(number2);
            inventory.set(number1, value2);
            inventory.set(number2, value1);
            return true;
        }
        return false;
    }
}
