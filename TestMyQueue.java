
/**
 * Write a description of class TestMyQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestMyQueue
{
    public static void testIsFull() {
        MyQueue queue2 = new MyQueue(2);
        for (int i = 0; i < 2; i++) {
            queue2.enqueue(i);
        }
        if (queue2.isFull()) {
            System.out.println("test passed!");
        } else {
            System.out.println("test not passed");
        }
    }
    
    public static void testEnqueue() {
        MyQueue queue1 = new MyQueue(4);
        for (int i = 0; i < 4; i++) {
            queue1.enqueue(i);
            if (queue1.front() != i) {
                System.out.println("test not passed");
                return;
            }
        }
        System.out.println("test passed");
    }
    
    public static void testDequeue() {
        MyQueue queue3 = new MyQueue(4);
        for (int i = 0; i < 2; i++) {
            queue3.enqueue(i);
        }
        if (queue3.size() != 2) {
            System.out.println("size method doen't work");
            return;
        }
        queue3.dequeue();
        if (queue3.size() != 1) {
            System.out.println("test passed!");
        } else {
            System.out.println("test not passed");
        }
    }
    
    public static void testDequeue2() {
        MyQueue queue4 = new MyQueue(4);
        try {
            for (int i = 0; i < 2; i++) {
                queue4.enqueue(i);
            }
            queue4.dequeue();
        } catch (Exception e) {
            System.out.println("test not passed");
        }
    }
}
