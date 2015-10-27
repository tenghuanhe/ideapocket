package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 2015/10/23.
 */
public class Test4 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) c.add(i);
        for (Integer i : c) System.out.print(i + ". ");
        System.out.println();

        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            d.add(i);
        }
        for (Integer i : d) System.out.print(i + ". ");
    }
}
