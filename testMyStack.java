// one hundred

/**
 * Write a description of class testMyStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testMyStack
{
    public static void testPushTop () {
        MyStack stack1 = new MyStack(4);
        for (int i = 0; i < 2; i++) {
            stack1.push(i);
            if (stack1.top() != i) {
                System.out.println("test not passed");
                return;
            }
        }
        System.out.println("test passed!");
    }
    
    public static void testPop () {
        try {
        MyStack stack1 = new MyStack(4);
            for (int i = 0; i < 2; i++) {
                stack1.push(i);
                if (stack1.top() != i) {
                    System.out.println("test not passed");
                    return;
                }
            }
            System.out.println("test passed!");
        } catch (Exception e){
            System.out.print("");
        }
    }
    
    public static void testIsEmpty() {
        MyStack stack3 = new MyStack(4);
        if (stack3.size() != 0) {
            System.out.println("test not passed");
            return;
        }
        stack3.push(3);
        if (stack3.size() != 1) {
            System.out.println("test not passed");
            return;
        }
        System.out.println("test passed!");
    }
    
}
