package mathtest;

/**
 * Created by tenghuanhe on 2015/10/21.
 */
public class MathTest {
    private static int size;
    private int ssize;

    public static void main(String[] args) {
        System.out.println(size);
//        System.out.println(ssize); Non-static variable ssize cannot be referenced from a static context
        // 静态方法使用情况：1.参数中只有静态变量；2.参数中没有实例变量 3.工厂方法？
        // 静态方法还有一种常见的使用情况，NumberFormat类使用工厂方法产生不同风格的子类格式对象(由于构造器的限制原因)

        // 静态变量是在类被加载的时候初始化的。类被加载是因为Java虚拟机认为他该被加载了。
    }
}
