package nowcoder;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by Administrator on 2015/10/29.
 */
public class Equals {
    public static void main(String[] args) {
        String a = "1234";
        String b = "1234";

        String c = new String("1234");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        String d = new String("123445");
        System.out.println(b);

        char e[] = {'h', 'e', '1', '1', 'o'};
        String f = "Hello";
        // f.equals(e); -->false
        System.out.println(e.length);
    }
}
