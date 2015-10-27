package HeapOOM;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/10/25.
 */
public class HeapOOM {
    static class OOMObject {
        public static void main(String[] args) {
            List<OOMObject> list = new ArrayList<OOMObject>();

            while (true) {
                list.add(new OOMObject());
            }
        }
    }
}
