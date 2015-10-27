package concurrent;

/**
 * Created by Administrator on 2015/10/23.
 */
public class BasicThreads {
    public static void main(String[] args)
    {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
