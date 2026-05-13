import java.util.LinkedList;
import java.util.Queue;

public class ImplementStack {
    class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    // Push element x into stack
    public void push(int x) {
        // Step: add to q2
        q2.offer(x);

        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        // Stepa:3 Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    

    // Removes the element on top of the stack and return it
    public int pop() {
        return q1.poll();
    }
    

    public int top() {
        return q1.peek();
        
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
