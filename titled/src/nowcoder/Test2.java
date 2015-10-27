package nowcoder;

/**
 * Created by Administrator on 2015/10/26.
 */
class Two {
    Byte x;
}

class Test2 {
    public static void main(String[] args) {
        Test2 p = new Test2();
        p.start();
    }

    void start() {
        Two t = new Two();
        System.out.print(t.x + "");
        Two t2 = fix(t);
        System.out.print(t.x + "" + t2.x);
    }

    Two fix(Two tt) {
        tt.x = 42;
        return tt;
    }
}
