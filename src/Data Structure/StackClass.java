package DataStructure;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> st = new Stack();
        st.push("I");
        st.push("Ate");
        st.push("Egg");
        st.push("On");
        st.push("Breakfast");
        System.out.println("Element on top :"+st.peek());
        for(String st1 : st){
            System.out.println("Stack element: "+ st1);

        }
        System.out.println("\n");
        System.out.println("Printing elements after popping from stack");
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
