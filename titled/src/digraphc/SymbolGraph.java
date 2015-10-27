package digraphc;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import graphc.Graph;

/**
 * Created by Administrator on 2015/10/27.
 */
public class SymbolGraph {
    private ST<String, Integer> st;
    private String[] keys;
    private Digraph G;

    public static void main(String[] args) {
        String filename = args[0];
        String delim = args[1];
        SymbolGraph sg = new SymbolGraph(filename, delim);

        Digraph G = sg.G();

        while (StdIn.hasNextLine()) {
            String source = StdIn.readLine();
            if (!sg.contains(source))
                continue;
            for (int w : G.adj(sg.index(source)))
                StdOut.println(" " + sg.name(w));
        }
    }

    public SymbolGraph(String stream, String sp) {
        st = new ST<>();
        In in = new In(stream);
        while (in.hasNextLine()) {
            String[] a = in.readLine().split(sp);
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
                if (!st.contains(a[i]))
                    st.put(a[i], st.size());
            }
        }

        keys = new String[st.size()];

        for (String name : st.keys())
            keys[st.get(name)] = name;
        G = new Digraph(st.size());
        in = new In(stream);
        while (in.hasNextLine()) {
            String[] a = in.readLine().split(sp);
            int v = st.get(a[0]);

            for (int i = 1; i < a.length; i++) {
                G.addEdge(v, st.get(a[i]));
            }
        }
    }

    public boolean contains(String s) {
        return st.contains(s);
    }

    public int index(String s) {
        return st.get(s);
    }

    public String name(int v) {
        return keys[v];
    }

    public Digraph G() {
        return G;
    }
}
