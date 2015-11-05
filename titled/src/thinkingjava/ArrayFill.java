package thinkingjava;

import java.util.Arrays;

/**
 * Created by Administrator on 2015/11/5.
 */
public class ArrayFill {
    public static void main(String[] args) {
        String[] a9 = new String[6];
        String str = new String("Hello");
        Arrays.fill(a9, str);

        System.out.println(a9);
        System.out.println(Arrays.toString(a9));
        a9[1] = new String("World");
        System.out.println(Arrays.toString(a9));
    }
}
