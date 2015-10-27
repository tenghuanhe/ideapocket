package pair1;

/**
 * Created by Administrator on 2015/10/19.
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);

        System.out.println("min = " + mm.getFirst());
        System.out.println("max= " + mm.getSecond());
        System.out.println(mm.getSecond().getClass().getName());
        System.out.println(ArrayAlg.getMiddle(words));

        String middle = ArrayAlg.getMiddle("Teng", "huan", "He");
        System.out.println(middle);
        double mid = ArrayAlg.getMiddle(12.3, 3.1, 3.4);
        System.out.println(mid);
    }
}

class ArrayAlg {
    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) return null;
        String max = a[0];
        String min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0)
                min = a[i];
            if (a[i].compareTo(max) > 0)
                max = a[i];
        }
        return new Pair<>(min, max);
    }

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    public static <T extends Comparable> T min(T[] a) {
        if (a == null || a.length == 0)
            return null;
        T smallest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (smallest.compareTo(a[i]) > 0)
                smallest = a[i];
        }

        return smallest;
    }
}

class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public T getSecond() {
        return this.second;
    }
}
