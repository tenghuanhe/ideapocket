package threadtest;

/**
 * Created by tenghuanhe on 2015/10/27.
 */
public class MyThread implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyThread());
        t.start();
        System.out.println("m1");
        t.join();
        System.out.println("m2");
    }

    @Override
    public void run() {
        System.out.println("r1");
        System.out.println("r2");
    }
}
