package heapoom;

import java.util.ArrayList;

/**
 * Created by tenghuanhe on 2015/10/26.
 */
public class HeapOOM {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }

    static class OOMObject {
    }

}
