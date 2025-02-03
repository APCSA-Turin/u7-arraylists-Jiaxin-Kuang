import java.util.ArrayList;

public class UsedCarLot{
    ArrayList<Car> carLot = new ArrayList<>();
    public UsedCarLot(){
    }
    /* Adds a Car to the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1
        PRECONDITION: 0 <= indexToAdd < inventory.size()
        DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
        like you did the other addCar method; also note that this method is void
    */
    public ArrayList<Car> getInventory(){
        return carLot;
    }

    public void addCar(Car carToAdd){
        carLot.add(carToAdd);
    }

    public void addCar(int indexToAdd, Car carToAdd){
        carLot.add(indexToAdd, carToAdd);
    }      
    
      /* "sells" the Car located at indexOfCarToSell which
          removes it from the inventory list and shifts the remaining
          Cars in the inventory list to the left to fill in the gap;
          this method reduces the size of inventory by 1
        
          Returns the Car that is being "sold" (removed from lot)
        
          PRECONDITION: indexOfCarToSell < inventory.size()
        
          HINT: the ArrayList remove() method returns the removed element while also
                removing it from the ArrayList
        */
      public Car sellCarShift(int indexOfCarToSell) {
        Car removedCar = carLot.get(indexOfCarToSell);
        carLot.remove(indexOfCarToSell);
        return removedCar;
      }
    
      /* "sells" the Car located at indexOfCarToSell,
         but instead of removing it and shifting the inventory
         list to the left, REPLACE the Car at indexOfCarToSell
         with NULL, thus creating an "empty parking spot" on the lot;
         this method does NOT reduce the size of inventory by 1
      
         PRECONDITION: indexOfCarToSell < inventory.size()
      
         This method returns the Car that is being "sold" (replaced with null)
       */
      public Car sellCarNoShift(int indexOfCarToSell) {
        Car removedCar = carLot.remove(indexOfCarToSell);
        for(int i = indexOfCarToSell; i < carLot.size() - 1; i ++){
            carLot.add(indexOfCarToSell, carLot.get(indexOfCarToSell + 1));
        }
        return removedCar;
      }
    
      /* moves Car out of index indexOfCarToMove and moves it to destinationIndex;
         when the Car first gets moved out of indexOfCarToMove, all cars to the
         right should shift one index to the left; when the Car then gets moved into
         destinationIndex, the Car currently at that index and all Cars to the right
         of that index should shift one to the right
        
         PRECONDITIONS: indexOfCarToMove < inventory.size()
                        destinationIndex < inventory.size()
       */
      public void moveCar(int indexOfCarToMove, int destinationIndex) {
        Car moveCar = carLot.get(indexOfCarToMove);
        carLot.remove(indexOfCarToMove);
        carLot.add(destinationIndex, moveCar);  
     }
}