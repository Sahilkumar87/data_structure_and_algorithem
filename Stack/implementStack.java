import java.util.ArrayList;
import java.util.Stack;

public class implementStack {
    private ArrayList<Integer> items;

    public implementStack( int item){
        items = new ArrayList<>();
    }

    public Integer pop(){
        if(!isEmpty()){
            return items.remove(items.size()-1);
        }
        return null;
    }

    public void push(int item) {
        items.add(item);
    }

    public Integer peek() {
        if (!isEmpty()) {
            return items.get(items.size() - 1);
        }

        return null;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }


    public static void main(String[] args) {
        Stack stack = new Stack();

        // pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // peeking at the top element
        System.out.println("Top element: " + stack.peek());


        // poping the element form the stack
        System.out.println("Top element: " + stack.pop());
        System.out.println("Top element: " + stack.pop());
        System.out.println("Top element: " + stack.pop());
        System.out.println("Top element: " + stack.pop());


        // checking the top element after poping
        System.out.println("Top element after poping : " + stack.peek());
    }

}
