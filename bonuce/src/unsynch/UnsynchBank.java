package unsynch;

/**
 * Created by tenghuanhe on 2015/10/26.
 */
public class UnsynchBank {
    public static final int NACCOUNTS = 100;
    public static final double INITOAL_BALANCE = 100;

    public static void main(String[] args) {
        Bank b = new Bank(NACCOUNTS, INITOAL_BALANCE);
        int i;
        for (i = 0; i < NACCOUNTS; i++) {
            TransferRunnable r = new TransferRunnable(b, i, INITOAL_BALANCE);
            Thread t = new Thread(r);
            t.start();
        }
    }
}
