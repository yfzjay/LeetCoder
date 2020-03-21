package LeetCode.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> queue=new LinkedList<>();
    /** Initialize your data structure here. */
    public MyStack() {    }
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        int cnt=queue.size()-1;
        while(cnt-->0){
            queue.add(queue.remove());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
