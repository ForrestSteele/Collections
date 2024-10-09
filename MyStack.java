import java.util.Arrays;
/**
 * Write a description of class stackADT here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyStack
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class stackADT
     */
    private static int[] stack;
    private static int top;
    private static int maxsize;
    public MyStack()
    {
        // initialise instance variables
        maxsize = 15;
        stack = new int[maxsize];
        top = 0;
    }
    
    public static void push(int num) {
        stack[top] = num;
        top++;
    }
    
    public static int pop() {
        int value = stack[top];
        stack[top] = 0;
        top--;
        return value;
    }
    
    public static int size() {
        return top + 1;
    }
    
    public static int top() {
        return stack[top - 1];
    }

    public static boolean isEmpty() {
        return top == 0;
    }
    
    public static boolean isFull() {
        return top == maxsize - 1;
    }
    
    public String toString() {
        return Arrays.toString(stack);
    }
    
}
