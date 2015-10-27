package heapoom;

/**
 * Created by tenghuanhe on 2015/10/26.
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();

        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("Stack length: " + oom.stackLength);
            throw e;
        }

    }

    private void stackLeak() {
        stackLength++;
        stackLeak();
    }
}
