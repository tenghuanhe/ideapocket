package graphc;

/**
 * Created by Administrator on 2015/10/27.
 */
public class Cycle {
    private boolean marked[];
    private boolean hasCycle;

    public Cycle(Graph G) {
        marked = new boolean[G.V()];
        for (int s = 0; s < G.V(); s++) {
            if (!marked[s])
                dfs(G, s, s);
        }
    }

    public void dfs(Graph G, int v, int u) {
        marked[v] = true;

        for (int w : G.adj(v)) {
            if (!marked[w])
                dfs(G, w, v);
            else if (w != u)        // v的邻接表中的w已经被访问过了，并且不等于父节点，说明存在环
                hasCycle = true;    // 从顶点v开始按照顺序依次访问与其邻接的顶点，如果这是我从v节点第一次访问w节点，但是发现它已经被访问过了，说明我在访问其他节点的时候已经通过环到达了这个点，也就是存在环
        }
    }

    public boolean hasCycle() {
        return hasCycle;
    }
}
