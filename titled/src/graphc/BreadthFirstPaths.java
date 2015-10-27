package graphc;

import edu.princeton.cs.algs4.Queue;

import java.util.Stack;

/**
 * Created by Administrator on 2015/10/27.
 */
public class BreadthFirstPaths {
    private final int s;
    private boolean marked[];
    private int edgeTo[];

    public BreadthFirstPaths(Graph G, int s) {
        this.s = s;
        this.marked = new boolean[G.V()];
        this.edgeTo = new int[G.V()];
        bfp(G, s);
    }

    private void bfp(Graph G, int s) {
        Queue<Integer> queue = new Queue<>();
        marked[s] = true;
        queue.enqueue(s);

        while (!queue.isEmpty()) {
            int v = queue.dequeue();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    queue.enqueue(w);
                    edgeTo[w] = v;
                    marked[w] = true;
                }
            }
        }

    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!marked[v])
            return null;

        Stack<Integer> path = new Stack<>();
        for (int x = v; x != s; x = edgeTo[x])
            path.push(x);
        path.push(s);

        return path;
    }
}
