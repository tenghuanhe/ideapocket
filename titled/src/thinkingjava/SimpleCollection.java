package thinkingjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by Administrator on 2015/11/5.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c = new LinkedList<>();
        c = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            c.add(i * i);
        }

        for (Integer i : c)
            System.out.print(i + ", ");
    }
}
