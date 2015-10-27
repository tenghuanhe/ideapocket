package inherit;

/**
 * Created by tenghuanhe on 2015/10/27.
 */
public class Test {

    public static void main(String[] args) {
        S s = new S();
        s.printValue();
        A as = (A) s;
        as.printValue();
        as = new A();
        as.printValue();
    }
}

class A {
    public void printValue() {
        System.out.print("A");
    }
}

class S extends A {
    public void printValue() {
        System.out.print("S");
    }
}
