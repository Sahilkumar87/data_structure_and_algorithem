import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        
    }

    public boolean ContainsDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        for(int num : nums){
            if(seenNumbers.contains(num)){
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
        
    }
}
    

