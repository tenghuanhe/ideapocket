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
            else if (w != u)        // v���ڽӱ��е�w�Ѿ������ʹ��ˣ����Ҳ����ڸ��ڵ㣬˵�����ڻ�
                hasCycle = true;    // �Ӷ���v��ʼ����˳�����η��������ڽӵĶ��㣬��������Ҵ�v�ڵ��һ�η���w�ڵ㣬���Ƿ������Ѿ������ʹ��ˣ�˵�����ڷ��������ڵ��ʱ���Ѿ�ͨ��������������㣬Ҳ���Ǵ��ڻ�
        }
    }

    public boolean hasCycle() {
        return hasCycle;
    }
}
