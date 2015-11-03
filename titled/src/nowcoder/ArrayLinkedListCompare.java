package nowcoder;

import java.util.*;

/**
 * Created by Administrator on 2015/10/31.
 */
public class ArrayLinkedListCompare {

    public static final int N = 50000;
    public static List values;

    static {
        Integer vals[] = new Integer[N];

        Random r = new Random();

        for (int i = 0; i < N; i++) {
            vals[i] = r.nextInt();
        }

        values = Arrays.asList(vals);
    }

    static long timeConsumption(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            int index = Collections.binarySearch(list, values.get(i));
        }

        return System.currentTimeMillis() - start;
    }

    public static void main(String[] args) {
        System.out.println(timeConsumption(new ArrayList(values)));
        System.out.println(timeConsumption(new LinkedList(values)));
    }
}
