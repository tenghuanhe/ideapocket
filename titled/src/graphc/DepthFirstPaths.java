package graphc;

import java.util.Stack;

/**
 * Created by Administrator on 2015/10/27.
 */
public class DepthFirstPaths {
    private final int s;
    private boolean marked[];
    private int edgeTo[];

    public DepthFirstPaths(Graph G, int s) {
        this.s = s;
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];

        dfp(G, s);
    }

    private void dfp(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v))
            if (!marked[w]) {
                edgeTo[w] = v;
                dfp(G, w);
            }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<>();

        for (int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);

        return path;
    }


}
