package thinkingjava;

/**
 * Created by Administrator on 2015/11/4.
 */
public class Ex10 {

    public static void f() throws MySecondException {

        try {
            g();
        } catch (MyFirstException e) {
            e.printStackTrace();
            // throw new MySecondException();
            throw new RuntimeException(e);
        }

    }

    public static void g() throws MyFirstException {
        throw new MyFirstException();
    }

    public static void main(String[] args) {

        try {
            f();
        } catch (MySecondException e) {
            e.printStackTrace();
        }

    }
}

class MyFirstException extends Exception {

}

class MySecondException extends Exception {

}
