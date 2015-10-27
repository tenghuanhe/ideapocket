package nowcoder;

/**
 * Created by Administrator on 2015/10/26.
 */
public class Test3 {
    public int add(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("catchÓï¾ä¿é");
        } finally {
            System.out.println("finallyÓï¾ä¿é");
        }
        return 0;
    }

    public static void main(String argv[]) {
        Test3 test = new Test3();
        System.out.println("ºÍÊÇ£º" + test.add(9, 34));
    }
}