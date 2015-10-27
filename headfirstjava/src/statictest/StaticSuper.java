package statictest;

/**
 * Created by tenghuanhe on 2015/10/21.
 */
public class StaticSuper {
    static {
        System.out.println("super static block");
    }

    StaticSuper() {
        System.out.println("super constructor");
    }
}
