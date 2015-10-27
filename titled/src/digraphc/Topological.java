package digraphc;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Administrator on 2015/10/27.
 */
public class Topological {
    private Iterable<Integer> order;

    public Topological(Digraph G) {
        DirectedCycle cyclefinder = new DirectedCycle(G);
        if (!cyclefinder.hasCycle()) {
            DepthFirstOrder dfo = new DepthFirstOrder(G);
            order = dfo.reversePost();
        }
    }

    public Iterable<Integer> order() {
        return order;
    }

    public boolean isDAG() {
        return order != null;
    }


    public static void main(String[] args) {
        String filename = args[0];
        String separator = args[1];

        SymbolGraph sg = new SymbolGraph(filename, separator);
        Topological top = new Topological(sg.G());

        for (int v : top.order()) {
            StdOut.println(sg.name(v));
        }

    }
}
