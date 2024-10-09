
/**
 * Write a description of class testMyStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testMyStack
{
    public testMyStack() {
    }
    public static void testTop() {
        MyStack stack1 = new MyStack();
    }
    
    public static void testPushTop () {
        MyStack stack1 = new MyStack();
        for (int i = 0; i < 4; i++) {
            stack1.push(i);
            if (stack1.top() != i) {
                System.out.println("test not passed");
                break;
            }
        }
        System.out.println("test passed!");
    }
    
    public static void testPop () {
        MyStack stack1 = new MyStack();
        for (int i = 0; i < 4; i++) {
            stack1.push(i);
            if (stack1.top() != i) {
                System.out.println("test not passed");
                break;
            }
        }
        System.out.println("test passed!");
    }
    
}
