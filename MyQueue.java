
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
    /**
     * Constructor for objects of class MyQueue
     */
    public MyQueue()
    {
        size = 8;
        queue = new int[15];
        front = 0;
        back = 0;
    }
    
    public void enqueue(int num) {
        for (int i = 0; i < size; i++) {
            queue[i] = queue[i - 1];
        }
        queue[back%count] = num;
    }
    
    public void dequeue() {
        queue[back] = 0;
        back--;
        count--;
    }
}
