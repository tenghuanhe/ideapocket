package nowcoder;

/**
 * Created by Administrator on 2015/10/26.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 2, 1, 5, 7, 22, 12};

        for (int i : a)
            System.out.print(i + " ");

        System.out.println();
        sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void sort(int[] a, int lo, int hi) {
        if (hi <= lo)
            return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    public static int partition(int[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        int v = a[lo];

        while (true) {
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;

            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        System.out.println(a[lo] + " " + a[j]);
        return j;
    }

    public static void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean less(int v, int w) {
        return v < w;
    }
}
