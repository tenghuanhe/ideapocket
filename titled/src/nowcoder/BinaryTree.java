package nowcoder;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2015/10/26.
 */
public class BinaryTree {
    public int value;
    public BinaryTree leftChild;
    public BinaryTree rightChild;

    public BinaryTree(int value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public static void main(String[] args) {
        BinaryTree p1 = new BinaryTree(20);
        BinaryTree p2 = new BinaryTree(1);
        BinaryTree p3 = new BinaryTree(30);
        BinaryTree p4 = new BinaryTree(22);
        p1.leftChild = p2;
        p1.rightChild = p3;
        p2.leftChild = p4;


        levelTraverse(p1);
    }

    public static void levelTraverse(BinaryTree bTree) {
        if (bTree == null)
            return;
        int max = bTree.value;
        int min = bTree.value;

        Queue<BinaryTree> queue = new LinkedList<>();

        queue.offer(bTree);

        while (!queue.isEmpty()) {
            BinaryTree pNode = queue.poll();

            if (pNode.value > max)
                max = pNode.value;
            if (pNode.value < min)
                min = pNode.value;

            if (pNode.leftChild != null)
                queue.offer(pNode.leftChild);
            if (pNode.rightChild != null)
                queue.offer(pNode.rightChild);
        }

        System.out.println(max - min);
    }

}
