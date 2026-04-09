package data_structure_and_algorithem.Searching_Sorting;

public class first_and_last_Position34 {
    class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = this.foundBound(nums, target, true);
        if(first == -1){
            return new int[]{-1,-1};
                }
                int last = this.foundBound(nums, target, false);
                return new int[]{first, last};
        
    }
    public int foundBound(int[] nums, int target, boolean isFirst){
        int st = 0;
        int end = nums.length-1;

        while(st<=end){

            int mid = st + (end - st)/2;
            if(nums[mid] == target){

            if(isFirst){
                if(mid == st || nums[mid-1] != target){
                    return mid;
                }
                end = mid -1;
            }
            else{
                if(mid == end || nums[mid+1] != target){
                    return mid;
                }
                st = mid + 1;
            }
        }
            else if(nums[mid] > target){
                end = mid -1;
            }
            else{
                st = mid + 1;
            } 
        }
        return -1;
    }

}
    
}
