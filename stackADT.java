
/**
 * Write a description of class stackADT here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class stackADT
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class stackADT
     */
    private int[] stack;
    private int top;
    private int maxsize;
    public stackADT()
    {
        // initialise instance variables
        maxsize = 15;
        stack = new int[maxsize];
        top = 0;
    }
    
    public void push(int num) {
        stack[top] = num;
        top++;
    }
    
    public int pop() {
        int value = stack[top];
        stack[top] = 0;
        top--;
        return value;
    }
    
    public int size() {
        return top + 1;
    }
    
    public int top() {
        return stack[top];
    }

    public boolean isEmpty() {
        return top == 0;
    }
    
    public boolean isFull() {
        return top == maxsize - 1;
    }
    
    public String toString() {
        String contents = " ";
        for (int i = 0; i < size(); i++) {
            contents += stack[i];
        }
        return contents;
    }
    
}
