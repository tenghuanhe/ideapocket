package thinkingjava;

/**
 * Created by Administrator on 2015/11/3.
 */
class SimpleException extends Exception {
}

public class InheritingException {
    public void f() throws SimpleException {
        System.out.println("Throws SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String args[]) {
        InheritingException sed = new InheritingException();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }
}

