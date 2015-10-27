package heapoom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tenghuanhe on 2015/10/26.
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        int i = 0;

        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
