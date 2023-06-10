import java.util.*;
public class CStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        // stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack);
        stack.pop();
        // stack.clear();/
        stack.remove(Integer.valueOf(4));
        stack.add(100);
        // stack.clone();
        System.out.println(stack.indexOf(2));
        // stack.pop();
        for(Integer e:stack)
        {
            System.out.println(e);
        }
        // System.out.println(stack);
        // System.out.println(stack.firstElement());


    }
}
