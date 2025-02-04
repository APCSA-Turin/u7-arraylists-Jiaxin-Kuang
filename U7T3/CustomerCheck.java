package U7T3;
import java.util.ArrayList;

public class CustomerCheck{
/** The check for a customer or group of customers.
  * Guaranteed to contain at least one MenuItem and all entries
  * are non-null
  */
    private ArrayList<MenuItem> check;
 
    public CustomerCheck(ArrayList<MenuItem> list){
        check = list;
    }
/** Returns the total of all MenuItem prices on the check */
    public double totalPrices(){
        double totalPrices = 0;
        for(int i = 0; i < check.size(); i ++){
            totalPrices += check.get(i).getPrice();
        }
        return totalPrices;
    }

  /* to be implemented in part (a) */  
 
/** Returns true if the restaurant’s coupon offer can be applied to this
  * check and returns false otherwise, as described in part (a)
 */
    public boolean couponApplies(){
        for(int i = 0; i < check.size(); i ++){
            if(check.get(i).isDailySpecial()){
                return false;
            }
        }
        if(totalPrices() < 40){
            return false;
        } 
        return true;
    }

  /* to be implemented in part (b) */  
 
/** Calculates the final cost of this check, as described in part (b) */
    public double calculateCheck(){
        double finalCost = totalPrices();
        int entreeCount = 0;
        if(couponApplies()){
            finalCost -= totalPrices() * 0.25;
        }
        for(int i = 0; i < check.size(); i ++){
            if(check.get(i).isEntree()){
                entreeCount ++;
            }
        }
        if(entreeCount >= 6){
            finalCost += finalCost * 0.2;
        }
        return finalCost;
    }

  /* to be implemented in part (c) */  
 
// There may be instance variables, constructors, and methods that are not shown.
}
