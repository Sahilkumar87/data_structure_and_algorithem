import java.util.Deque;
import java.util.LinkedList;
public class slidingWindowMax239 {

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0){
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n-k+1];
        Deque<Integer> deq = new LinkedList<>();

        for(int i = 0; i<n; i++){
            // 
            while(!deq.isEmpty() && deq.peek() < i-k+1){
                deq.poll();
            }
            while(!deq.isEmpty() && nums[deq.peekLast()] < nums[i]){
                deq.pollLast();
            }

            // adddd the current index to the deque
            deq.offer(i);

            // add the maxi element of the current window to the result
            if(i >= k-1){
                result[i-k+1] = nums[deq.peek()];
            }

        }
        return result;

        
    }
}
    
}
