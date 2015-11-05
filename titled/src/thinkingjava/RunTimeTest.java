package thinkingjava;

/**
 * Created by Administrator on 2015/11/4.
 */
public class RunTimeTest {
    static void f() {
        System.out.println("Hello from f()");
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
        System.out.println("Hello from g()");
    }

    public static void main(String[] args) {
        g();
    }
}
