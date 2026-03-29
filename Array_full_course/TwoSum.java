import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        
    }

    public int[] twoSum(int[] nums, int target){
        // Create a hashmap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // iterate through the array
        for(int i = 0; i<nums.length; i++){
            // calculate the complement of the current number
            int complement = target -nums[i];

            //check if the complemnet is already in the map
            if(map.containsKey(complement)){
                // if found , return the indices of the complement
                //and the current number
                return new int[] {map.get(complement), i};
            }
            //otherwise add the current number and its index to the map
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    
}
