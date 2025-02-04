import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(30);
        nums.add(25);
        nums.add(40);
        nums.add(55);
        nums.add(45);
        nums.add(20);
        int sum = 0;
        for(int i = 0; i < nums.size(); i ++){
          sum += nums.get(i);
        }
        System.out.println(sum);    
    }
}