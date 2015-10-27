package digraphc;

import java.util.Stack;

/**
 * Created by Administrator on 2015/10/27.
 */
public class DepthFirstDirectedPaths {
    private final int s;
    private boolean marked[];
    private int edgeTo[];

    public DepthFirstDirectedPaths(Digraph G, int s) {
        this.s = s;
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        dfdp(G, s);
    }

    private void dfdp(Digraph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfdp(G, w);
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v))
            return null;
        Stack<Integer> path = new Stack<>();

        for (int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);

        return path;
    }
}
