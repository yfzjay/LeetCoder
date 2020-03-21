package LeetCode.StackQueue;

import java.util.Stack;

public class MyQueue {
    //用栈实现队列 两个栈实现
    private Stack<Integer> in=new Stack<>();
    private Stack<Integer> out=new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue() {

    }
    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        loop();
        return out.pop();
    }
    private void loop(){
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
    }
    /** Get the front element. */
    public int peek() {
        loop();
        return  out.peek();
    }
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return in.isEmpty()&&out.isEmpty();
    }
}
