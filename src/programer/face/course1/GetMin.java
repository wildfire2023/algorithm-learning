package programer.face.course1;

import java.util.Stack;

public class GetMin {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public GetMin() {
        this.dataStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public Integer pop() {
        if (dataStack.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        int value = this.dataStack.pop();
        if (value == getMin()) {
            this.minStack.pop();
        }
        return value;
    }

    public void push(Integer value) {
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else if (value <= getMin()) {
            this.minStack.push(value);
        }
        this.dataStack.push(value);
    }

    public Integer getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        return minStack.peek();
    }
}
