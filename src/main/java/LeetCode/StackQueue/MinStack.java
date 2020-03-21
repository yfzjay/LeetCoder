package LeetCode.StackQueue;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack=new Stack<>();
    private Stack<Integer> mins=new Stack<>();
    private int minn=Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int x) {
        stack.push(x);
        minn=Math.min(minn,x);
        mins.push(minn);
    }

    public void pop() {
        stack.pop();
        mins.pop();
        minn=mins.isEmpty()?Integer.MAX_VALUE:mins.peek();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return mins.peek();
    }
}
