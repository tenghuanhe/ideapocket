package unsynch;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by tenghuanhe on 2015/10/26.
 */
public class Bank {
    private final double[] accounts;
    private Lock bankLock = new ReentrantLock();

    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        for (int i = 0; i < n; i++) {
            accounts[i] = initialBalance;
        }
    }

    public synchronized void transfer(int from, int to, double amount) throws InterruptedException {
        while (accounts[from] < amount)
            wait();
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d ", amount, from, to);
        accounts[to] += amount;
        System.out.printf("Total balance: %10.2f%n", getTotalBalance());
        notifyAll();
    }

    public double getTotalBalance() {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }

    public int size() {
        return accounts.length;
    }
}
