package concurrent;

/**
 * Created by Administrator on 2015/10/23.
 */
public class Exercise1 implements Runnable {
    private static int taskCount = 0;
    private final int taskid = taskCount++;

    public Exercise1() {
        System.out.println(taskid + " Runnable starting");
    }

    @Override
    public void run() {
        System.out.println("                                " + taskid + " Hello World");
        Thread.yield();
    }

}
