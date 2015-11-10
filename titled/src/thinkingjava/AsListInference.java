package thinkingjava;

import java.util.*;

/**
 * Created by Administrator on 2015/11/5.
 */
class Snow {
}

class Podwer extends Snow {
}

class Light extends Podwer {
}

class Heavy extends Podwer {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Podwer());
        List<Snow> snow2 = Arrays.asList(new Crusty(), new Light());

        List<Snow> snow3 = Arrays.asList(new Light(), new Heavy());

        List<Snow> snow4 = new ArrayList<>();
        Collections.addAll(snow4, new Light(), new Heavy());

        List<Snow> snow5 = Arrays.<Snow>asList(new Light(), new Heavy());

        Vector<Integer> vint = new Vector<Integer>(1);
    }

}
