package testbox;

/**
 * Created by tenghuanhe on 2015/10/21.
 */
public class TestBox {
    Integer i; // i是被初始化为了null
    int j;     // j则被初始化为了0

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
        t.go2();
    }

    public void go() {
        j = i; // i = null所以这里才会发生NullPointerException
        System.out.println(j);
        System.out.println(i);
    }

    public void go2() {
        System.out.println(j);
        System.out.println(i);
    }
}
