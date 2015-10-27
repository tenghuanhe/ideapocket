package graphc;

import edu.princeton.cs.algs4.In;

/**
 * Created by Administrator on 2015/10/27.
 */
public class GraphTest {
    public static void main(String[] args) {
        Graph G = new Graph(new In(args[0]));
        Cycle cycle = new Cycle(G);
        System.out.println(cycle.hasCycle());
    }
}
