import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by tenghuanhe on 2015/10/27.
 */
public class GraphTest {

    public static void main(String[] args) {

        Graph G = new Graph(new In(args[0]));
        System.out.println(G);

        DepthFirstSearch dfs = new DepthFirstSearch(G, 7);
        System.out.println(dfs.count());

        DepthFirstPaths dfp = new DepthFirstPaths(G, 0);
        for (int v = 0; v < G.V(); v++) {
            StdOut.print(0 + " to " + v + ": ");
            if (dfp.hasPathTo(v))
                for (int x : dfp.pathTo(v))
                    if (x == 0) StdOut.print(x);
                    else StdOut.print(x + "-");
            StdOut.println();
        }
        BreadFirstPaths bfp = new BreadFirstPaths(G, 0);
        for (int v = 0; v < G.V(); v++) {
            StdOut.print(0 + " to " + v + ": ");
            if (bfp.hasPathTo(v))
                for (int x : bfp.pathTo(v))
                    if (x == 0) StdOut.print(x);
                    else StdOut.print(x + "-");
            StdOut.println();
        }
    }

    public static int degree(Graph G, int v) {
        int degree = 0;
        for (int w : G.adj(v))
            degree++;
        return degree;
    }

    public static int maxDegree(Graph G) {
        int max = 0;
        for (int v = 0; v < G.V(); v++) {
            if (degree(G, v) > max)
                max = degree(G, v);
        }

        return max;
    }

    public static double avgDegree(Graph G) {
        return 2.0 * G.E() / G.V();
    }

    public static int numbersOfSelfLoops(Graph G) {
        int count = 0;
        for (int v = 0; v < G.V(); v++)
            for (int w : G.adj(v))
                if (w == v) count++;

        return count / 2;
    }
}
