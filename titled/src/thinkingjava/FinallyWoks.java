package thinkingjava;

/**
 * Created by Administrator on 2015/11/4.
 */
class ThreeException extends Exception {
}

public class FinallyWoks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0) {
                    throw new ThreeException();
                }
                System.out.println("No exception");
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            } finally {
                System.out.println("Finally works");
                if (count == 10)
                    break;
            }

        }
    }
}
