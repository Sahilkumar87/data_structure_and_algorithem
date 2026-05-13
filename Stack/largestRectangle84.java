import java.util.Stack;

public class largestRectangle84 {
    class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;

        for(int i = 0; i<=n; i++){
            int currentHeight = (i == n) ? 0 : heights[i];
            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() -1;
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);

        }
        return maxArea;
        
    }
} 
    
}
