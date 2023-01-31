import java.util.Stack;
/* The stack is a linear data structure that is used to store the collection of objects. 
It is based on Last-In-First-Out (LIFO). */

public class Stack_demo {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();

        stack.push("America");
        stack.push("Germany");
        stack.push("India");

        System.out.println("Stack => " + stack);
        System.out.println();

        System.out.println("Top Element => " + stack.peek());
        System.out.println();

        System.out.println("Stack => " + stack);
        System.out.println();

        System.out.println("Popped Element => " + stack.pop());
        System.out.println();

        System.out.println("Stack => " + stack);
        System.out.println();
    }
}
