package heapoom;

/**
 * Created by tenghuanhe on 2015/10/26.
 */
public class JavaVMStackOOM {
    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }

    private void dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });

            thread.start();
        }
    }
}
