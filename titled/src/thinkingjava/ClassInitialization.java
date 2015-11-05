package thinkingjava;

import java.util.Random;

/**
 * Created by Administrator on 2015/11/5.
 */
class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 47;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) {
        Class initable = Initable.class;
        System.out.println("After creatng Initable ref");
        System.out.println(Initable.staticFinal); //初始化被延迟到了对静态方法或者非晶态常数域进行首次调用才执行
        System.out.println(Initable.staticFinal2);

        System.out.println("----------");
        System.out.println(Initable2.staticNonFinal);

        System.out.println("----------");
        try {
            Class initable3 = Class.forName("thinkingjava.Initable3");
            System.out.println("After creating Initable3 ref");
            System.out.println(Initable3.staticNonFinal);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
