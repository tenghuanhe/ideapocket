package testbox;

/**
 * Created by tenghuanhe on 2015/10/21.
 */
public class TestBox {
    Integer i; // i�Ǳ���ʼ��Ϊ��null
    int j;     // j�򱻳�ʼ��Ϊ��0

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
        t.go2();
    }

    public void go() {
        j = i; // i = null��������Żᷢ��NullPointerException
        System.out.println(j);
        System.out.println(i);
    }

    public void go2() {
        System.out.println(j);
        System.out.println(i);
    }
}
