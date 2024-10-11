import java.util.Arrays;
/**
 * Write a description of class MyQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyQueue
{
    // instance variables - replace the example below with your own
    private int front;
    private int back;
    private int[] queue;
    private int size;
    private int count;
    private int maxsize;
    /**
     * Constructor for objects of class MyQueue
     */
    public MyQueue(int size)
    {
        size = 8;
        maxsize = size;
        queue = new int[maxsize];
        front = 0;
        back = 0;
    }
    
    public void enqueue(int num) {
        queue[back + 1] = num;
        count++;
        back++;
    }
    
    public int dequeue() {
        int value = queue[front];
        queue[front] = 0;
        front++;
        back++;
        count--;
        return back;
    }
    
    public int front() {
        return queue[front];
    }
    
    public int size() {
        return count;
    }
    
    public boolean isEmpty() {
        return count != 0;
    }
    
    public boolean isFull() {
        return count == maxsize;
    }
    
    public String toString() {
        return Arrays.toString(queue);
    }
    
}
