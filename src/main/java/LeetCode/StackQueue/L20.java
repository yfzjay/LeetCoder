package LeetCode.StackQueue;

import java.util.Stack;

public class L20 {

    private Stack stack=new Stack();

    public boolean isValid(String s) {

        boolean f=true;
        for(char c:s.toCharArray()){
            if(c=='['||c=='('||c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                char cs= (char) stack.pop();
                switch (c){
                    case ')':
                        f= cs=='(';
                        break;
                    case ']':
                        f=cs=='[';
                        break;
                    case '}':
                        f= cs=='{';
                }
            }
            if(f==false) break;
        }
        if(!stack.isEmpty()) f=false;
        return f;
    }
}
