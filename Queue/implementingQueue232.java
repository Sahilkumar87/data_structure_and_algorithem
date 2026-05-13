import java.util.ArrayDeque;
import java.util.Deque;

public class implementingQueue232 {class MyQueue {
    private Deque<Integer> inStack;
    private Deque<Integer> outStack;


    public MyQueue() {
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
        
    }
    // Enqueue (O(1))
    public void push(int x) {
        inStack.push(x);
        
    }
    
    public int pop() {
        moveIfNeeded();
        return outStack.pop();
        
    }
    // Peek front (Amortized O(1))
    public int peek() {
        moveIfNeeded();
        return outStack.peek();
        
    }
    // Check empty
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
                                      
        
    }
    private void moveIfNeeded(){
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }

    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

    
}
